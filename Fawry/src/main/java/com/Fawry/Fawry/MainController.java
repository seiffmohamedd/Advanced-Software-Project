package com.Fawry.Fawry;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Admination.*;
import UsersData.*;
import User.*;
@RestController

public class MainController {
	usersData usersdata = new usersData();
	
	
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
	
	@GetMapping("/love")
	String showlove()
	{
		return "I love shab orca awe";
	}

	
	@GetMapping("/trial")
	String trial()
	{
		return "bn3ml test l haga bs";
	}
	
	@GetMapping("/7ob")
	String loving()
	{
		return "amoot ana";
	}
	
	@GetMapping("/FinalTrial")
	String FinalTrial()
	{
		return "Final Test ISA";
	}
}

