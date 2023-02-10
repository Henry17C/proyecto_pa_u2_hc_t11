package com.example.demo.auto13.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "automovil")
@Entity
@NamedQuery(name = "Automovil.buscarPorKilo", query = "select a from Automovil a where a.kilometraje= :datoKilometraje")
@NamedQuery(name = "Automovil.buscarPorPlaca", query = "select a from Automovil a where a.placa= :datoPlaca")
@NamedQuery(name = "Automovil.buscarPorPrecio", query = "select a from Automovil a where a.precio= :datoPrecio")

@NamedNativeQuery(name = "Automovil.buscarPorColorN",query = "select * from automovil  where auto_color= :datoColor " ,resultClass = Automovil.class)
@NamedNativeQuery(name = "Automovil.buscarPorPlacaN",query = "select * from automovil  where auto_placa= :datoPlaca " ,resultClass = Automovil.class)
@NamedNativeQuery(name = "Automovil.buscarPorMarcaN",query = "select * from automovil  where auto_marca= :datoMarca " ,resultClass = Automovil.class)


public class Automovil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_seq")//generarlo como secuencia
	@SequenceGenerator(name = "auto_seq", sequenceName = "auto_seq", allocationSize = 1)
	@Column(name="auto_id")// ANOTACION PARA ASOCIAR LA COLUMNA
	private Integer id;
	
	@Column(name = "auto_marca")
	private String marca;
	
	@Column(name = "auto_modelo")
	private String modelo;
	
	@Column(name = "auto_placa")
	private String placa;
	
	@Column(name = "auto_kilometraje")
	private BigDecimal kilometraje;
	
	
	@Column(name = "auto_precio")
	private BigDecimal precio;
	
	@Column(name = "auto_color")
	private String color;
	
	@Column(name = "auto_anio")
	private BigDecimal anio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(BigDecimal kilometraje) {
		this.kilometraje = kilometraje;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getAnio() {
		return anio;
	}

	public void setAnio(BigDecimal anio) {
		this.anio = anio;
	}
	

	
	
	
}
