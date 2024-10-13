package com.examen.LP2_T2.ImServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.LP2_T2.modelo.EmpleadoEntidad;
import com.examen.LP2_T2.repositorio.EmpleadoRepositorio;
import com.examen.LP2_T2.servicio.EmpleadoServicio;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class EmpleadoServiceImpl implements EmpleadoServicio {

	private final EmpleadoRepositorio EmpleadoRepositorio = null;	
	
	
	@Override
	public List<EmpleadoEntidad> listarEmpleado() {
		// TODO Auto
		return EmpleadoRepositorio.findAll();
	}

	@Override
	public void crearEmpleado(EmpleadoEntidad empleadoEntity) {
		
		EmpleadoRepositorio.save(empleadoEntity);
		
	}

	@Override
	public EmpleadoEntidad buscarPorDNI(String dniEmpleado) {
		
		return EmpleadoRepositorio.findByDniEmpleado(dniEmpleado);
				
	}

	@Override
	public void actualizarEmpleado(String dniEmpleado, EmpleadoEntidad empleadoEntidad) {
		EmpleadoEntidad Encontrado = buscarPorDNI(dniEmpleado);
		if (Encontrado== null) {
			throw new RuntimeException("No se encontro al Empleado");
		}
		try {
			Encontrado.setDniEmpleado(Encontrado.getDniEmpleado());
			Encontrado.setNombreEmpleado(Encontrado.getNombreEmpleado());
			Encontrado.setApellidoEmpleado(Encontrado.getApellidoEmpleado());
			Encontrado.setCorreo(Encontrado.getCorreo());
			Encontrado.setDireccion(Encontrado.getDireccion());
			Encontrado.setFechaNacimiento(Encontrado.getFechaNacimiento());
			Encontrado.setAreaEntidad(Encontrado.getAreaEntidad());
		} catch (Exception e) {
			throw new RuntimeException("No se encontro al Empleado");
		}
		
	}

	@Override
	public void eliminar(String dni) {
		EmpleadoEntidad empleadoEncontrado = buscarPorDNI(dni);
		
		if(empleadoEncontrado== null) {
			throw new RuntimeException("No se encontro al Empleado");
		}
		EmpleadoRepositorio.delete(empleadoEncontrado);
	}

}