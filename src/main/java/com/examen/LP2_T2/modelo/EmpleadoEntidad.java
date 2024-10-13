package com.examen.LP2_T2.modelo;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_empleado")

public class EmpleadoEntidad {

	@Id
	@Column(columnDefinition = "CHAR(8)",nullable= false, unique = true)
	private String dniEmpleado;
	
	@Column(name="nombre_empleado", nullable = false)
	private String NombreEmp;
	
	@Column(name="apellido_empleado", nullable = false)
	private String ApellidoEmp;
	
	@Column(name="fecha_nacimiento",  nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate Fecha_nac;
	
	@Column(name="direccion", nullable = false)
	private String Direccion;
	
	@Column(name="correo", nullable = false, unique = true )
	private String Correo;
	
	@ManyToOne
	@JoinColumn(name="area_id", nullable = false)
	private AreaEntidad AreaEntidad;

	 // Getters y Setters

    public String getDniEmpleado() {
        return dniEmpleado;
    }

    public void setDniEmpleado(String dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmp;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.ApellidoEmp = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return ApellidoEmp;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.ApellidoEmp = apellidoEmpleado;
    }

    public LocalDate getFechaNacimiento() {
        return Fecha_nac;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.Fecha_nac = fechaNacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }
    
    public AreaEntidad getArea() {
        return AreaEntidad;
    }

    public void setArea(AreaEntidad area) {
        this.AreaEntidad = area;
    }

   
}