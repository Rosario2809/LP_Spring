package com.examen.LP2_T2.ImServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.LP2_T2.modelo.AreaEntidad;
import com.examen.LP2_T2.repositorio.AreaRepositorio;
import com.examen.LP2_T2.servicio.AreaServicio;


@Service
public class AreaServiceImpl implements AreaServicio {

	@Autowired
	private AreaRepositorio AreaRepositorio;
	
	@Override
	public List<AreaEntidad> obtenerAreas() {
		
		return AreaRepositorio.findAll();
	}

	@Override
	public void crearArea(AreaEntidad areaEntity) {
		
		AreaRepositorio.save(areaEntity);
		
	}

}
