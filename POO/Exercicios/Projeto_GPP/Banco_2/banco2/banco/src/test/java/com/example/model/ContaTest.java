package com.example.model;

import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@Transactional
class ContaTest {

    @Test
    void deposito() {

        Conta conta = new Conta();
        double saldo = conta.getSaldo();
        conta.deposito(5);

        assertEquals(saldo+5, conta.getSaldo());

    }

    @Test
    void saque() {

        Conta conta = new Conta();
        double saldo = conta.getSaldo();
        conta.deposito(10);
        conta.saque(2);

        assertEquals(saldo+3,conta.getSaldo());
    }
}