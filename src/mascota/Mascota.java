package mascota;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;


public class Mascota {

	HashMap<String, String>mapaMascotas;
	ArrayList<String>listMas;
	
	String documento;
	String nombre;
	String especie;
	int edad;

	public Mascota() {
		
	}
	public Mascota(String nombre, String especie, int edad) {
		this.documento = documento;
		this.nombre = nombre;
		this.especie=especie;
		this.edad=edad;
		
	}
	public void mostrarInformacion() {

		System.out.println("Documento: "+ this.documento);
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("Especie: "+ this.especie);
		System.out.println("Edad: " + this.edad + "años");
	}
	public void hacerSonido() {
		if(especie.equalsIgnoreCase("perro")) {
			System.out.println("¡Guau guau!");
		}else if(especie.equalsIgnoreCase("gato")) {
			System.out.println("¡Miau miau");
		}else {
			System.out.println("La mascota no hace sonidos conocidos.");
		}
	}
	public void dormir() {
		System.out.println(nombre+" se durmio.");
	}
	public void comer() {
		System.out.println(nombre + " está comiendo.");
	}
	public void ListMas() {
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
		if(listMas.contains(nombre)) {
			for(String elemento: listMas) {
				int pos=listMas.indexOf(elemento);
				if(listMas.get(pos).equalsIgnoreCase(nombre)) {
					System.out.println("La mascota "+nombre+ ", si existe");
				}
			}
		}else {
				System.out.println("Ese ciudad no existe en ningún país");
		}
	
}
}