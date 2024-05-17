package com.joe.mapper;

import com.joe.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {


    @Insert("insert into student(name,email,age)values(#{student.name},#{student.email},#{student.age})")
    void insert(@Param("student") Student student);

    @Delete("delete from student where id=#{id}")
    void delete(Integer id);

    @Update("update student set name=#{student.name},email=#{student.email},age=#{student.age} where id=#{student.id}")
    void update(@Param("student") Student student);

    @Select("select * from student")
    List<Student> getAll();

    @Select("select * from student where name like concat('%',#{name},'%')")
    List<Student> getByName(String name);

    @Select("select * from student where id=#{id}")
    Student getById(Integer id);
}
