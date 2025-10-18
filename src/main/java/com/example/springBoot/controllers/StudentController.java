package com.example.springBoot.controllers;

import com.example.springBoot.dto.StudentDto;
import com.example.springBoot.entity.Student;
import com.example.springBoot.repository.StudentRepository;
import com.example.springBoot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(456L, "Shivani", "fgh@gmail.com" );
    }

    @GetMapping("/student/{Id}")
    public StudentDto getStudentById(){
        return new StudentDto(456L, "Shivani", "fgh@gmail.com" );
    }


//    get the data from studentDB here Student is an entity
//    private final StudentRepository studentRepository;
//
//    public StudentController(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

//    @GetMapping("/students")
//    public List<Student> getStudents(){
//        return studentRepository.findAll();
//    }

    private final StudentService studentService;
    @GetMapping("/students")
    public List<StudentDto> getStudents() {
        return studentService.getAllStudents();
    }

}
