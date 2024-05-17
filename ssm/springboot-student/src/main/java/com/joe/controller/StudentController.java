package com.joe.controller;

import com.joe.entity.Student;
import com.joe.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Data
@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;
    @RequestMapping("/addPage")
    public Object addPage(ModelAndView mv){
        mv.setViewName("page/student/addPage");
        return mv;
    }
    @RequestMapping("/editPage")
    public Object editPage(ModelAndView mv,Integer id){
        Student student=studentService.getById(id);
        mv.addObject("student",student);

        mv.setViewName("page/student/editPage");
        return mv;
    }



    @RequestMapping("/add")
    public Object save(ModelAndView mv, Student student){
        studentService.insert(student);
        mv.setViewName("redirect:/");
        return mv;
    }

    @RequestMapping("/delete")
    public Object delete(ModelAndView mv,Integer id){
        studentService.delete(id);
        mv.setViewName("redirect:/");
        return mv;
    }

    @RequestMapping("/edit")
    public Object edit(ModelAndView mv, Student student){
        studentService.update(student);
        mv.setViewName("redirect:/");
        return mv;
    }
    @RequestMapping("/getAll")
    public Object getAll(ModelAndView mv){
        return studentService.getAll();
    }
    @RequestMapping("/getByName")
    public Object getByName(String name, HttpServletRequest request){

        ModelAndView mv=new ModelAndView();
        request.getSession().setAttribute("name",name);
        mv.setViewName("redirect:/");
        return mv;
    }
}
