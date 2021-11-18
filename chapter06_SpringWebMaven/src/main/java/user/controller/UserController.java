package user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.service.UserService;

@Controller
public class UserController {
	private UserService userService;
	
	@GetMapping("/user/writeForm")
	public String writeForm() {
		
		return "/user/writeForm";
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@PostMapping("/user/checkId")
	@ResponseBody
	public String checkId(@RequestParam String id) {
		
		
		return "exist";
		
	}
	
	
}
