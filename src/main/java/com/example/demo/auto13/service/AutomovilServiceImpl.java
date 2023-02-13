package com.example.demo.auto13.service;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.auto13.modelo.Automovil;
import com.example.demo.auto13.repo.IAutomovilRepo;
@Service
public class AutomovilServiceImpl implements IAutomovilService {

	@Autowired
	private IAutomovilRepo automovilRepo;
	
	//TYPED QUERY
	@Override
	public Automovil buscarPorMarcaQueryTyped(String marca) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorMarcaQueryTyped(marca);
	}

	@Override
	public Automovil buscarPorModeloTypedQuery(String modelo) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorModeloTypedQuery(modelo);
	}

	@Override
	public Automovil buscarPorColorTypedQuery(String color) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorColorTypedQuery(color);
	}

	@Override
	public Automovil buscarPorkilometrajeNamedQuery(BigDecimal kilo) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorkilometrajeNamedQuery(kilo);
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorPlacaNamedQuery(marca);
	}

	@Override
	public Automovil buscarPorPrecioNamedQuery(BigDecimal precio) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorPrecioNamedQuery(precio);
	}

	@Override
	public Automovil buscarPorColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorColorNativeQuery(color);
	}

	@Override
	public Automovil buscarPorAnioNativeQuery(BigDecimal anio) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorAnioNativeQuery(anio);
	}

	@Override
	public Automovil buscarPorMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorMarcaNativeQuery(marca);
	}

	@Override
	public void insertar(Automovil auto) {
		// TODO Auto-generated method stub
		automovilRepo.insertar(auto);
		
	}

	@Override
	public Automovil buscarPorColorNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorColorNamedNativeQuery(marca);
	}


	@Override
	public Automovil buscarPorMarcaNamedNativeQuery(String modelo) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorMarcaNamedNativeQuery(modelo);
	}

	@Override
	public Automovil buscarPorPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return automovilRepo.buscarPorPlacaNamedNativeQuery(placa);
	}

//DELETE
	
	@Override
	public int eliminarPorMarca(String marca) {
		// TODO Auto-generated method stub
		return automovilRepo.eliminarPorMarca(marca);
	}

	@Override
	public int eliminarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return automovilRepo.eliminarPorPlaca(placa);
	}

	
	//UPDATE
	@Override
	public int actualizarPorMarca(String marca, String placa, String color) {
		// TODO Auto-generated method stub
		return automovilRepo.actualizarPorMarca(marca, placa, color);
	}

	@Override
	public int actualizarPorPlaca(String placa, String modelo) {
		// TODO Auto-generated method stub
		return automovilRepo.actualizarPorPlaca(placa, modelo);
	}
	

	
	
	
	

}
