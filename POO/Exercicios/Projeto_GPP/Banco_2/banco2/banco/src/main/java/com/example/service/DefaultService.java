package com.example.service;

import com.example.repository.DefaultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class DefaultService<T extends DefaultRepository<T>> {

    @Autowired
    private T repository;

    public T obterRepository() {

        return repository;
    }

}

