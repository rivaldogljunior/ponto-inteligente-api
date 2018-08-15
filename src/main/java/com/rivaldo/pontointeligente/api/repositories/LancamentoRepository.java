package com.rivaldo.pontointeligente.api.repositories;


import java.util.List;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import com.rivaldo.pontointeligente.api.entities.Lancamento;

@Transactional(readOnly = true)
@NamedQueries({
	@NamedQuery(name = "LancamentoRepository.findByFuncionarioId",
			query = "SELECT lanc FROM lancamento lanc WHERE lanc.funcionario.is = :funcionarioId")
})
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
	List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionariId);
	
	Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pageable);
	
}
