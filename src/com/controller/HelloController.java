package com.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Addr;
import com.model.UserT;
import com.service.IUserService;

@Controller
public class HelloController {
	@Autowired
	private Addr addr;
	
	@Resource  
    private IUserService userService = null; 
	
	@RequestMapping(value="/a.do")
	public void addrShow(HttpServletResponse response) throws IOException{
		response.getWriter().write(addr.show());;
	}
	
	@RequestMapping(value="/getuserbyid.do")
//	@ResponseBody
	public String getUserById(Model model) {
		int userId = 1;  
        UserT user = this.userService.getUserById(userId);  
        model.addAttribute("user", user.toString()); 
//        return JSONObject.toJSONString(user);
        return "index";  
	}
	
}
