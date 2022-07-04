package com.example.examapi.interfaces;

import com.example.examapi.models.SubjectModel;
import com.example.examapi.requests.SubjectCreateRequest;
import com.example.examapi.requests.SubjectUpdateRequest;

public interface ISubjectService extends IBaseService<SubjectModel> {
    SubjectModel create(SubjectCreateRequest request);
    SubjectModel update(SubjectUpdateRequest request) throws Exception;
}
