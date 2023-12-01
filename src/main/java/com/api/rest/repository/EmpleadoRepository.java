package com.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

}
