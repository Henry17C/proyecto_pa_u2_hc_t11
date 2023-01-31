package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.concesionario.modelo.Cliente;
import com.example.demo.concesionario.modelo.Vehiculo;
import com.example.demo.concesionario.service.IClienteService;
import com.example.demo.concesionario.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU2HcT11Application implements CommandLineRunner{

	@Autowired
	IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2HcT11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente();
		//Cliente cliente2 = new Cliente();
		Vehiculo vehiculo1= new Vehiculo();
	
		
		vehiculo1.setMarca("Honda Integra");
		vehiculo1.setPlaca("SRF145");
		vehiculo1.setColor("Rojo");
		vehiculo1.setAnio(1999);
		
		cliente1.setApellido("Jorge");
		cliente1.setNombre("Reinoso");
		cliente1.setAnioNacimiento(1999);
		cliente1.setCedula("175323");
		/*
		cliente2.setApellido("Jose");
		cliente2.setNombre("Lopez");
		cliente2.setAnioNacimiento(1999);
		cliente2.setCedula("175616");
		*/
		
		Set<Vehiculo> HSetVehiculos= new HashSet<Vehiculo>();
		Set<Cliente> HSetClientes= new HashSet<Cliente>();
		
		HSetClientes.add(cliente1);
		//HSetClientes.add(cliente2);
		
		HSetVehiculos.add(vehiculo1);
		
		
		cliente1.setVehiculos(HSetVehiculos);
		//cliente2.setVehiculos(HSetVehiculos);
		vehiculo1.setClientes(HSetClientes);
		
		
		iVehiculoService.insertar(vehiculo1);
		Vehiculo vehiculo= iVehiculoService.buscar(6);
		vehiculo.setAnio(1994);
		iVehiculoService.actualizar(vehiculo);
		iVehiculoService.eliminar(6);
		
		
	
		
	
		
		
		
		
		
	}

}
