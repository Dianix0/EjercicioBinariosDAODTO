package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelRegistro extends JPanel {

	private JTextArea txtNombre;
	private JTextArea txtCarrera;
	private JTextArea txtId;
	private JLabel labArchivo;

	private static final long serialVersionUID = 1L;

	public PanelRegistro() {
		setLayout(new GridLayout(1, 3));
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Registros");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		labArchivo = new JLabel("Resultado de los registros");
		txtNombre = new JTextArea("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);

		txtCarrera = new JTextArea("");
		txtCarrera.setForeground(Color.BLACK);
		txtCarrera.setBackground(Color.WHITE);

		txtId = new JTextArea("");
		txtId.setForeground(Color.BLACK);
		txtId.setBackground(Color.WHITE);

		add(labArchivo);
		add(txtNombre);
		add(txtCarrera);
		add(txtId);
	}

	public JTextArea getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextArea txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextArea getTxtCarrera() {
		return txtCarrera;
	}

	public void setTxtCarrera(JTextArea txtCarrera) {
		this.txtCarrera = txtCarrera;
	}

	public JTextArea getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextArea txtId) {
		this.txtId = txtId;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}
}
