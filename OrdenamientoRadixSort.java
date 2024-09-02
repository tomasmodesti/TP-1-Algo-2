package Tp1;

import java.util.Arrays;

public class OrdenamientoRadixSort {
    
    public static void radixSort(int[] vector) {
        if (vector.length == 0) return;
        
        int max = Arrays.stream(vector).max().orElse(0);
        int exp = 1;
        
        while (max / exp > 0) {
            contador(vector, exp);
            exp *= 10;
        }
    }
    
    private static void contador(int[] vector, int exp) {
        int n = vector.length;
        int[] output = new int[n];
        int[] count = new int[10];
        
        Arrays.fill(count, 0);
        
       
        for (int i = 0; i < n; i++) {
            int index = (vector[i] / exp) % 10;
            count[index]++;
        }
        
       
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        
    
        for (int i = n - 1; i >= 0; i--) {
            int index = (vector[i] / exp) % 10;
            output[count[index] - 1] = vector[i];
            count[index]--;
        }
        
      
        System.arraycopy(output, 0, vector, 0, n);
    }
    
    public static int radixsort(int archivo) {
        
    	//leo el archivo que el usuario eligio
        int[] vector = LeerArchivo.leerArchivo(archivo);
                        
        //ordeno el vector
        radixSort(vector);
                
        //Escribo el archivo de resultado
        EscribirArchivo.escribirArchivo(archivo, vector, "RadixSort");
        
        return 0;
    }
}
