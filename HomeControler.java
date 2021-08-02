package com.sam.MVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sam.model.Alien;

@Controller
public class HomeControler {
	@RequestMapping("/")
public String home() {
	
	return "home.jsp";		
}	//no req now for this controller
	@RequestMapping("add")
	public String result(@RequestParam("num1")int i,@RequestParam("num2")int j,ModelMap m) {
		
		int num3=i+j;
		
		m.addAttribute("num3",num3);
		
		return "result.jsp";		
	}
	@RequestMapping("addAlien")
public String addAlien(Alien a) {
		return "result.jsp";		
	}
	@ModelAttribute //THISH WILL BE CALLED FIRST BEFORE ANY METHOD REQUEST
public void modelAtribute(ModelMap m) {
		
		m.addAttribute("name", "SAMDARSEE");
	
	}
	
}
