package com.example.springmybatis.controller;

import com.example.springmybatis.domain.Student;
import com.example.springmybatis.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student/count")
    public int countOfStudent() {
        return studentService.countOfStudent();
    }

    @GetMapping("/students/{name}")
    public List<Student> findStudentsByName(@PathVariable("name") String name) {
        return studentService.findStudentsByName(name);
    }

    @PostMapping("/student/regist")
    public void addStudent(@ModelAttribute Student student) {
        studentService.insertStudent(student);
    }

}
