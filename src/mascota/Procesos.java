package mascota;

import java.util.HashMap;

import javax.naming.spi.DirObjectFactory;
import javax.swing.JOptionPane;

public class Procesos {
	HashMap<String, String>listMas;
	
	public void iniciar() {
		HashMap<String, Mascota> mapaMascotas = new HashMap<>();
		String preg="";
		do {
			Mascota mascota1 = new Mascota();
			mascota1.documento=JOptionPane.showInputDialog("Ingrese el documento: ");
			mascota1.nombre=JOptionPane.showInputDialog("Ingrese el nombre: ");
			mascota1.especie=JOptionPane.showInputDialog("Ingrese la especie: ");
			mascota1.edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
			mapaMascotas.put(mascota1.documento, mascota1);
			
			preg=JOptionPane.showInputDialog("Ingrese (si), para ingresar otra mascota");
		} while(preg.equalsIgnoreCase("si"));
		
		
		for (Mascota mascota : mapaMascotas.values()) {
			System.out.println("Documento: " + mascota.documento);
			System.out.println("Nombre: " + mascota.nombre);
			System.out.println("Especie: " + mascota.especie);
			System.out.println("Edad: " + mascota.edad);
			System.out.println("---------------------------");
			}
	}
}
