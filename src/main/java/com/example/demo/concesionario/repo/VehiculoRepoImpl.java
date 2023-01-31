package com.example.demo.concesionario.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.concesionario.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository

public class VehiculoRepoImpl implements IVehiculoRepo{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		entityManager.persist(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		entityManager.merge(vehiculo);	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Vehiculo.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo= this.buscar(id);
		entityManager.remove(vehiculo);
		
	}

}
