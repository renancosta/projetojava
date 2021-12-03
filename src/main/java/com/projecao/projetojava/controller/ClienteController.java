package com.projecao.projetojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projecao.projetojava.dto.ClienteDto;
import com.projecao.projetojava.model.Cliente;
import com.projecao.projetojava.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@RequestMapping("/clientes")
	public List<ClienteDto> clientes(){
		List<Cliente> clientes = clienteRepository.findAll();
		return ClienteDto.converter(clientes);
	}
}
