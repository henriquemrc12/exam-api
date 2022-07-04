package com.example.examapi.services;

import com.example.examapi.interfaces.IExamService;
import com.example.examapi.interfaces.ISubjectService;
import com.example.examapi.models.ExamModel;
import com.example.examapi.models.SubjectModel;
import com.example.examapi.repositories.ExamRepository;
import com.example.examapi.requests.ExamCreateRequest;
import com.example.examapi.requests.ExamUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService implements IExamService {

    @Autowired
    private ISubjectService subjectService;

    @Autowired
    private ExamRepository repository;

    @Override
    public List<ExamModel> findAll() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public ExamModel findById(Long id) throws Exception {
        try {
            return repository.findById(id)
                    .orElseThrow(() -> new Exception("Not Found"));
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            repository.deleteById(id);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public ExamModel create(ExamCreateRequest request) throws Exception {
        try {
            SubjectModel subjectFounded = subjectService
                    .findById(request.getSubjectId());
            ExamModel examModel = new ExamModel();
            examModel.setName(request.getName().trim());
            examModel.setYear(request.getYear());
            examModel.setSubject(subjectFounded);
            return repository.save(examModel);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public ExamModel update(ExamUpdateRequest request) throws Exception {
        try {
            SubjectModel subjectFounded = subjectService
                    .findById(request.getSubjectId());
            ExamModel examModel = findById(request.getId());
            examModel.setName(request.getName().trim());
            examModel.setYear(request.getYear());
            examModel.setSubject(subjectFounded);
            return repository.save(examModel);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
