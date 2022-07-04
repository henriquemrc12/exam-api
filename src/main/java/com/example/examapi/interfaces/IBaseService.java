package com.example.examapi.interfaces;

import java.util.List;

public interface IBaseService<T> {
    List<T> findAll();
    T findById(Long id) throws Exception;
    void deleteById(Long id);
}
