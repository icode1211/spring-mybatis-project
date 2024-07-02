package com.example.springmybatis.repository;

import com.example.springmybatis.domain.Student;
import com.example.springmybatis.domain.StudentSearchCond;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    int countOfStudents();

    List<Student> findStudentsByName(String name);
    List<Student> findAllBy(StudentSearchCond searchCond);

    void insertStudent(Student student);

    void updateStudent(@Param("id") Long id, @Param("updateParam") Student student);
}
