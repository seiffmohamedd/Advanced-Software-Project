import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Admination.*;
import UsersData.*;
import User.*;
@RestController
public class MainController {
	usersData usersdata = new usersData();
	
	
	@PostMapping(value = "/signup")
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
	
}
