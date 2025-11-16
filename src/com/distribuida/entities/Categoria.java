package com.distribuida.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="categoria")
public class Categoria {
	
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Categoria")
	private int id_Categoria;
	@Column(name="categoria")
	private String categoria;
	@Column(name="descripcion")
	private String descripcion;
	
	//NETODO CONSTRUCTOR VACIO
	public Categoria(){
		
	}
	
	//CONSTRUCTOR SIN SUPER
	public Categoria(int id_Categoria, String categoria, String descripcion) {

		this.id_Categoria = id_Categoria;
		this.categoria = categoria;
		this.descripcion = descripcion;
	}


	
	//METODO SET Y GET
	public int getId_Categoria() {
		return id_Categoria;
	}




	public void setId_Categoria(int id_Categoria) {
		this.id_Categoria = id_Categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	//METODOS PRE Y POST
	
	@PostConstruct
	public void despuesCreacion() {
		System.out.println("Despues de la creacion del bean");
	}

	@PreDestroy
	public void antesDestruccion() {
		System.out.println("Antes de la destruccion del bean");
	}
	
	
	
	//MOSTRAR LOS DATOS
	@Override
	public String toString() {
		return "Categoria [id_Categoria=" + id_Categoria + ", categoria=" + categoria + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	

}
