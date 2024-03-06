package com.project.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.servlet.http.HttpSession;

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

import com.project.entity.company;
import com.project.entity.job;
import com.project.entity.user;
import com.project.repository.CompanyRepository;
import com.project.repository.UserRepository;
import com.project.repository.jobRepository;
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
	
	//@Autowired
	//private Application_Repository ar;
	
	//@Autowired
	//private ApplicationService as;

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
	public String LogData(@ModelAttribute user m,HttpSession model) {
		String email = m.getEmail();
		user c = us.findByEmail(email);
		System.out.println(c);
		if (c != null) {
			String msg="already register";
			model.setAttribute("msg",msg);
			System.out.println(msg);
		} else {
			
			ur.save(m);
			System.out.println("c1" + c);
			String msg="successful";
			model.setAttribute("msg", msg);
			System.out.println(msg);
		}
		//ur.save(m);
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
	
	//user dash Board
	@GetMapping("/goBackTOUserDashBoard/{i}")
	public String gotoUserDashboard(@PathVariable("i") Integer i1)
	{
		System.out.println(i1);
		return "Userdahsboard";
		//return "redirect:/goBackTOUserDashBoard";
	}

	@GetMapping("/apply/{i}")
	public String applytojob(@PathVariable("i") Integer i,Model model) {
		model.addAttribute("i", i);
		//ur.findAll().
		List<job> jobs=jr.findAll();
		model.addAttribute("jobs", jobs);
		System.out.println(jobs);
		System.out.println("in apply for jobs page ending");
		return "ApplyForJob";
	}
	
	
	@PostMapping("/savetoUserApplied/{i}")
	public String getAppliedJobByUser(@PathVariable("i") Integer i,@RequestParam("id") Integer id,Model model)
	{
		System.out.println("applied successful ....................... ");

		System.out.println(i);
		System.out.println("id "+id);
		//user_applied_jobs a=new user_applied_jobs();
		
		Optional<user> user=ur.findById(i);
		System.out.println("user "+user);
		user user1=user.get();
		System.out.println("user1 "+user1);
		//a.setUser(user1);
		
		System.out.println("user1 save to a");
		Optional<job> job=jr.findById(id);
		System.out.println("job found "+job);
		job job1=job.get();
		job1.getApplicants().add(user1);
		System.out.println("job1 "+job1);
		//a.setJob(job1);
		System.out.println("job 1 saved");
		jr.save(job1);
		System.out.println("applied successful ....................... 1");
		
		return "redirect:/apply/{i}";
	}
	
	

	@GetMapping("/viewAppliedjob/{i}")
	public String ViewAppliedJob(@PathVariable("i") Integer i,Model model) {
		System.out.println("view applied page displaying");
		Optional<user> user1 =ur.findById(i);
		System.out.println("user1 in view applied jobs"+user1);
		user user = user1.get();
		Set<job> job=user.getAppliedJobs();
		System.out.println(job);
		model.addAttribute("jobs",job);
		model.addAttribute("i", i);
		return "ViewAppliedJobs";
	}

	// ApplyForJob
}
