package com.example.controller;

import com.example.model.Conta;
import com.example.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private ContaService contaService;

    @GetMapping("/salvar")
    public String salvar(@RequestBody List<Conta> conta){

//        Conta conta = new Conta();
//        conta.setNumeroConta(1245);
//        conta.setNomeTitular("Gabriel");
//        conta.deposito(1000);

        contaService.salvar(conta);

        return "Contas Salvas!!";
    }

    @GetMapping("/verificar")
    public List<Conta> verificar(){

        return contaService.listar();
    }

    @GetMapping("/verificar/{id}")
    public String verificar(@PathVariable String id){

        Conta conta = contaService.consultar(Long.valueOf(id));


        return conta.toString();
    }
}
