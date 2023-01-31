package com.example.demo.concesionario.service;

import com.example.demo.concesionario.modelo.Cliente;

public interface IClienteService {
	public void insertar (Cliente cliente );
	public void actualizar (Cliente cliente );
	public Cliente buscar (Integer id );
	public void borrar (Integer id );

}
