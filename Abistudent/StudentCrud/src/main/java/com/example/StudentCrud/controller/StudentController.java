package com.example.StudentCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.domain.registerInfo;
import com.example.StudentCrud.service.StudentService;
import com.example.StudentCrud.service.registerService;
//import ch.qos.logback.core.model.Model;

@Controller
public class StudentController {
	
	@Autowired
    private StudentService service;
	@Autowired
	private registerService regiservice;
 
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Student> liststudent = service.listAll();
        //liststudent.
        //System.out.println(liststudent.);
        
        model.addAttribute("liststudent", liststudent);
        model.addAttribute("student", new Student());
        System.out.print("Get / ");
        return "index";
    }
    ///new adding

    ///new adding
    @GetMapping("/index")
    public String viewHomePage1(Model model) {
        List<Student> liststudent = service.listAll();
        model.addAttribute("liststudent", liststudent);
        model.addAttribute("student", new Student());
        System.out.print("Get / ");
        return "index";
    }
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("student", new Student());
        return "new";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student std) {
        service.save(std);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Student std = service.get(id);
        mav.addObject("student", std);
        return mav;
        
    }
    @RequestMapping("/delete/{id}")
    public String deletestudent(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }

     @RequestMapping("/login0")
     public String viewLogin0(Model model) {
    	 model.addAttribute("student", new Student());
         return "login0";
  
     }
     
     
     @RequestMapping("/login")
     public String viewLogin(Model model) {
    	   model.addAttribute("registerinfo", new registerInfo());
  
           return "login";
  
     }
     
     @RequestMapping("/admin")
     public String viewAdminLogin(Model model) {
    	   model.addAttribute("registerinfo", new registerInfo());
  
           return "/adminlogin";
  
     }
     
     @GetMapping("/test")
     public String viewTest(Model model) {
     	
     //System.out.println("Get /");
     return "test";
     }
     
     @GetMapping("/useradd")
     public String viewUserCreation(Model model) {
      model.addAttribute("registerinfo", new registerInfo());
     //System.out.println("Get /");
     return "userCreate";
     }
     
     
     @GetMapping("/register")
     public String viewRegister(Model model) {

         model.addAttribute("registerinfo", new registerInfo());
 
         System.out.print("Get / ");
         return "register";
     }
     
     @RequestMapping(value = "/saveregister", method = RequestMethod.POST)
      public String saveResgiter(@ModelAttribute("registerinfo") registerInfo info) {
    	 regiservice.save(info);
         return "redirect:/userInfo";
     }
     //
 /////***************************
     @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
     public String loginSubmit(@ModelAttribute("registerinfo") registerInfo info) {
   	 regiservice.save(info);
     return "redirect:/";
    }
 /////***************************
     @GetMapping("/userInfo")
     public String viewUserInfo(Model model) {
    	 List<registerInfo> listregister = regiservice.listAll();
         model.addAttribute("listregister", listregister);
         //model.addAttribute("student", new Student());
         System.out.print("Get / ");
         return "userInformation";
    }
    
     @RequestMapping("/reedit/{uid}")
     public ModelAndView showResgiter(@PathVariable(name = "uid") String uid) {
         ModelAndView mav = new ModelAndView("register");
         registerInfo regisinfo = regiservice.get(uid);
         mav.addObject("registerinfo", regisinfo);
         return mav;
         
     }
     @RequestMapping("/redelete/{uid}")
     public String deleteRegister(@PathVariable(name = "uid") String uid) {
    	 regiservice.delete(uid);
         return "redirect:/userInfo";
     }
     
     @RequestMapping("/testVideo")
     public String videoPlay() {
    	 
      	 
      return "/testVideo";
     }
     
     
     @RequestMapping(value = "/loginsubmit", method = RequestMethod.POST)
     public String showLogin(Model model,@RequestParam("username")String username,@RequestParam("password") String password) {
    	 
 	    model.addAttribute("registerinfo", new registerInfo());
	    
        System.out.print("Get / ");
        
   	    System.out.print("We can get username"+username+" and password"+password);
	    if(username.equals("admin")&&(password.equals("admin"))) {
		   
		   return "redirect:/testVideo";
	      }
	   
         else
		 return "/login"  ;
        
    	 
       }
         
     @RequestMapping(value = "/adminloginsubmit", method = RequestMethod.POST)
     public String adminshowLogin(Model model,@RequestParam("username")String username,@RequestParam("password") String password) {
    	 
 	    model.addAttribute("registerinfo", new registerInfo());
	    
        System.out.print("Get / ");
        
   	    System.out.print("We can get username"+username+" and password"+password);
	    if(username.equals("admin")&&(password.equals("admin"))) {
		   
		   return "redirect:/serviceList";
	      }
	   
         else
		 return "/admin"  ;
        
    	 
       }
     
     @GetMapping("/serviceList")
     public String serviceList() {
     
    	 
      return "/serviceList" ;
     }
     
     @RequestMapping("/exercise")
     public String excerciseList() {
         
    	 
         return "/exercise" ;
        }
     
     }
     

