package com.example.examapi.controllers;

import com.example.examapi.interfaces.IExamService;
import com.example.examapi.requests.ExamCreateRequest;
import com.example.examapi.requests.ExamUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/exams")
@RestController
public class ExamController {

    @Autowired
    private IExamService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ExamCreateRequest request) throws Exception {
        return ResponseEntity.ok().body(service.create(request));
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody ExamUpdateRequest request) throws Exception {
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
