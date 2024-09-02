package Tp1;

public class OrdenamientoBurbujeoMejorado {
	public static int ordenamientoBurubujeo(int archivo) {
		//leo el archivo
		int[] vector=LeerArchivo.leerArchivo(archivo);
		
		//logica del ordenamiento
		boolean cambios=true;
		int i=0;
		
		while(cambios && i<vector.length-1) {
			cambios=false;
			
			for(int j = 0; j <vector.length-1; j++) {
				if(vector[j]>vector[j+1]) {
					int aux=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=aux;
					cambios=true;
				}
			}
				i++;
		}
		
		//escribo el archvio
		EscribirArchivo.escribirArchivo(archivo, vector, "Burbujeo");
		
		return 0;
	}
}
