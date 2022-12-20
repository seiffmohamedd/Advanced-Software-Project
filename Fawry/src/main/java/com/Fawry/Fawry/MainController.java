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
import Services.*;
import UsersData.*;
import User.*;


@RestController
public class MainController {
	
	// There are some instances to start some of our web service  
	
	// All users should be stored in a class 
	usersData usersdata = new usersData();
	
	// we have 4 initial services  
	Service mobileRecharge = new Service("Mobile Recharge");
	Service internetPaymnet = new Service("Internet Payment");
	Service landLine = new Service("Land Line");
	Service Donation = new Service("Donation");
	
	// one search class to search through services
	Search searcher = new Search();
	
	// this function will act like the Main function in normal console application
	void intiateMain() {
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
	
	
}

