package com.example.model;

import org.springframework.data.domain.Persistable;

import java.io.Serializable;

public interface Entidade<ID extends Serializable> extends Persistable<ID>, Serializable {
}
