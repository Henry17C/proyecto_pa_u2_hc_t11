package com.example.demo.concesionario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.concesionario.modelo.Vehiculo;
import com.example.demo.concesionario.repo.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	
	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		iVehiculoRepo.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		iVehiculoRepo.actualizar(vehiculo);
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return iVehiculoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		iVehiculoRepo.eliminar(id);
	}
	
	

}
