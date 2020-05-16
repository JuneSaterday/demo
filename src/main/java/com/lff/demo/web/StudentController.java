package com.lff.demo.web;

import com.lff.demo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentController {



    @RequestMapping(value = "/query")
    public List<Student> queryStudent() {


        return null;
    }


}
