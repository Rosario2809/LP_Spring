package com.examen.LP2_T2.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name ="tb_area")

public class AreaEntidad {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="area_id")
	private Integer idArea;
	
	@Column(name="nombre_area")
	private String NomArea;
}
