package com.controller;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.user;
import com.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
@Resource
private UserService userService;
@RequestMapping("/showUser")
public String toIndex(HttpServletRequest request,Model model)
{
    int userId = Integer.parseInt(request.getParameter("userId"));  
    user user = this.userService.getUserById(userId);  
    model.addAttribute("user", user);  
	System.out.println(user.getUsername());
	return "showUser";
	
}
@RequestMapping("/addUser")    
public String addUser(HttpServletRequest request,Model model){    
    user user = new user();    
    user.setUsername(String.valueOf(request.getParameter("name")));    
    user.setPassword(String.valueOf(request.getParameter("password")));    
    userService.addUser(user);    
    return "query";    
}
@RequestMapping("/regist")
public String regist(HttpServletRequest request,Model model){       
    return "regist";    
}
@RequestMapping("c")
@ResponseBody
public HashMap d()
{
    HashMap s = new HashMap();
    s.put("aaa", "ÄãºÃ°¡");
    return s;
}
}
