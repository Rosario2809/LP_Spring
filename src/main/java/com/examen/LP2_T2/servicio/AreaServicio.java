package com.examen.LP2_T2.servicio;

import java.util.List;

import com.examen.LP2_T2.modelo.AreaEntidad;

public interface AreaServicio {
	List<AreaEntidad> obtenerAreas();
	void crearArea(AreaEntidad areaEntity);
}
