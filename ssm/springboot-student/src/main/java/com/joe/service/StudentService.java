package com.joe.service;

import com.joe.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentService{

    void insert(Student student);

    void delete(Integer id);


    void update(Student student);


    List<Student> getAll();

    List<Student> getByName(String name);
    Student getById(Integer id);
}
