package com.example.service;

import com.example.model.Conta;
import com.example.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContaService  {

    @Autowired
    private ContaRepository contaRepository;

    public Conta salvar(Conta conta) {

        return contaRepository.save(conta);
    }

    public List<Conta> salvar(List<Conta> conta) {

        List<Conta> contas = new ArrayList<>();
        contaRepository.saveAll(conta).forEach(contas::add);

        return contas;
    }

    public Conta consultar(Long Id) {

        return contaRepository.findById(Id).orElse(new Conta());
    }


    public List<Conta> listar() {

        List<Conta> contas = new ArrayList<>();
        contaRepository.findAll().forEach(contas::add);
        return contas;
    }

}
