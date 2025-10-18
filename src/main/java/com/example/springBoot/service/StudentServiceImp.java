package com.example.springBoot.service;

import com.example.springBoot.dto.StudentDto;
import com.example.springBoot.dto.StudentRequestDto;
import com.example.springBoot.entity.Student;
import com.example.springBoot.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService{
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;
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

    @Override
    public StudentDto getStudentsById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("student not found with Id: "+ id));
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public StudentDto createNewStudent(StudentRequestDto studentRequestDto) {
        Student newStudent = modelMapper.map(studentRequestDto, Student.class);
        Student student = studentRepository.save(newStudent);
        return modelMapper.map(student, StudentDto.class);
    }
}
