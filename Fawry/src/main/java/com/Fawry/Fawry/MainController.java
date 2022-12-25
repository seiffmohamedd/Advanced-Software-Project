package com.Fawry.Fawry;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Admination.*;
import Form.*;
import Form.Fields.*;
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
	Service landLine ;
	Service Donation ;
	
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
		Service service = serviceFactory.createService(serviceName);
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
		ServiceProvider serviceProvider = spFactory.createServiceProvider(name,service,number,sForm);
		return service.addServiceProvider(serviceProvider);
	}
	
	@PostMapping("/walletrecharge")
	String addToWallet(@RequestBody Map <String,String> json){
		
		String userName = json.get("username").toString();
		
		userInfo user = usersdata.getByUserName(userName);
		
		int amount = Integer.parseInt(json.get("amount").toString());
		
		user.getCredits().chargeWallet(amount);
		
		return user.getCredits().chargeWallet(amount);
	}
	
	@PostMapping("/payservice")
	String payForService(@RequestBody Map <String,String> json) {
		String email = json.get("email").toString();
		String password = json.get("password").toString();
		double totalCost =  Integer.parseInt(json.get("totalcost").toString());
		Authentication signIn = new SignIn(usersdata,email,password);
		
		if(signIn.Join()){
            userInfo user = usersdata.GetUserByUserEmail(email);
            long spNumber =  Long.parseLong(json.get("spnumber").toString());
            String serviceName = json.get("servicename").toString();
            ServiceFactory serviceFactory = new ServiceFactory();
            Service service = serviceFactory.createService(serviceName);
            for(ServiceProvider sp : service.getSPs()) {
            	if(sp.getNumber() == spNumber) {
            		
            	}
            }
        }
        else {
            return "Wrong password or email";
        }
	}
}

