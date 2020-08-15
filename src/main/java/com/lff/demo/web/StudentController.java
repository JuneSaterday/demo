package com.lff.demo.web;

import com.lff.demo.entity.Student;
import com.lff.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/queryStudent", method = {RequestMethod.POST, RequestMethod.GET})
    public List<Student> queryStudent() {

        List<Student> students = studentService.queryStudent();

        return students;
    }


    @RequestMapping(value = "/addStudent")
    public boolean addStudent(@RequestBody Student student) {

        return studentService.addStudent(student);
    }


    @RequestMapping("/queryStudentById")
    @ResponseBody
    /**
     *
     * @RequestParam 一般用来处理content-type = application/x-www-form-urlencoded 的请求
     *
     * @RequestBody 一般用来处理content-type = application/json, application/xml 的请求；
     * 它是通过使用HandlerAdapter配置的HttpMessageConverters来解析post data body，然后绑定到相应的bean上的。
     */
    public Student queryStudentById(String id, String no) {

        return studentService.queryStudentById(id);

    }

    /*@RequestMapping("/queryStudentById/{id}/{no}")
    public Student queryStudentById(@PathVariable("id") String name, @PathVariable String no) {

        return studentService.queryStudentById(name);

    }*/


}
