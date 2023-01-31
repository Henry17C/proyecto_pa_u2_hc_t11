package com.example.demo.concesionario.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_sec")//generarlo como secuencia
	@SequenceGenerator(name = "vehi_sec", sequenceName = "vehi_sec", allocationSize = 1)
	@Column(name="vehi_id")
	private Integer id;
	
	@Column(name="vehi_marca")
	private String marca;
	
	@Column(name="vehi_placa")
	private String placa;
	
	@Column(name="vehi_color")
	private String color;
	
	@Column(name="vehi_anio")
	private Integer anio;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "vehiculo_cliente",
	joinColumns = @JoinColumn(name="clive_id_vehiculo"),
	inverseJoinColumns = @JoinColumn(name="clive_id_cliente"))
	private Set <Cliente> clientes;
	

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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	

}
