package com.rivaldo.pontointeligente.api.services;

import java.util.Optional;

import com.rivaldo.pontointeligente.api.entities.Empresa;
import com.rivaldo.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {

	/**
	 * Persistir um funcionario da base de dados
	 * 
	 *  @param funcionario
	 *  @return Funcionario
	 */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Busca e retorna um funcionario dado um CPF
	 * 
	 *  @param cpf
	 *  @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e retorna um funcionario dado um email
	 * 
	 *  @param email
	 *  @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Busca e retorna um funcionario dado um ID
	 * 
	 *  @param id
	 *  @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorId(Long id);
}

//Old CONFIGURE CHANNEL DEVICE TYPE DISK FORMAT   '/backup_tmp/bk_%d_%u_%s_%p';
