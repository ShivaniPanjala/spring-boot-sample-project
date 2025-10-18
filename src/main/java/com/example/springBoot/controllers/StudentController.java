package com.example.springBoot.controllers;

import com.example.springBoot.dto.StudentDto;
import com.example.springBoot.dto.StudentRequestDto;
import com.example.springBoot.entity.Student;
import com.example.springBoot.repository.StudentRepository;
import com.example.springBoot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(456L, "Shivani", "fgh@gmail.com" );
    }

    @GetMapping("/student/{id}")
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
//    public List<StudentDto> getStudents() {
//        return studentService.getAllStudents();
//    }
    public ResponseEntity<List<StudentDto>> getStudents() {
//        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());

        return ResponseEntity.ok(studentService.getAllStudents());

        }


    @GetMapping("/students/{id}")
    public StudentDto getStudentsById(@PathVariable Long id){
        return studentService.getStudentsById(id);
    }

    @PostMapping("/students")
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody StudentRequestDto studentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(studentRequestDto));
    }
}
