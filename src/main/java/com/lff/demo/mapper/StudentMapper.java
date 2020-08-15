package com.lff.demo.mapper;

import com.lff.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> queryStudent();

    List<Student> queryStudentResultType();

    boolean addStudent(Student student);

    Student queryStudentById(String id);

}
