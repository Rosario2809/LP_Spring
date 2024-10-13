package com.examen.LP2_T2.servicio;

import java.util.List;
import java.util.*;

import com.examen.LP2_T2.modelo.EmpleadoEntidad;

public interface EmpleadoServicio {
	List<EmpleadoEntidad> listarEmpleado();
	void crearEmpleado(EmpleadoEntidad empleadoEntidad);
	EmpleadoEntidad buscarPorDNI(String dniEmpleado);
	void actualizarEmpleado(String dni, EmpleadoEntidad empleadoEntidad);
	void eliminar (String dni);
}
