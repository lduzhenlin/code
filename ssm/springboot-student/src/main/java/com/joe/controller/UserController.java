package com.joe.controller;

import com.joe.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class UserController {


    @RequestMapping("/login")
    public Object login (User user, HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        if("admin".equals(user.getUsername())&&"123456".equals(user.getPassword())){
            request.getSession().setAttribute("user",user);
        }
        mv.setViewName("redirect:/");
        return mv;
    }


    @RequestMapping("/logout")
    public Object logout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("redirect:/");

        return mv;
    }

}
