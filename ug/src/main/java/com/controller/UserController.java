package com.controller;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Result;
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


@RequestMapping("regist")
@ResponseBody
public  Result<user>  regist(HttpServletRequest request){
    user user = new user();  
    Result<user> result =new Result<user>();
    user.setUsername(String.valueOf(request.getParameter("phone"))); 
    user.setPhonenumber(String.valueOf(request.getParameter("phone")));         
    user.setPassword(String.valueOf(request.getParameter("password")));    
    result =userService.regist(user);   
    request.getSession().setAttribute("userId",result.getData().getUserid() );
    return result;    
}

@RequestMapping("login")
@ResponseBody
public  Result<user>  login(HttpServletRequest request){
    user user = new user();  
    Result<user> result =new Result<user>();
    user.setPhonenumber(String.valueOf(request.getParameter("phone")));         
    user.setPassword(String.valueOf(request.getParameter("password")));    
    result =userService.login(user);    
    return result;    
}


}
