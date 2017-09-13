package com.websimple.springmvc.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Estudiante implements Serializable {

	@Size(min=3, max=30)
	private String nombre;
	 
	@Size(min=3, max=30)
	private String apellido;
	 
	@NotEmpty
	private String sexo;
	 
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Past @NotNull
	private Date fechaNac;
	 
	@Email @NotEmpty
	private String email;
	 
	@NotEmpty
	private String nivelEscolar;
	 
	@NotEmpty
	private String pais;
	 
	private boolean primerIntento;
	 
	@NotEmpty
	private List<String> materias = new ArrayList<String>();
	
	
	public String getNombre() {
		return nombre;
	}
		
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Date getFechaNac() {
		return fechaNac;
	}
	
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNivelEscolar() {
		return nivelEscolar;
	}
	
	public void setNivelEscolar(String nivelEscolar) {
		this.nivelEscolar = nivelEscolar;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public boolean isPrimerIntento() {
		return primerIntento;
	}
	
	public void setPrimerIntento(boolean primerIntento) {
		this.primerIntento = primerIntento;
	}
	
	public List<String> getMaterias() {
		return materias;
	}
	
	public void setMaterias(List<String> materias) {
		this.materias = materias;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", fechaNac=" + fechaNac
				+ ", email=" + email + ", nivelEscolar=" + nivelEscolar + ", pais=" + pais + ", primerIntento=" + primerIntento
				+ ", materias=" + materias + "]";
	}
	
}
