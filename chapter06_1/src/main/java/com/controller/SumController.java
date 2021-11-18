package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.SumDTO;


@Controller
public class SumController {
	
	
	@RequestMapping(value="/input.do", method=RequestMethod.GET)
	public String input() {
		
		return "/sum/input";
	}
	
//	@RequestMapping(value="/result.do",method=RequestMethod.GET)
//	public String result() {
//		
//		
//		return /sum/result;
//	}
	
//	@RequestMapping(value="/result.do",method=RequestMethod.GET)
//	public ModelAndView result(@RequestParam int x, @RequestParam int y) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x",x);
//		mav.addObject("y",y);
//		mav.setViewName("/sum/result");
//		
//		return mav;
//	}
	
//	@RequestMapping(value="/result.do",method=RequestMethod.GET)
//	public ModelAndView result(@RequestParam(required=false,defaultValue="0") int x  //required 값이 안들어왔을때 0으로 이식해라 
//							, @RequestParam(required=false,defaultValue="0") int y) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x",x);
//		mav.addObject("y",y);
//		mav.setViewName("/sum/result");
//		
//		return mav;
//	}
	
//	@RequestMapping(value="/result.do",method=RequestMethod.GET)
//	public String result(@RequestParam Map<String, String> map, ModelMap modelMap) {
//		
//		modelMap.put("x", map.get("x"));
//		modelMap.put("y", map.get("y"));
//		return "/sum/result";
//	}
	
	@RequestMapping(value="/result.do",method=RequestMethod.GET)
	public String result(@ModelAttribute SumDTO sumDTO,Model model) {
		
//		model.addAttribute("x",sumDTO.getX());
//		model.addAttribute("y",sumDTO.getY());
		
		model.addAttribute("sumDTO",sumDTO);
		return "/sum/result";
	}
	
}
