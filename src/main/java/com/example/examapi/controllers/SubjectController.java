package com.example.examapi.controllers;

import com.example.examapi.interfaces.ISubjectService;
import com.example.examapi.requests.ExamUpdateRequest;
import com.example.examapi.requests.SubjectCreateRequest;
import com.example.examapi.requests.SubjectUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/subjects")
@RestController
public class SubjectController {

    @Autowired
    private ISubjectService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody SubjectCreateRequest request) {
        return ResponseEntity.ok().body(service.create(request));
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody SubjectUpdateRequest request) throws Exception {
        return ResponseEntity.ok().body(service.update(request));
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
