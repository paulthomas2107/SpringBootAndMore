package com.pault.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pault.demo.dao.AlienRepo;
import com.pault.demo.model.Alien;

@Controller
public class AlienController {
	
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		
		repo.save(alien);
		
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		
		
		return mv;
	}
	
	
	@RequestMapping("/getByAge")
	public ModelAndView getbyAge(@RequestParam int age) {
		
		ModelAndView mv = new ModelAndView("showAge.jsp");
		
		
		List<Alien> things = repo.findByAge(age);
	

		mv.addObject("things", things);
		
		return mv;
	}

	
	@RequestMapping("/getByTech")
	public ModelAndView getbyTech(@RequestParam String tech) {
		
		ModelAndView mv = new ModelAndView("showTech.jsp");
		
		
		List<Alien> things = repo.findByTech(tech);
	

		mv.addObject("things", things);
		
		return mv;
	}
	
	@RequestMapping("/getByAgeGT")
	public ModelAndView getbyAgeGT(@RequestParam int age) {
		
		ModelAndView mv = new ModelAndView("showAgeGT.jsp");
		
		
		List<Alien> things = repo.findByAgeGreaterThan(age);
	

		mv.addObject("things", things);
		
		return mv;
	}
	
	@RequestMapping("/getByTechSorted")
	public ModelAndView getbyTechSorted(@RequestParam String tech) {
		
		ModelAndView mv = new ModelAndView("showTechSorted.jsp");
		
		
		List<Alien> things = repo.findByTechSorted(tech);
	

		mv.addObject("things", things);
		
		return mv;
	}


	
	@RequestMapping("/deleteAlien")
	public ModelAndView deleteAlien(@RequestParam int aid) {
		
		ModelAndView mv = new ModelAndView("deleteAlien.jsp");
		
		Alien alien = repo.findById(aid).orElse(new Alien());
		
		repo.delete(alien);
		mv.addObject(alien);
		
		return mv;
	}

}
