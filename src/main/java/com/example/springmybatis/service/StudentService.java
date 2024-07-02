package com.example.springmybatis.service;

import com.example.springmybatis.domain.Student;
import com.example.springmybatis.domain.StudentSearchCond;
import com.example.springmybatis.repository.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int countOfStudent() {
        return studentMapper.countOfStudents();
    }

    public void insertStudent(Student student) {
        studentMapper.insertStudent(student);
    }

    public List<Student> findStudentsByName(String name) {
        return studentMapper.findStudentsByName(name);
    }

    public List<Student> findAllBy(StudentSearchCond searchCond) {
        return studentMapper.findAllBy(searchCond);
    }

    public void updateStudent(Long id, Student student) {
        studentMapper.updateStudent(id, student);
    }
}
