package Tp1;

public class OrdenamientoQuickSort {
	
	public static void QuickSort(int[]vector,int izquierda, int derecha) {
		//tomo el primer valor como pivote
		int pivote = vector[izquierda];
		int i = izquierda; 
        int j = derecha;
        
        while(i<j) {
        	
        	while(vector[i] <=pivote && i<j) {
        		i++;
        	}
        	while(vector[j]>pivote) {
        		j--;
        	}
        	
        	if(i<j) {
        		int aux=vector[i];
        		vector[i]=vector[j];
        		vector[j]=aux;
        		}
        	
        	}
        
        vector[izquierda]=vector[j];
    	vector[j]=pivote;
    	
    	if(izquierda<j-1) {
    		QuickSort(vector,izquierda,j-1);
    	}
    	if(j+1<derecha) {
    		QuickSort(vector,j+1,derecha);
        }
	}
	
	
	
	public static int quickSort(int archivo) {
		
		//Leo el archivo
		int[] vector=LeerArchivo.leerArchivo(archivo);
				
		//ordeno el vector
		QuickSort(vector,0,vector.length-1);
		
		//lo escribo con el vector ordenado
		EscribirArchivo.escribirArchivo(archivo, vector, "QuickSort");
		
		return 0;
	}
}
