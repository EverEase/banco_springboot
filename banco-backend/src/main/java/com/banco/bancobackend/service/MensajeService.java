package com.banco.bancobackend.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.banco.bancobackend.model.Mensaje;
import com.banco.bancobackend.repository.MensajeRepository;


@Service
public class MensajeService {

	@Autowired
	MensajeRepository mensajeRepository;
	
	public ArrayList<Mensaje> leerMensajes() {
		return (ArrayList<Mensaje>) this.mensajeRepository.findAll();
	}
	
	public Optional<Mensaje> leerMensajePorId(Integer id){
		return this.mensajeRepository.findById(id);
		
	}
		
	public Mensaje guardarMensaje(Mensaje mensaje) {
		return this.mensajeRepository.save(mensaje);
	}
	
	public void borrarMensajePorId(Integer id) {
		this.mensajeRepository.deleteById(id);
	}
	
	public ArrayList<Mensaje> buscarMensajePorOrigenId(@PathVariable ("origen")Integer id){
		return this.mensajeRepository.findFirstByOrigenId(id);
	}
	
	public Optional <Mensaje> buscarMensajePorTexto(String texto){
		return this.mensajeRepository.findFirstByTexto(texto);
	}
	
	

}
