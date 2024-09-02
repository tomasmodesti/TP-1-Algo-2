package Tp1;

import java.util.Scanner;

public class Teclado {
	//estas funciones me sirven para manejar correctamente los inputs del usuario
	public static Scanner scanner = null;

	public static void iniciar() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
	}

	public static boolean esEntero() {
		if (scanner == null) {
			iniciar();
		}
		return scanner.hasNextInt();		
	}
	
	public static String leer() {
		if (scanner == null) {
			iniciar();
		}
		return scanner.next();
	}
	

	
	public static int leerEntero() {
		if (scanner == null) {
			iniciar();
		}
		return scanner.nextInt();
	}
	
	public static void limpiarBuffer() {
		if (scanner == null) {
			iniciar();
		}
			scanner.nextLine(); 
	}

	public static void finalizar() {
		if (scanner != null) {
			scanner.close();
		}
	}
}
