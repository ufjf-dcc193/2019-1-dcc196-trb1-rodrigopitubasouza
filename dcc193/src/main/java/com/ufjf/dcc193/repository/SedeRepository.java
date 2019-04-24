package com.ufjf.dcc193.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ufjf.dcc193.model.Atividade;
import com.ufjf.dcc193.model.Sede;

public interface SedeRepository extends JpaRepository<Sede,Long> {
	@Query(value = "SELECT new com.ufjf.dcc193.model.Atividade(s,"
			+ "sum(a.horasAssistencial),"
			+ "sum(a.horasJuridica),"
			+ "sum(a.horasFinanceira),"
			+ "sum(a.horasExecutiva)) "
			+ "FROM Sede s join s.AtividadeList a group by s")
    List<Atividade> getHoras();
}