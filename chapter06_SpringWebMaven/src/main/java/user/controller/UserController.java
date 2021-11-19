package user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;
import user.bean.UserDTO;
import user.service.UserService;

@Controller
public class UserController {
	@Autowired
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
		return userService.checkId(id);
	}
	
	@PostMapping("/user/write")
	@ResponseBody
	public void write(@ModelAttribute UserDTO userDTO) {
		userService.write(userDTO);
		
		
	}
	
	
	@GetMapping("/user/list")
	public String list() {
		return "/user/list";
	}
	
	
	@PostMapping("/user/getUserList")
	@ResponseBody //메소드의 return형 앞에 @ResponseBody를 붙여서 사용하게 되면 해당객체가 자동으로 JSON객체로 변환되어 반환됨
	/*
	 <dependency>
      <groupId>org.codehaus.jackson</groupId>
      <artifactId>jackson-mapper-asl</artifactId>
      <version>버전</version>
	 </dependency>
	 * */
	public List<UserDTO> getUserList() {
		return userService.getUserList();
	}
	
	
	@GetMapping("/user/modifyForm")
	public String modifyForm() {
		return "/user/modifyForm";
	}
	
	
	@PostMapping("/user/getUser")
	@ResponseBody
	public UserDTO getUser(@RequestParam String searchId) {
		
		return userService.getUser(searchId);
		
	}
	
	@PostMapping("/user/modify")
	@ResponseBody
	public void modify(@ModelAttribute UserDTO userDTO) {
		userService.modify(userDTO);
	}
	
	
	@GetMapping("/user/deleteForm")
	public String deleteForm() {
		return "/user/deleteForm";
	}
	
	@PostMapping("/user/delete")
	@ResponseBody
	public void delete(@RequestParam String searchId) {
		userService.delete(searchId);
	}
	
}
