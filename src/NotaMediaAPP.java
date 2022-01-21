import java.util.Hashtable;

import javax.swing.JOptionPane;

public class NotaMediaAPP {

	public static void main(String[] args) {
		
		//DECLARAR VARIABLES
		String nombre;
		String nota;
		double notaFinal;
		
		//PEDIR DATOS POR PANTALLA
		nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno");
		
		//CREAR ARRAY
		double listaNotas[] = new double[5];
		
		//RECORRER ARRAY Y ALMACENAR VALORES
		for (int i = 0; i < listaNotas.length; i++) {
			nota = JOptionPane.showInputDialog("Introduce nota");
			listaNotas[i] = Double.parseDouble(nota);
		}
		
		//CALCULAR LA NOTA MEDIA
		notaFinal = (listaNotas[0] + listaNotas[1] + listaNotas[2] + listaNotas[3] + listaNotas[4]) / 5;
		
		//GUARDAR EN DICCIONARIO
		Hashtable<String, Double> ficheroNotas = new Hashtable<String, Double>();
		ficheroNotas.put(nombre, notaFinal);
		
		//MOSTRAR EN PANTALLA
		System.out.println(ficheroNotas);
	}
}
