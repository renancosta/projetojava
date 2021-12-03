package com.projecao.projetojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projecao.projetojava.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
