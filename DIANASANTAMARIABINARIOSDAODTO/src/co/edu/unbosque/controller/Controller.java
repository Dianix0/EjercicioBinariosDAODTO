package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.EstudianteDAO;
import co.edu.unbosque.model.EstudianteDTO;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private EstudianteDAO e;
	private View v;

	public Controller() {
		e = new EstudianteDAO();
		v = new View(this);
		v.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getActionCommand().equals(v.getPanelEntrada().REGISTRAR)) {
			v.escribirMensaje(e.getEf().escribirArchivo());
		}

		if (evento.getActionCommand().equals(v.getPanelEntrada().LEER)) {
			e.getEf().leerArchivo();
			v.mostrarRegistros(0, e.getEf().getDatos());
		}

//		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
//			bd.getBf().leerRegistro();
//			gui.mostrarRegistros(3, 
//					bd.getBf().getDatos());
//		}
	}

	public void obtenerDatos() {
		boolean r = false;
		while (r == true) {
			if (v.getPanelEntrada().getTxtNombre().getText().equals(null)
					| v.getPanelEntrada().getTxtCarrera().getText().equals(null)
					| v.getPanelEntrada().getTxtId().getText().equals(null)) {
				r = false;
			} else {
				r = true;
			}
			String nombre = v.getPanelEntrada().getTxtNombre().getText();
			String carrera = v.getPanelEntrada().getTxtCarrera().getText();
			int id = Integer.parseInt(v.getPanelEntrada().getTxtNombre().getText());
			EstudianteDTO estudiante = new EstudianteDTO(nombre, carrera, id);
			e.agregarEstudiante(estudiante);
		}
	}
}
