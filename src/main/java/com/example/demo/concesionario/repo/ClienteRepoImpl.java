package com.example.demo.concesionario.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.concesionario.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		entityManager.persist(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		entityManager.merge(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Cliente.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Cliente cliente=this.buscar(id);
		entityManager.remove(cliente);
		
	}

}
