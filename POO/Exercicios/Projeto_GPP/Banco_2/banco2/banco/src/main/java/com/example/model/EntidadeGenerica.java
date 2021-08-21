package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public abstract class EntidadeGenerica<ID extends Serializable> implements Entidade<ID> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected ID id;

    @Override
    public boolean isNew() {
        return this.getId() == null;
    }
}
