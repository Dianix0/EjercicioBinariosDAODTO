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

	private String rutaBinario = "./data/estudiantes.dat";
	private int numregistros;
	private File f;
	private FileOutputStream fos;
	private DataOutputStream dos;
	private FileInputStream fis;
	private DataInputStream dis;
//	private double numeros[];
//	private int valores[];
//	private EstudianteDTO registrosEstudiantes;
//	private EstudianteDTO[] datos;

	public String escribirArchivo(ArrayList estudiantes) {
//		datos = new EstudianteDTO[numregistros];
		f = new File(rutaBinario);
		String mensaje = "Archivo Generado Exitosamente!";
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaBinario));
			out.writeObject(estudiantes);
			out.close();
//			fos = new FileOutputStream(f);
//			dos = new DataOutputStream(fos);
//			for (int i = 0; i < numregistros; i++) {
//				dos.writeInt(i);
//			}
//			dos.close();
		} catch (FileNotFoundException e) {
			mensaje = "No se encontro el archivo";
		} catch (IOException e) {
			mensaje = "Error IO";
		}
		return mensaje;
	}

	public void leerArchivo(ArrayList estudiantes) {
//		f = new File(rutaBinario);
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream(rutaBinario));
			EstudianteDTO registro = (EstudianteDTO) ois.readObject();
//			fis = new FileInputStream(f);
//			dis = new DataInputStream(fis);
			for (int i = 0; i < estudiantes.size(); i++) {
//				System.out.println(datos[i].getCarrera());
//				System.out.println(datos[i].getNombre());
//				System.out.println(datos[i].getId());
			}
			ois.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("errorinfinito");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("io");
		}
	}

	public String getRutaBinario() {
		return rutaBinario;
	}

	public void setRutaBinario(String rutaBinario) {
		this.rutaBinario = rutaBinario;
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
//
//	public EstudianteDTO[] getDatos() {
//		return datos;
//	}
//
//	public void setDatos(EstudianteDTO[] datos) {
//		this.datos = datos;
//	}

//	public String escribirRegistro() {
//		String mensaje = "Registro de Empleado Ingresado!";
//		EstudianteDTO staff[] = new EstudianteDTO[3];
////		staff[0] = new EstudianteDTO("Empleado apellido1",23,1000);
////		staff[1] = new EstudianteDTO("Empleado apellido2",45,4000);
////		staff[2] = new EstudianteDTO("Empleado apellido3",37,8000);
//
//		try {
//			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
//			out.writeObject(staff);
//			out.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//			mensaje = "Error de IO";
//		}
//		return mensaje;
//	}

//	public void leerRegistro() {
//		ObjectInputStream in;
//		try {
//			in = new ObjectInputStream(new FileInputStream(rutaReg));
//			datos = (EstudianteDTO[]) in.readObject();
//			in.close();
//			for (int i = 0; i < datos.length; i++) {
//				System.out.println(datos[i].getCarrera());
//				System.out.println(datos[i].getNombre());
//				System.out.println(datos[i].getId());
//			}
//
//		} catch (IOException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
