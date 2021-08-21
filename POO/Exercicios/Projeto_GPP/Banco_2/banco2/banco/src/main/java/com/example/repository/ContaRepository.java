package com.example.repository;

import com.example.model.Conta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends DefaultRepository<Conta> {
}
