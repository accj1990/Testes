package br.com.teste.validacao.anotacoes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class Cliente {

	@NotNull(message="O nome é obrigatório.")
	@Pattern(regexp="[[a-z-A-Z]+ \\s [a-z-A-Z]+]+ [\\s [a-z-A-Z]+]*", message="O sobrenome é obrigatório.")
	private String nome;
	
	@Pattern(regexp="\\d{3}.\\d{3}.\\d{3}-\\d{2}", message="O CPF informado é inválido.")
	private String cpf;
	
	public Cliente(String nome, String cpf)
	{
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
