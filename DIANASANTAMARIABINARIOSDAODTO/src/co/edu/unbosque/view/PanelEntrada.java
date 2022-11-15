package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNombre;
	private JTextField txtCarrera;
	private JTextField txtId;
	private JButton botonTerminar;
	private JButton botonRegistrar;
	public static final String REGISTRAR = "Registrar";
	public static final String TERMINAR = "Terminar";

	public PanelEntrada() {
		setLayout(new GridLayout(4, 2));
		TitledBorder border = BorderFactory.createTitledBorder("Registro Estudiantes");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		labEntrada = new JLabel("Registrese con sus datos en los espacios correspondientes:");
		txtNombre = new JTextField("Ingrese su nombre");
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setBackground(Color.WHITE);
		txtCarrera = new JTextField("Ingrese su carrera");
		txtCarrera.setForeground(Color.GRAY);
		txtCarrera.setBackground(Color.WHITE);
		txtId = new JTextField("Ingrese su numero de documento");
		txtId.setForeground(Color.GRAY);
		txtId.setBackground(Color.WHITE);
		botonTerminar = new JButton("Terminar y mostrar");
		botonTerminar.setActionCommand(TERMINAR);
		botonRegistrar = new JButton("Registrar");
		botonRegistrar.setActionCommand(REGISTRAR);

		add(labEntrada);
		add(txtNombre);
		add(new JLabel(""));
		add(txtCarrera);
		add(new JLabel(""));
		add(txtId);
		add(botonTerminar);
		add(botonRegistrar);

	}

	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtCarrera() {
		return txtCarrera;
	}

	public void setTxtCarrera(JTextField txtCarrera) {
		this.txtCarrera = txtCarrera;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JButton getBotonTerminar() {
		return botonTerminar;
	}

	public void setBotonTerminar(JButton botonTerminar) {
		this.botonTerminar = botonTerminar;
	}

	public static String getTerminar() {
		return TERMINAR;
	}

	public JButton getBotonRegistrar() {
		return botonRegistrar;
	}

	public void setBotonRegistrar(JButton botonRegistrar) {
		this.botonRegistrar = botonRegistrar;
	}

	public static String getRegistrar() {
		return REGISTRAR;
	}

}
