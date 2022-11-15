package co.edu.unbosque.model;

import java.io.Serializable;

public class EstudianteDTO{

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String carrera;
	private int id;

	public EstudianteDTO(String nombre, String carrera, int id) {
		this.nombre = "";
		this.carrera = "";
		this.id = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
