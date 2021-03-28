package com.example.ProjectApp.ProjectApp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ProjectApp.ProjectApp.Driver.LoginModel;
@RestController
public class LoginController {

	@GetMapping("/temp")
	public LoginModel method()
	{
		return new LoginModel("nallasujith9@gmail.com","sujith1024");
	}
	@PostMapping("/login")
	public String method1(@RequestBody LoginModel temp){
		return temp.getEmail()+" "+temp.getPassword();
	}
	
}
