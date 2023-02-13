package com.example.demo.auto13.repo;



import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.auto13.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class AutomovilRepoImp implements IAutomovilRepo {

	///TYPED QUERY
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Automovil buscarPorMarcaQueryTyped(String marca) {
		TypedQuery<Automovil> myTypedQuery= this.entityManager.createQuery("select e from Automovil e where e.marca= :datoMarca", Automovil.class);
		myTypedQuery.setParameter("datoMarca", marca);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorModeloTypedQuery(String modelo) {
		TypedQuery<Automovil> myTypedQuery= this.entityManager.createQuery(" select e from Automovil e where e.modelo= :datoModelo", Automovil.class);
		myTypedQuery.setParameter("datoModelo", modelo);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorColorTypedQuery(String color) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery= this.entityManager.createQuery("select e from Automovil e where e.color= :datoColor", Automovil.class);
		myTypedQuery.setParameter("datoColor", color);
		return myTypedQuery.getSingleResult();
	}
	//NAMED QUERY

	@Override
	public Automovil buscarPorkilometrajeNamedQuery(BigDecimal kilo) {
		//Query namedQuery =this.entityManager.createNamedQuery("NamedQuery");
		Query myQuery= this.entityManager.createNamedQuery("Automovil.buscarPorKilo");
		 myQuery.setParameter("datoKilometraje", kilo) ;
		 return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery= this.entityManager.createNamedQuery("Automovil.buscarPorPlaca");
		 myQuery.setParameter("datoPlaca", placa) ;
		 return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPrecioNamedQuery(BigDecimal precio) {
		// TODO Auto-generated method stub
		Query myQuery= this.entityManager.createNamedQuery("Automovil.buscarPorPrecio");
		 myQuery.setParameter("datoPrecio", precio) ;
		 return (Automovil) myQuery.getSingleResult();
	}
	
	//NATIVE QUERY

	@Override
	public Automovil buscarPorColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil  where auto_color= :datoColor ", Automovil.class);
		myQuery.setParameter("datoColor", color);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorAnioNativeQuery(BigDecimal anio) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil  where auto_anio= :datoAnio ", Automovil.class);
		myQuery.setParameter("datoAnio", anio);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorMarcaNativeQuery(String marca) {
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil  where auto_marca= :datoMarca ", Automovil.class);
		myQuery.setParameter("datoMarca", marca);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public void insertar(Automovil auto) {
		// TODO Auto-generated method stub
		entityManager.persist(auto);
	}
	
	//NAMED NATIVE QUERY

	@Override
	public Automovil buscarPorColorNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorColorN",Automovil.class);
		myQuery.setParameter("datoColor", marca);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorPlacaN",Automovil.class);
		myQuery.setParameter("datoPlaca", placa);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorMarcaNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorMarcaN",Automovil.class);
		myQuery.setParameter("datoMarca", marca);
		return (Automovil) myQuery.getSingleResult();
	}

	//DELETE
	
	@Override
	public int eliminarPorMarca(String marca) {
		Query query = this.entityManager.createQuery("DELETE FROM Automovil a WHERE  a.marca= :datoMarca");
		query.setParameter("datoMarca", marca);
		return query.executeUpdate();
	}

	@Override
	public int eliminarPorPlaca(String placa) {
		Query query = this.entityManager.createQuery("DELETE FROM  Automovil a WHERE a.placa= :datoPlaca");
		query.setParameter("datoPlaca", placa);
		return query.executeUpdate();
	}

	@Override
	public int actualizarPorMarca(String marca, String placa, String color) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("UPDATE  Automovil a SET a.placa= :datoPlaca , a.color= :datoColor"
				+ " WHERE a.marca= :datoMarca ");
		query.setParameter("datoMarca", marca);
		query.setParameter("datoPlaca", placa);
		query.setParameter("datoColor", color);
		return query.executeUpdate();
	}

	@Override
	public int actualizarPorPlaca(String placa, String modelo) {
		
		Query query = this.entityManager.createQuery("UPDATE Automovil a SET a.modelo=: datoModelo WHERE a.placa= :datoPlaca");
		query.setParameter("datoPlaca", placa);
		query.setParameter("datoModelo", modelo);
		return query.executeUpdate();
		// TODO Auto-generated method stub
		
	}
	
	

}
