package com.api.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.entity.Cargo;
import com.api.rest.repository.CargoRepository;

@Service
public class CargoServices {
	
	//inyeccion de dependencias
	@Autowired
	private CargoRepository repo;
	
	public List<Cargo> listarTodos(){
		return repo.findAll();// select *from tb_cargo
	}
	
}
