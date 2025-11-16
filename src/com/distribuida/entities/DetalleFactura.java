package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="detalle_factura")
public class DetalleFactura {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_DetalleFactura")
	private int id_DetalleFactura; 
	@Column(name="cantidad")
	private int cantidad; 
	@Column(name="subtotal")
	private float subtotal;
	
	
	//FACTURA Y LIBRO
	@Column(name="subtotal")
	private Factura factura;  // FACTURA
	@Autowired
	private Libro libro;// LIBRO
	
	
	
	public DetalleFactura(){
		
	}
	
	
	
	public DetalleFactura(int id_DetalleFactura, int cantidad, float subtotal, Factura factura, Libro libro) {
		this.id_DetalleFactura = id_DetalleFactura;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.factura = factura;
		this.libro = libro;
	}



	//METODOS SET Y GET
	public int getId_DetalleFactura() {
		return id_DetalleFactura;
	}
	public void setId_DetalleFactura(int id_DetalleFactura) {
		this.id_DetalleFactura = id_DetalleFactura;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
	//INYECTAMOS POR SET Y GET
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
	
	//IMPRIMIR DATOS
	@Override
	public String toString() {
		return "DetalleFactura [id_DetalleFactura=" + id_DetalleFactura + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
	
	
	
	
	

}
