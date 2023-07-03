package com.banco.bancobackend.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.bancobackend.model.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {
	
	public ArrayList<Mensaje> findFirstByOrigenId(Integer id);
	
	public Optional<Mensaje> findFirstByTexto(String texto);

}
