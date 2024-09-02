package Tp1;

public class Menu {

	public static int menu(int archivo) {
		System.out.println("Ahora elija que metodo va a utilizar para ordenar el archivo");
		System.out.println("1 para Burbujeo");
		System.out.println("2 para QuickSort");
		System.out.println("3 para RadixSort");

		long tiempoInicial;
		long tiempoFinal;

		boolean ordenado = false;

		while (!(ordenado)) {

			try {
				if (Teclado.esEntero()) {
					int metodo = Teclado.leerEntero();
					Teclado.limpiarBuffer();
					switch (metodo) {
					case 1:

						System.out.println("Elegiste el metodo de burbujeo, empezando ordenamiento");
						tiempoInicial = System.currentTimeMillis();
						OrdenamientoBurbujeoMejorado.ordenamientoBurubujeo(archivo);
						tiempoFinal = System.currentTimeMillis();
						//le mustro al usuario el tiempo que se demoro el programa
						System.out.println(
								"El programa se tardo " + (tiempoFinal - tiempoInicial) + " milisegundos en realizar");
						System.out.println();
						ordenado = true;
						break;

					case 2:

						System.out.println("Elegiste el metodo de QuickSort, empezando ordenamiento");
						tiempoInicial = System.currentTimeMillis();
						OrdenamientoQuickSort.quickSort(archivo);
						tiempoFinal = System.currentTimeMillis();
						//le mustro al usuario el tiempo que se demoro el programa
						System.out.println(
								"El programa se tardo " + (tiempoFinal - tiempoInicial) + " milisegundos en realizar");
						ordenado = true;
						break;

					case 3:

						System.out.println("Elegiste el metodo de RadixSort, empezando ordenamiento");
						tiempoInicial = System.currentTimeMillis();
						OrdenamientoRadixSort.radixsort(archivo);
						tiempoFinal = System.currentTimeMillis();
						//le mustro al usuario el tiempo que se demoro el programa
						System.out.println(
								"El programa se tardo " + (tiempoFinal - tiempoInicial) + " milisegundos en realizar");
						ordenado = true;
						break;

					default:

						System.out.println("Elija un metodo disponible");
						System.out.print("Introduzca un numero valido:");
						break;

					}
				} else {
					System.out.print("Entrada no valida, solo numeros, ingrese uno ahora:");
					Teclado.limpiarBuffer();
				}
			} catch (Exception e) {
				System.out.print("Entrada no válida, por favor ingrese un número ahora:");
				Teclado.limpiarBuffer();
			}
		}

		
		return 0;
	}

}
