package Tp1;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
	public static void escribirArchivo(int archivo, int[] vector, String Metodo ) {
		
		int cantidadNumeros=0;
		
		if(archivo==1) {
			 cantidadNumeros=1000;
		}else if (archivo==2) {
			 cantidadNumeros=1500;
		}else if(archivo==3) {
			 cantidadNumeros=2000;
		}
		//creo el archivo con nombre descriptivo con el metodo y la cantidad de numeros que se ordenaron
		try{FileWriter fileWriter=new FileWriter("resultado"+cantidadNumeros+"-"+Metodo+".txt");
		for(int i=0;i<vector.length-1;i++) {
			fileWriter.write(vector[i]+"\n");
		}
		fileWriter.close();
		//le indico al usuario el nombre del archivo terminado
		System.out.println("Archivo Finalizado: " + "resultado"+cantidadNumeros+"-"+Metodo+".txt");
		System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
