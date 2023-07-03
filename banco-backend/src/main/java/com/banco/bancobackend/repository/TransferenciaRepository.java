package com.banco.bancobackend.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.bancobackend.model.Transferencia;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer>{
	
	public ArrayList<Transferencia> findFirstByOrdenanteId(Integer id);

}
