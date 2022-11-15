package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.EstudianteFile;

public class EstudianteDAO {

	ArrayList<EstudianteDTO> estudiantes;
	private EstudianteFile ef;

	public EstudianteDAO() {
		// TODO Auto-generated constructor stub
		this.estudiantes = new ArrayList<>();
		this.ef = new EstudianteFile();
	}

	public EstudianteFile getEf() {
		return ef;
	}

	public void setEf(EstudianteFile ef) {
		this.ef = ef;
	}

	public void agregarEstudiante(EstudianteDTO estudiante) {
		estudiantes.add(estudiante);
	}

	public ArrayList<EstudianteDTO> listarEstudiantes() {
		return estudiantes;
	}
}
