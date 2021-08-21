package com.example.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="TB_CONTA")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Conta extends EntidadeGenerica<Long> {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long Id;

	@Column
	private int numeroConta;

	@Column
	private String nomeTitular;

	@Column
	private double saldo;

	@Builder
	public Conta(Long id) {
		this.setId(id);
	}

	// Metodos

	public void deposito(double quantidade) {
		saldo += quantidade;
	}

	public void saque(double quantidade) {
		saldo -= quantidade + 5.0;
	}


	// TO STRING
	public String toString() {
		return "Segue os dados da sua conta"
				+ "\n-----------------------------"
				+ String.format("\nNumero de conta:" + getNumeroConta() )
				+ String.format("\nNome do titular:" + getNomeTitular())
				+ String.format("\nSaldo atual: R$%.2f", getSaldo());
	}

}
