package com.example.demo.concesionario.repo;

import com.example.demo.concesionario.modelo.Vehiculo;

public interface IVehiculoRepo {
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo  buscar(Integer id);
	public void eliminar(Integer id);

}
