package com.projecao.projetojava.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.projecao.projetojava.model.Cliente;

public class ClienteDto {
	private String nome;
	private String cnpj;
	
	public ClienteDto(Cliente cliente) {
		this.nome = cliente.getNome();
		this.cnpj = cliente.getCnpj();
	}

	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public static List<ClienteDto> converter(List<Cliente> clientes) {
		// TODO Auto-generated method stub
		return clientes.stream().map(ClienteDto::new).collect(Collectors.toList());
	}
	
}
