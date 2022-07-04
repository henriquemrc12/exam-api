package com.example.examapi.services;

import com.example.examapi.interfaces.ISubjectService;
import com.example.examapi.models.SubjectModel;
import com.example.examapi.repositories.SubjectRepository;
import com.example.examapi.requests.SubjectCreateRequest;
import com.example.examapi.requests.SubjectUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements ISubjectService {

    @Autowired
    private SubjectRepository repository;

    @Override
    public List<SubjectModel> findAll() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public SubjectModel findById(Long id) throws Exception {
        try {
            return repository.findById(id)
                    .orElseThrow(() -> new Exception("Not found"));
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
    public SubjectModel create(SubjectCreateRequest request) {
        try {
            SubjectModel subjectModel = new SubjectModel();
            subjectModel.setName(request.getName().trim());
            return repository.save(subjectModel);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public SubjectModel update(SubjectUpdateRequest request) throws Exception {
        try {
            SubjectModel subjectModel = findById(request.getId());
            subjectModel.setName(request.getName().trim());
            return repository.save(subjectModel);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
