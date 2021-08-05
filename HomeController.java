package com.telusko.springbootmvc;




import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.springbootmvc.model.Alien;

@Controller
public class HomeController {
	@Autowired
	AlienRepo repo;
	@RequestMapping("/")
public String home() {
	
	return "home.jsp";		
}	
	@GetMapping("getAliens")
	public String getAlien(Model m)
	{
		//List<Alien>aliens=Arrays.asList(new Alien(101,"Abhinav"),new Alien(102,"Niraj"));
		//return aliens.toString();
		m.addAttribute("result", repo.findAll());
		return "showAliens.jsp";
	}
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid,Model m)
	{
		//List<Alien>aliens=Arrays.asList(new Alien(101,"Abhinav"),new Alien(102,"Niraj"));
		//return aliens.toString();
		m.addAttribute("result", repo.getOne(aid));
		return "showAliens.jsp";
	}
	@GetMapping("getAlienByName")
	public String getAlienByName(@RequestParam String aname,Model m)
	{
		m.addAttribute("result", repo.find(aname));
		return "showAliens.jsp";
	}
	@RequestMapping("addAlien")
public String addAlien(Alien a) {
		repo.save(a);
		return "result.jsp";		
	}
	@ModelAttribute //THISH WILL BE CALLED FIRST BEFORE ANY METHOD REQUEST
public void modelAtribute(ModelMap m) {
		
		m.addAttribute("name", "SAMDARSEE");
	
	}
	
}
