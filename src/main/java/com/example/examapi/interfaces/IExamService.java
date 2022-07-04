package com.example.examapi.interfaces;

import com.example.examapi.models.ExamModel;
import com.example.examapi.requests.ExamCreateRequest;
import com.example.examapi.requests.ExamUpdateRequest;

public interface IExamService extends IBaseService<ExamModel> {
    ExamModel create(ExamCreateRequest request) throws Exception;
    ExamModel update(ExamUpdateRequest request) throws Exception;
}
