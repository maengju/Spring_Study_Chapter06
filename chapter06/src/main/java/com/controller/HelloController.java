package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
//	//@RequestMapping(value="/hello.do",method=RequestMethod.GET)
//	@GetMapping("/hello.do")
//	public ModelAndView hello(){ //사용자가 만든 콜백메소드 부르는건 스프링컨테이너에서 자동으로 부르고 들어간다.
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("result", "have a nice day!");
//		//mav.setViewName("hello"); //     /view/hello.jsp
//		mav.setViewName("/view/hello");
//		
//		return mav;
//	}
	
	@GetMapping(value="/hello.do", produces="text/html; charset=UTF-8")
	//return type이 String 이면 단순 문자열로 인식하는것이 아니라 파일명으로 인식을 한다.
	//@ResponseBody를 사용하면 단순 문자열로 인식하라는것
	public @ResponseBody String hello() {
		return "have 안a 녕nice day!"; //브라우저에 그냥 뿌림
	}
	

	
}
