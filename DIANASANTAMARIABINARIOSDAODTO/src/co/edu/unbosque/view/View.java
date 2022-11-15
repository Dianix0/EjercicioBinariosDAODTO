package co.edu.unbosque.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.EstudianteDTO;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada;
	private PanelRegistro panelRegistro;

	public View(Controller c) {

		setSize(800, 400);
		setResizable(false);
		setTitle("Ventana Principal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		panelEntrada = new PanelEntrada();
		add(panelEntrada, BorderLayout.NORTH);
		panelRegistro = new PanelRegistro();
		add(panelRegistro, BorderLayout.CENTER);

		panelEntrada.getBotonRegistrar().addActionListener(c);
		panelEntrada.getBotonTerminar().addActionListener(c);
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelRegistro getPanelRegistro() {
		return panelRegistro;
	}

	public void setPanelRegistro(PanelRegistro panelRegistro) {
		this.panelRegistro = panelRegistro;
	}

	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, null, JOptionPane.INFORMATION_MESSAGE);
	}
//	
//	public void mostrarCifras(int numReg, double numeros[], int valores[]) {
//		for (int i= 0 ; i<numReg ; i++) {
//			getPanelResultados().getTxtMonto().append(String.valueOf(numeros[i])+"\n");
//			getPanelResultados().getTxtValores().append(String.valueOf(valores[i])+"\n");
//		}	
//	}	

	public void mostrarRegistros(int numRegistros, EstudianteDTO[] datos) {
		for (int i = 0; i < numRegistros; i++) {
			getPanelRegistro().getTxtNombre().append(String.valueOf(datos[i].getNombre()) + "\n");
			getPanelRegistro().getTxtCarrera().append(String.valueOf(datos[i].getCarrera()) + "\n");
			getPanelRegistro().getTxtId().append(String.valueOf(datos[i].getId()) + "\n");
		}
	}

}
