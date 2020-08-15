package com.lff.demo.service.impl;

import com.lff.demo.mapper.StudentMapper;
import com.lff.demo.entity.Student;
import com.lff.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryStudent() {

        return studentMapper.queryStudent();

//        return studentMapper.queryStudentResultType();
    }


    @Override
    public boolean addStudent(Student student) {

        return studentMapper.addStudent(student);
    }

    @Override
    public Student queryStudentById(String id) {
        return studentMapper.queryStudentById(id);
    }
}
