package com.demo.controller;

import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyStudent;
import com.demo.beans.MyUser;
import com.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService sservice;

    @GetMapping("/showstudent")
    public ModelAndView getAllstudents(HttpSession session) {
        MyUser user = (MyUser) session.getAttribute("user");
        if (user != null && "user".equals(user.getRole())) {
            List<MyStudent> slist = sservice.getAllStudents();
            return new ModelAndView("showstudent", "slist", slist);
        } else {
            return new ModelAndView("loginpage", "message", "Please provide credentials");
        }
    }

    @GetMapping("/addstudent")
    public String showstudentform(Model myModel) {
        myModel.addAttribute("s1", new MyStudent());
        return "insertstudent";
    }

    @PostMapping("/insertstudent")
    public ModelAndView insertstudent(@ModelAttribute MyStudent s) {
        System.out.println(s);
        boolean status = sservice.addstudent(s);
        return new ModelAndView("redirect:/student/showstudent");
    }

    @GetMapping("/editstudent/{sid}")
    public ModelAndView editstudent(@PathVariable("sid") int sid) {
        MyStudent s = sservice.getById(sid);
        if (s != null) {
            return new ModelAndView("editstudent", "stud", s);
        } else {
            return new ModelAndView("redirect:/student/showstudent");
        }
    }

    @PostMapping("/updatestudent")
    public ModelAndView updatestudent(@ModelAttribute MyStudent s) {
        System.out.println(s);
        boolean status = sservice.updatestudent(s);
        return new ModelAndView("redirect:/student/showstudent");
    }

    @GetMapping("/deletestudent/{sid}")
    public ModelAndView deletestudent(@PathVariable int sid) {
        boolean status = sservice.deleteById(sid);
        return new ModelAndView("redirect:/student/showstudent");
    }
}
