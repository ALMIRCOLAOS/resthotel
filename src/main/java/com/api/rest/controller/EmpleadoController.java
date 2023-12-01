package com.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entity.Empleado;
import com.api.rest.services.EmpleadoServices;


@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	private EmpleadoServices servicioAlu;
	
	@GetMapping("/lista")
	public List<Empleado> lista(){
		return servicioAlu.listarTodos();
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Empleado a) {
		servicioAlu.registrar(a);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Empleado a) {
		servicioAlu.registrar(a);
	}
	@DeleteMapping("/eliminar/{codi}")
	public void eliminar(@PathVariable("codi")Integer cod) {
		servicioAlu.eliminar(cod);
	}
	@GetMapping("/buscar/{codi}")
	public Empleado buscar(@PathVariable("codi")Integer cod) {
		return servicioAlu.buscarPorCodigo(cod);
	}
}


