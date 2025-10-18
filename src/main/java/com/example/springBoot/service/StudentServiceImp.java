package com.example.springBoot.service;

import com.example.springBoot.dto.StudentDto;
import com.example.springBoot.entity.Student;
import com.example.springBoot.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService{
    private final StudentRepository studentRepository;

//    public StudentServiceImp(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        return students.
                stream().
                map(Student -> new StudentDto(Student.getId(), Student.getName(), Student.getEmail()) ).
                toList();
    }
}
