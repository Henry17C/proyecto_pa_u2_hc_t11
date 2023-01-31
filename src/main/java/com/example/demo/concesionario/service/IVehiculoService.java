package com.example.demo.concesionario.service;

import com.example.demo.concesionario.modelo.Vehiculo;

public interface IVehiculoService {
	public void insertar (Vehiculo vehiculo);
	public void actualizar (Vehiculo vehiculo);
	public Vehiculo buscar (Integer id);
	public void eliminar (Integer id);

}
