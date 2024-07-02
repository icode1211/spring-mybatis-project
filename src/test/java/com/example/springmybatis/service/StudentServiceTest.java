package com.example.springmybatis.service;

import com.example.springmybatis.domain.Student;
import com.example.springmybatis.domain.StudentSearchCond;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    void countTest() {
        Integer countOfStudent = studentService.countOfStudent();
        System.out.println("countOfStudent = " + countOfStudent);
    }

    @Test
    void findStudentsByNameTest() {
        List<Student> students = studentService.findStudentsByName("한빛");
        students.stream().forEach(x -> System.out.println(x.getName()));
    }

    @Test
    void saveStudentTest() {
        studentService.insertStudent(new Student("이름2", 20, "주소"));

        List<Student> allBy = studentService.findAllBy(null);
        allBy.stream().forEach(x -> System.out.println(x.getName()));

        Integer countOfStudent = studentService.countOfStudent();
        System.out.println("countOfStudent = " + countOfStudent);
    }

    @Test
    void updateStudentTest() {
        studentService.updateStudent(5L, new Student("업데이트된이름", 15, "업데이트주소"));
        List<Student> allBy = studentService.findAllBy(null);
        allBy.stream().forEach(x -> System.out.println(x.getName()));
    }

    @Test
    void selectStudentByCond() {
        List<Student> students = studentService.findAllBy(new StudentSearchCond(null, 20));
        students.stream().forEach(x -> System.out.println(x.getName()));
    }

}