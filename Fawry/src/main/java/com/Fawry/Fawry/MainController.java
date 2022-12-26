package com.Fawry.Fawry;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Admination.*;
import Form.*;
import Form.Fields.*;
import Payment.*;
import Services.*;
import UsersData.*;
import User.*;
import ServicesProvider.*;

@RestController
public class MainController {

	// There are some instances to start some of our web service  

	// All users should be stored in a class 
	usersData usersdata = new usersData();

	//Create Services Factory && Service Provider Factory
	ServiceFactory serviceFactory = new ServiceFactory();
	ServiceProviderFactory spFactory = new ServiceProviderFactory();
	// we have 4 initial services  
	Service mobileRecharge;
	Service internetPaymnet;
	Service landLine;
	Service Donation;
	int payID = 0;
	Admin admin = new Admin(); 
	// one search class to search through services
	Search searcher = new Search();

	
	// this function will act like the Main function in normal console application
	void intiateMain() {

		mobileRecharge = serviceFactory.createService("Mobile recharge");
		internetPaymnet = serviceFactory.createService("Internet Payment");
		landLine = serviceFactory.createService("Landline");
		Donation = serviceFactory.createService("Donations");
		searcher.addService(mobileRecharge);
		searcher.addService(internetPaymnet);
		searcher.addService(landLine);
		searcher.addService(Donation);
	}


	@PostMapping("/signup")
	String signUp(@RequestBody Map <String,String> JSON){

		String userName = JSON.get("username").toString();
		String email = JSON.get("email").toString();
		String password = JSON.get("password").toString();

		Authentication signup = new SignUp(usersdata,email,password,userName);
		
		if(signup.Join()){
			return "Signed-Up successfully";
		}
		else {
			return "E-mail already exists";
		}

	}

	@PostMapping("/signin")
	String signIn(@RequestBody Map <String,String> JSON){

		String email = JSON.get("email").toString();
		String password = JSON.get("password").toString();

		Authentication signIn = new SignIn(usersdata,email,password);

		if(signIn.Join()){
			return "Signed-In successfully";
		}
		else {
			return "Wrong password or email";
		}
	}



	@GetMapping("/search/{name}")
	List<Service> search(@PathVariable("name") String serviceName){
		intiateMain();
		return searcher.searchByName(serviceName);
	}

	@PostMapping("/admin/addsp")
	String addServiceProvider(@RequestBody Map <String,String> json){

		String name = json.get("name").toString();
		String serviceName = json.get("serviceName").toString();
//		System.out.print(serviceName);
//		Service service = serviceFactory.createService(serviceName);
//		System.out.println(service.getName());
		long number = Long.parseLong(json.get("number").toString());
		int formComponentsNumber = Integer.parseInt(json.get("formComponentsNumber"));
		form sForm = new form();
		String fieldsContainer = "formComponent";
		for(int i = 0;i < formComponentsNumber ;i++) {
			String tmp = fieldsContainer + String.valueOf(i);
			String fieldDetail = json.get(tmp).toString();
			FieldFactory fieldFactory = new FieldFactory();
			Field field = fieldFactory.createField(fieldDetail.charAt(0),fieldDetail.substring(1));
			sForm.addComponent(field);
		}
		ServiceProvider serviceProvider = spFactory.createServiceProvider(name,serviceFactory.createService(serviceName),number,sForm);
		System.out.println(serviceProvider.getName() + " " + serviceProvider.getNumber() + " " + serviceProvider.getServiceName() + " " + serviceProvider.getServiceAcceptance());
		return serviceFactory.createService(serviceName).addServiceProvider(serviceProvider);
	}

	@PostMapping("/walletrecharge")
	String addToWallet(@RequestBody Map <String,String> json){

		String userName = json.get("username").toString();

		userInfo user = usersdata.getByUserName(userName);

		int amount = Integer.parseInt(json.get("amount").toString());
		
//		System.out.println(amount);
		
		return user.getCredits().chargeWallet(payID++,amount);
	}
	
	@PostMapping("/payservice")
	String payForService(@RequestBody Map <String,String> json) {
		String email = json.get("email").toString();
		String password = json.get("password").toString();
		Authentication signIn = new SignIn(usersdata,email,password);
		String paymentMethod = "";
		if(json.containsKey("paymentMethod")){
			paymentMethod = json.get("paymentMethod").toString();
		}
		
		if(signIn.Join()){
            userInfo user = usersdata.GetUserByUserEmail(email);
            long spNumber =  Long.parseLong(json.get("spnumber").toString());
            String serviceName = json.get("servicename").toString();
            ServiceFactory serviceFactory = new ServiceFactory();
            Service service = serviceFactory.createService(serviceName);
            boolean la2eeto = false;
            for(ServiceProvider sp : service.getSPs()){
            	if(sp.getNumber() == spNumber) {
            		if(paymentMethod.equals("cash")  && service.isAcceptingCash()){
            			Cash cashPayment = new Cash(payID,service);
            			user.getCredits().addPayments(cashPayment);
            		}
            		else if (paymentMethod.equals("cash") && !service.isAcceptingCash()) {
            			return "service cannot accept cash";
            		}
            		else if (paymentMethod.equals("wallet")){
            			Wallet walletPayment = new Wallet(payID,service);
            			user.getCredits().addPayments(walletPayment);
            		}
            		else{
            			CreditCard creditPayment = new CreditCard(payID,service);
            			user.getCredits().addPayments(creditPayment);
            		}
            		payID++;
            		la2eeto = true;
            		return sp.getF().display();
            	}
            }
            if(!la2eeto) {
            	return "Invalid Service Provider Number";
            }
        }
        return "Wrong password or email";
	}


	
	
	
	
	@GetMapping("/admin/ShowUserPayment/{username}") 
	List<String> ShowUserPayment(@PathVariable("username") String username)
	{
		List <String> paymentsDefinition = new ArrayList<String>();
		userInfo userinfo = usersdata.getByUserName(username);
		for(payment p : userinfo.getCredits().getHistoryPayments() ) {
			paymentsDefinition.add(p.display());
		}
		return paymentsDefinition;
	}
	
	
	
	@GetMapping("/admin/ShowUserRefundList/{username}")   //
	List<String> ShowUserRefundList(@PathVariable("username") String username)
	{
		List <String> refundsDefinition = new ArrayList<String>();
		userInfo userinfo = usersdata.getByUserName(username);
		
		for(Refund ref : userinfo.getCredits().getHistoryRefunds()) {
			refundsDefinition.add(ref.refundInfo());
		}
		
		return refundsDefinition;
	}
	
	
	
	@GetMapping("/admin/ShowUserWallet/{username}")
	List<String> ShowUserWallet(@PathVariable("username") String username)
	{
		List <String> refundsDefinition = new ArrayList<String>();
		userInfo userinfo = usersdata.getByUserName(username);
		
		for(payment wall : userinfo.getCredits().getWall()) {
			refundsDefinition.add(wall.display());
		}
		
		return refundsDefinition;
	
	}
	
	 Map<String, List<Integer>> DiscountLists = new HashMap<>(Map.of("Mobile recharge", new ArrayList<>(), "Internet Payment", new ArrayList<>(), "Landline", new ArrayList<>(),"Donations",new ArrayList<>()));
	  
		@PostMapping("/admin/addDiscount")
	    String addDiscounts(@RequestBody  AddDiscountReqBody a)
	    {        
			List<Integer> old_discount = DiscountLists.get(a.servicename());
			
			old_discount.add(a.discountPercentage());
			
			DiscountLists.replace(a.servicename(),old_discount);
			
			
	        return "Discount added succefully";
	    }

	    @GetMapping("/user/checkDiscounts")
	    List<Integer> getDiscounts(@RequestParam String serviceName)
	    {
	    
	    	return DiscountLists.get(serviceName);
	    	

	    }
	    
	    @PostMapping("/User/RequestRefund")
		String RequestRefund(@RequestBody Map <String, String> JSON)
		{
			String email = JSON.get("email").toString();
			String password = JSON.get("password").toString();
			Authentication signIn = new SignIn(usersdata,email,password);
			
			if(signIn.Join()){
				int paymentID = Integer.parseInt(JSON.get("payid").toString());
				userInfo userinfo=usersdata.GetUserByUserEmail(email);
				creditInfo cred=userinfo.getCredits();
				admin.addRefund(paymentID, userinfo);
			
				return cred.addRefund(paymentID, userinfo);
			}
			
			else return "Wrong password or email";
		}
	    
	    @GetMapping("/admin/getRefundList")
	    List<String> getRefundList()
	    {
	    	return admin.showRefundList();	    	
	    }
	    
	    @PostMapping("/admin/acceptanceOfRefunds")
	    String acceptanceOfRefunds(@RequestBody Map<String,String> JSON)
	    {
	    	int payID=Integer.parseInt(JSON.get("payid").toString());
	    	String username=JSON.get("username").toString();
	    	String response = JSON.get("response").toString();
	    	if(response.equals("accepted"))
	    	{
	    		admin.acceptRefund(payID, username);
	    		return "Refund Accepted";
	    	}
	    	
	    	if(response.equals("rejected"))
	    	{
	    		admin.rejectRefund(payID, username);
	    		return "Refund Refused";
	    	}
	    	return null;
	    }
}

