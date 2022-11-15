package co.edu.unbosque.model.persistence;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

import co.edu.unbosque.model.EstudianteDTO;

public class EstudianteFile {

	private String ruta = "./data/estudiantes.dat";
	private int numregistros;
	private File f;
	private FileOutputStream fos;
	private DataOutputStream dos;
	private FileInputStream fis;
	private DataInputStream dis;
	private ObjectOutputStream out;
	private ObjectInputStream ois;
//	private double numeros[];
//	private int valores[];
//	private EstudianteDTO registrosEstudiantes;
//	private EstudianteDTO[] datos;

	public EstudianteFile() {
		// TODO Auto-generated constructor stub
		f = new File(ruta);
	}

	public String escribirArchivo(ArrayList estudiantes) {
		String mensaje = "Estudiante(s) registrados Exitosamente!";
		try {
			fos = new FileOutputStream(f);
			out = new ObjectOutputStream(fos);
			out.writeObject(estudiantes);
			out.close();
			fos.close();
		} catch (FileNotFoundException e) {
			mensaje = "No se encontro el archivo";
		} catch (IOException e) {
			mensaje = "Error IO";
		}
		return mensaje;
	}

	public void leerArchivo(ArrayList estudiantes) {
		try {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			EstudianteDTO estudiante = (EstudianteDTO) ois.readObject();
			System.out.println(estudiante);
			for (int i = 0; i < estudiantes.size(); i++) {
//				System.out.println(datos[i].getCarrera());
//				System.out.println(datos[i].getNombre());
//				System.out.println(datos[i].getId());
			}
			ois.close();
			fis.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("errorinfinito");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("io");
		}
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public int getNumregistros() {
		return numregistros;
	}

	public void setNumregistros(int numregistros) {
		this.numregistros = numregistros;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

	public FileOutputStream getFos() {
		return fos;
	}

	public void setFos(FileOutputStream fos) {
		this.fos = fos;
	}

	public DataOutputStream getDos() {
		return dos;
	}

	public void setDos(DataOutputStream dos) {
		this.dos = dos;
	}

	public FileInputStream getFis() {
		return fis;
	}

	public void setFis(FileInputStream fis) {
		this.fis = fis;
	}

	public DataInputStream getDis() {
		return dis;
	}

	public void setDis(DataInputStream dis) {
		this.dis = dis;
	}
}
