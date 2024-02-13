package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.entity.Application;
import com.project.entity.job;
import com.project.entity.user;
import com.project.repository.Application_Repository;
import com.project.repository.CompanyRepository;
import com.project.repository.UserRepository;
import com.project.repository.jobRepository;
import com.project.service.ApplicationService;
import com.project.service.companyService;
import com.project.service.jobService;
import com.project.service.userService;

@Controller
public class UserController {

	@Autowired
	private UserRepository ur;

	@Autowired
	private userService us;
	
	@Autowired
	private companyService cs;
	
	@Autowired
	private CompanyRepository cr;
	
	@Autowired
	private jobService js;
	
	@Autowired
	private jobRepository jr;
	
	@Autowired
	private Application_Repository ar;
	
	@Autowired
	private ApplicationService as;

	@GetMapping("/register")
	public String reg() {
		return "register";
	}

	@GetMapping("/Login")
	public String log() {
		return "Login";
	}

	/*@GetMapping("/user")
	public String ShowlogForm() {
		return "Login";
	}*/

	@GetMapping("/userReg")
	public String ShowRegForm() {
		return "register";
	}

	@PostMapping("/RegisterData")
	public String LogData(@ModelAttribute user m) {
		ur.save(m);
		System.out.println(m);
		return "redirect:/register";
	}

	@PostMapping("/logindata")
	public String afterLogin(@RequestParam("email") String email, @RequestParam("password") String password,
			Model model) {
		user user = us.findByemailAndPassword(email, password);
		Integer id1=user.getId();
		
		if (user==null) {
			model.addAttribute("msg","not find please register first or check constraints");
			return "Login";
		}
		else
		{
			model.addAttribute("id1", id1);
		//model.addAttribute("msg","login successful");
		return "Userdahsboard";
		}

	}

	@GetMapping("/apply/{i}")
	public String applytojob(@PathVariable("i") Integer i,Model model) {
		model.addAttribute("i", i);
		List<job> jobs=jr.findAll();
		model.addAttribute("jobs", jobs);
		System.out.println(jobs);
		return "ApplyForJob";
	}
	
	
	@PostMapping("/savetoUserApplied/{i}")
	public String getAppliedJobByUser(@PathVariable("i") Integer i,@RequestParam("id")Integer id,Model model)
	{
		System.out.println(i);
		System.out.println("id "+id);
		Application a=new Application();
		Optional<user> user=ur.findById(i);
		System.out.println("user "+user);
		user user1=user.get();
		System.out.println("user1 "+user1);
		a.setUser(user1);
		System.out.println("user1 save to a");
		Optional<job> job=jr.findById(id);
		System.out.println("job found "+job);
		job job1=job.get();
		System.out.println("job1 "+job1);
		a.setJob(job1);
		System.out.println("job 1 saved");
		ar.save(a);
		System.out.println("application : "+a);
		return "redirect:/apply";
	}

	@GetMapping("/viewAppliedjob/{i}")
	public String ViewAppliedJob(@PathVariable("i") Integer i,Model model) {
		
		model.addAttribute("i", i);
		return "ViewAppliedJobs";
	}

	// ApplyForJob
}
