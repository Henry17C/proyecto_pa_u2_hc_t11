package com.example.demo.auto13.repo;

import java.math.BigDecimal;

import com.example.demo.auto13.modelo.Automovil;

public interface IAutomovilRepo {
	
	public void insertar(Automovil auto);
	
	//TYPED QUERY
	
	public Automovil buscarPorMarcaQueryTyped(String marca);
	public Automovil buscarPorModeloTypedQuery(String modelo);
	public Automovil buscarPorColorTypedQuery(String color);
	
	//NAMED QUERY
	
	public Automovil buscarPorkilometrajeNamedQuery(BigDecimal kilo);
	public Automovil buscarPorPlacaNamedQuery(String marca);
	public Automovil buscarPorPrecioNamedQuery(BigDecimal precio);
	
	//NATIVE QUERY
	public Automovil buscarPorColorNativeQuery(String color);
	public Automovil buscarPorAnioNativeQuery(BigDecimal anio);
	public Automovil buscarPorMarcaNativeQuery(String  marca);
	
	
	//NAMED NATIVE QUERY
	
	public Automovil buscarPorColorNamedNativeQuery(String marca);
	public Automovil buscarPorPlacaNamedNativeQuery(String placa);
	public Automovil buscarPorMarcaNamedNativeQuery(String  modelo);
	
	
	
	
	
	
}
