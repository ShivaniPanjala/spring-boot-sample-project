package com.example.springBoot.service;

import com.example.springBoot.dto.StudentDto;
import com.example.springBoot.dto.StudentRequestDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getStudentsById(Long id);

    StudentDto createNewStudent(StudentRequestDto studentRequestDto);

    void deleteStudentById(Long id);

    StudentDto updateStudentById(Long id, StudentRequestDto studentRequestDto);

    StudentDto updatePartialStudentById(Long id, Map<String, Object> updates);
}

