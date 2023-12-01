package com.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entity.Cargo;
import com.api.rest.services.CargoServices;

@RestController
@RequestMapping("/cargo")
public class CargoController {
	@Autowired
	private CargoServices servicioCar;
	
	@GetMapping("/lista")
	public List<Cargo> lista(){
		return servicioCar.listarTodos();
	}
}
