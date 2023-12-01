package com.api.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.entity.Empleado;
import com.api.rest.repository.EmpleadoRepository;



@Service
public class EmpleadoServices {
	
	//inyeccion de dependencias
	@Autowired
	private EmpleadoRepository repo;
	
	public void registrar(Empleado bean) {
		repo.save(bean);
	}
	public void actualizar(Empleado bean) {
		repo.save(bean);
	}
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	public Empleado buscarPorCodigo(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	public List<Empleado> listarTodos(){
		return repo.findAll();// select *from tb_alumno
	}
	
}
