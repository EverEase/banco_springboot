package com.banco.bancobackend.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.bancobackend.model.Transferencia;
import com.banco.bancobackend.service.TransferenciaService;

@RestController
@RequestMapping(path = "/transferencia")
@CrossOrigin(origins = "http://localhost:4200")
public class TransferenciaController {

	@Autowired
	TransferenciaService transferenciaService;

	@GetMapping()
	public ArrayList<Transferencia> obtenerTransferencias() {
		return this.transferenciaService.leerTransferencias();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Transferencia> obtenerTransferencia(@PathVariable("id") Integer id) {
		return this.transferenciaService.leerTransferenciaPorId(id);
		
	}
	
	@GetMapping(path = "/ordenante/{id}")
	public ArrayList<Transferencia> obtenerTransferenciaPorOrdenanteId(@PathVariable("id") Integer id) {
		return this.transferenciaService.leerTransferenciaPorOrdenanteId(id);
	}
	
	@GetMapping(path = "/beneficiario/{id}")
	public ArrayList<Transferencia> obtenerTransferenciaPorBeneficiarioId(@PathVariable("id") Integer id) {
		return this.transferenciaService.leerTransferenciaPorBeneficiarioId(id);
	}
	
	@GetMapping(path = "/nueva-transferencia/{id}")
	public Optional<Transferencia>enviarNuevaTransferencia(@PathVariable("id") Integer id) {
		return this.transferenciaService.nuevaTransferencia(id);
	}
	

	@PostMapping()
	public Transferencia guardarTransferencia(@RequestBody Transferencia transferencia) {
		return this.transferenciaService.guardarTransferencia(transferencia);

	}
	
	@DeleteMapping(path = "/{id}")
	public void borrarTransferencia(@PathVariable("id") Integer id) {
		this.transferenciaService.borrarTransferenciaPorId(id);
	}


}
