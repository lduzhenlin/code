package com.joe.service.impl;

import com.joe.entity.Student;
import com.joe.mapper.StudentMapper;
import com.joe.service.StudentService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.jar.Attributes;

@Data
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void delete(Integer id) {
        studentMapper.delete(id);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public List<Student> getByName(String name) {
        return studentMapper.getByName(name);
    }

    public Student getById(Integer id){
        return studentMapper.getById(id);
    }
}
