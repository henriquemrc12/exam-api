package com.example.examapi.requests;

import lombok.Data;

@Data
public class ExamCreateRequest {

    private String name;

    private int year;

    private Long subjectId;

}
