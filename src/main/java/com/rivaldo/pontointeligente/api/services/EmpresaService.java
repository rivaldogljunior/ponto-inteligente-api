package com.rivaldo.pontointeligente.api.services;

import java.util.Optional;

import com.rivaldo.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

	/**
	 * Retorna uma empresa dado um CNPJ
	 * 
	 *  @param cnpj
	 *  @return Optinal<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa na base de dados
	 * 
	 *  @param empresa
	 *  @return Empresa
	 */
	Empresa persistir(Empresa empresa);
}

//Old CONFIGURE CHANNEL DEVICE TYPE DISK FORMAT   '/backup_tmp/bk_%d_%u_%s_%p';
