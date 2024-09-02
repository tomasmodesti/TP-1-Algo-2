package Tp1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
	public static int[] leerLineasArchivo(int cantidadLineas) {
		int cantidadNumeros = 1;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("numeros_" + cantidadLineas + ".txt"))) {
			// Use esto para evitar que me salte el error, tecnicamente la estoy usando
			@SuppressWarnings("unused")
			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				cantidadNumeros++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return new int[0];
		} catch (IOException e) {
			e.printStackTrace();
			return new int[0];
		}
		// creo el vector con el espacio necesario
		int[] resultado = new int[cantidadNumeros];
		// leo por segunda ves para poner los numeros del archivo en el vector
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("numeros_" + cantidadLineas + ".txt"))) {
			String linea;
			int i = 0;
			while ((linea = bufferedReader.readLine()) != null) {
				resultado[i++] = Integer.valueOf(linea);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("No se encontro el archivo");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error al leer el archivo");
		}

		return resultado;
	}

	public static int[] leerArchivo(int archivo) {

		// se que no puede llegar otra cosa que no sea 1, 2 o 3
		int cantidadLineas;
		if (archivo == 1) {
			cantidadLineas = 1000;
		} else if (archivo == 2) {
			cantidadLineas = 1500;
		} else {
			cantidadLineas = 2000;
		}
		int[] resultado = leerLineasArchivo(cantidadLineas);
		return resultado;
	}
}
