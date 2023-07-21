package com.gaurav.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gaurav.demo.dao.AlienRepo;
import com.gaurav.demo.model.Alien;

@RestController
public class AlienController 
{  
   @Autowired
   AlienRepo repo;
   
   @RequestMapping("home")
   public String home()
   {
	   return "home.jsp";
   }
   
   @DeleteMapping("/alien/{aid}")
   public String deleteAlien(@PathVariable int aid)
   {
	   Alien a = repo.getReferenceById(aid);
	   repo.delete(a);
	   return "Deleted";
   }
   
//   @RequestMapping("/addAlien")
//   public String addAlien(Alien alien)
//   {   
//	   repo.save(alien);
//	   return "home.jsp";
//   }
   
   
   @PostMapping("/alien")
   public Alien addAlien(@RequestBody Alien alien)
   {   
	   repo.save(alien);
	   return alien;
   }
   
   
   @PutMapping("/alien")
   public Alien updateAlien(@RequestBody Alien alien)
   {   
	   repo.save(alien);
	   return alien;
   }
   
   @GetMapping(path="/aliens")
	public List<Alien> getAliens()
	{
		return repo.findAll();
		
		
	}
	@GetMapping("/alien/{aid}")
//	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid);
		
		
	}
   
	
//   @RequestMapping("/getAlien")
//   public ModelAndView getAlien(@RequestParam int aid)
//   {
//	   ModelAndView mv = new ModelAndView("Show.jsp");
//	   Alien alien = repo.findById(aid).orElse(new Alien());
//	   System.out.println(repo.findByTech("Java"));
//	   mv.addObject(alien);
//	   return mv;
   
}
