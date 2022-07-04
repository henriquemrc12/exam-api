package com.example.examapi.requests;

import lombok.Data;

@Data
public class ExamUpdateRequest {

    private Long id;

    private String name;

    private int year;

    private Long subjectId;
    
}
