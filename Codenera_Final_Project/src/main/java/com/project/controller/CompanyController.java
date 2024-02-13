package com.project.controller;

import java.util.List;
import java.util.Optional;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.entity.company;
import com.project.entity.job;
import com.project.entity.user;
import com.project.repository.CompanyRepository;
import com.project.repository.jobRepository;
import com.project.service.companyService;
import com.project.service.jobService;

@Controller
public class CompanyController {
	@Autowired
	private CompanyRepository cr;
	
	@Autowired
	private companyService cs;

	@Autowired
	private jobRepository jr;
	
	@Autowired 
	private jobService js;


	/*@GetMapping("/{companyId}")
    public ResponseEntity<company> getCompanyById(@PathVariable Integer companyId) {
        company company = cs.getCompanyById(companyId);
        return ResponseEntity.ok(company);
    }

    @GetMapping("/{companyId}/jobs")
    public ResponseEntity<List<job>> getJobsByCompany(@PathVariable Integer companyId) {
        List<job> jobs = cs.getJobsByCompany(companyId);
        return ResponseEntity.ok(jobs);
    }*/

	@GetMapping("/companyReg")
	public String ShowRegForm() {
		return "CompanyRegister";
	}
	
	/*@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("mobile") long mobile, @RequestParam("password1") String password, Model m) {

		company c1 = new company();
		System.out.println("c1    " + c1 + " " + email);
		company c = cs.findByEmail(email);
		System.out.println(c);
		if (cs.findByEmail(email) != null) {
			m.addAttribute("mg", "Already exixt proceed to login or try with different name");

		} else {
			c1.setName(name);
			c1.setEmail(email);
			c1.setMobile(mobile);
			c1.setPassword(password);

			cr.save(c1);
			System.out.println("c1" + c1);
			m.addAttribute("mg", "register succesful");

		}*/

	@PostMapping("/RegisterComData" )
	public String LogCData(@ModelAttribute company company , HttpSession model) {

		//company c1 = new company();
		String email = company.getEmail();
		System.out.println("c1    " + company + " " + email);
		company c = cs.findByEmail(email);
		System.out.println(c);
		if (c != null) {
			String msg="already register";
			model.setAttribute("msg",msg);
			System.out.println(msg);
		} else {
			
			cr.save(company);
			System.out.println("c1" + company);
			String msg="successful";
			model.setAttribute("msg", msg);
			System.out.println(msg);
		}
		return "redirect:/companyReg";

	}
	
	@GetMapping("/company")
	public String ShowLoginForm() {
		return "CLogin";
	}
	
	@GetMapping("/cmpnyoperations")
	public String cmpnyoperationpage(HttpSession session)
	{
		Integer idd=(Integer)session.getAttribute("idd");
		System.out.println("CompanyOperations : "+idd);
		return "CompanyOperations";
	}
	
	
	@GetMapping("/getjbs")
	public String getAlljob(HttpSession session,Model model)
	{
		Integer id1=(Integer) session.getAttribute("idd");
		session.setAttribute("id1", id1);
		List<job> loj=cs.getJobsByCompany(id1);
		model.addAttribute("loj", loj);
		return "getJobs";
	}

	@PostMapping("/loginComdata")
	public String afterClogin(@RequestParam("email") String email, @RequestParam("password") String password,HttpSession session , Model m) {

		company result=cs.findByEmail(email);
		
		System.out.println("result "+result);
		
		if(result!=null)
		{
		
		int i=result.getId();
		
		System.out.println("idd"+i);
		
		/*Optional<company> a=cr.findById(i);
		
		System.out.println("a"+ a);
		
		List<job> lj=cs.getJobsByCompany(i);
		System.out.println("lj "+lj);*/
		
		session.setAttribute("idd", i);
		//m.addAttribute("lj", lj);
		
		
		
		/*
		 * System.out.println(email);
		 * 
		 * company c = cr.findByEmail(email); int i = c.getId();
		 * System.out.println("i      " + i); List<job> jj = jr.findAllById(i);
		 * System.out.println("list of jj    " + jj); m.addAttribute("jj", jj);
		 */

		return "CompanyOperations";
		}
		else
		{
			return "CLogin";
		}
	}
	
	/*@PostMapping("/")
	public String getJobPageData()
	{
		
	}*/

	@GetMapping("/addjob")
	public String AddJob(@ModelAttribute("form") company data,HttpSession session) {
		Integer id=(Integer)session.getAttribute("idd");
		session.setAttribute("id", id);
		
		return "cmpnyAddJob";
	}

	@PostMapping("/afterAddJob")
	public String afterAddingJob(@ModelAttribute job job,HttpSession session)//,@ModelAttribute("form") company data) {
	{	
		Integer id=(Integer)session.getAttribute("id");
		company company=cr.getById(id);
		System.out.println("save company to job "+ company);
		job.setCompany(company);
		jr.save(job);
		System.out.println(job);
		return "redirect:/addjob";
	}

}
