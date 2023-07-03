package com.banco.bancobackend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Cliente ordenante;
	@ManyToOne
	private Cliente beneficiario;
	private Double importe;
	private String concepto;
	private Date fecha;
	@PrePersist
	private void diadehoy() {
		this.fecha = new Date();
	}
	

	public Transferencia() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Cliente getOrdenante() {
		return ordenante;
	}


	public void setOrdenante(Cliente ordenante) {
		this.ordenante = ordenante;
	}


	public Cliente getBeneficiario() {
		return beneficiario;
	}


	public void setBeneficiario(Cliente beneficiario) {
		this.beneficiario = beneficiario;
	}


	public Double getImporte() {
		return importe;
	}


	public void setImporte(Double importe) {
		this.importe = importe;
	}


	public String getConcepto() {
		return concepto;
	}


	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}
