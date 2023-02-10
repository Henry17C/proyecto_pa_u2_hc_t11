package com.example.demo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.auto13.modelo.Automovil;
import com.example.demo.auto13.service.IAutomovilService;



@SpringBootApplication
public class ProyectoPaU2HcT11Application implements CommandLineRunner{

		@Autowired
		private IAutomovilService automovilService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2HcT11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	
		/*
		cliente2.setApellido("Jose");
		cliente2.setNombre("Lopez");
		cliente2.setAnioNacimiento(1999);
		cliente2.setCedula("175616");
		*/
		
		/*
		Automovil automovil= new Automovil();
		
		automovil.setAnio(new BigDecimal(1997));
		automovil.setColor("Rojo");
		automovil.setKilometraje(new BigDecimal(1997));
		automovil.setMarca("Mazda");
		automovil.setModelo("RX-7");
		automovil.setPlaca("NFS478");
		automovil.setPrecio(new BigDecimal(30000));
		
		automovilService.insertar(automovil);
		
		*/
	
		automovilService.buscarPorColorTypedQuery("Rojo");System.out.println(1);
		automovilService.buscarPorModeloTypedQuery("RX-7");System.out.println(2);
		automovilService.buscarPorMarcaQueryTyped("Mazda");System.out.println(3);
		
		automovilService.buscarPorkilometrajeNamedQuery(new BigDecimal(1997));System.out.println(4);
		automovilService.buscarPorPlacaNamedQuery("NFS478");System.out.println(5);
		automovilService.buscarPorPrecioNamedQuery(new BigDecimal(30000));System.out.println(6);
		
		
		automovilService.buscarPorColorNativeQuery("Rojo");System.out.println(7);
		automovilService.buscarPorMarcaNativeQuery("Mazda");System.out.println(8);
		automovilService.buscarPorAnioNativeQuery(new BigDecimal(1997));System.out.println(9);
		
		
		automovilService.buscarPorColorNamedNativeQuery("Rojo");System.out.println(10);
		automovilService.buscarPorPlacaNamedNativeQuery("NFS478");System.out.println(11);
		automovilService.buscarPorMarcaNamedNativeQuery("Mazda");System.out.println(12);
	
		
	
		
		
		
		
		
	}

}
