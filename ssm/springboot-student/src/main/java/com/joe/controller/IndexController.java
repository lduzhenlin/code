package com.joe.controller;


import com.joe.entity.Student;
import com.joe.entity.User;
import com.joe.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Data
@RestController
public class IndexController {

    private final StudentService studentService;

    @RequestMapping(value={"","/"})
    public Object index(HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        User user=(User) request.getSession().getAttribute("user");
        if(null==user){
            mv.setViewName("page/user/login");
            return mv;
        }

        //判断是否具有查询条件
        String name=(String)request.getSession().getAttribute("name");
        if(!"".equals(name)&&null!=name){
            List<Student> studentList=studentService.getByName(name);
            mv.addObject("students",studentList);
        }else{
            List<Student> studentList=studentService.getAll();
            mv.addObject("students",studentList);
        }


        //已经登录
        mv.addObject("user",user);
        mv.setViewName("page/student/index");



        return mv;
    }
}
