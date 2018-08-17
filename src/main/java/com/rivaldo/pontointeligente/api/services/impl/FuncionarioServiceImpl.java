package com.rivaldo.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rivaldo.pontointeligente.api.entities.Funcionario;
import com.rivaldo.pontointeligente.api.repositories.FuncionarioRepository;

public class FuncionarioServiceImpl {
	
	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistir Funcinario: {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}
	
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		log.info("Buscar funcionario pelo CPF {}", cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));				
	}
	
	public Optional<Funcionario> buscarPorEmail(String email) {
		log.info("Buscar funcionario pelo Email {}", email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));				
	}
	
	public Optional<Funcionario> buscarPorId(Long id) {
		log.info("Buscar funcionario pelo Id {}", id);
		return Optional.ofNullable(this.funcionarioRepository.findOne(id));				
	}

}
