package com.example.springBoot.dto;
import lombok.AllArgsConstructor;
import  lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentDto {
    private Long id;
    private String name;
    private String email;

//    instead of using constructor we can use @AllArgsConstructor annotation
//    public studentDto(String name, Long id, String email) {
//        this.name = name;
//        this.id = id;
//        this.email = email;
//    }
//

//    instead of using getter functions we can use @Data annotation
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
}
