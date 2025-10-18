package com.example.springBoot.service;

import com.example.springBoot.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getStudentsById(Long id);

}

