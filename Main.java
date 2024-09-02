package Tp1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Bienvenido!");

		boolean continuar = true;
		System.out.println("Ingrese el archivo que quiere abrir para ordenar");
		
		while ((continuar)) {
			try {
				System.out.println("Opcion 1: Archivo pequeño ");
				System.out.println("Opcion 2: Archivo mediano ");
				System.out.println("Opcion 3: Archivo Grande ");
				System.out.println("Opcion 4: Salir");
				System.out.print("Elije una opcion: ");
				System.out.println();
				
				//verifico que sea un entero
				if (Teclado.esEntero()) {
					int archivo = Teclado.leerEntero();
					switch (archivo) {
					case 1:
						System.out.println("Elegiste el archivo pequeño");
						Menu.menu(archivo);
						break;
					case 2:
						System.out.println("Elegiste el archivo mediano");
						Menu.menu(archivo);
						break;
					case 3:
						System.out.println("Elegiste el archivo grande");
						Menu.menu(archivo);
						break;
					case 4:
						//el unico caso donde la variable continuar cambia y sale del programa
						System.out.println("Elegiste cerrar el programa");
						continuar = false;
						break;
					default:
						System.out.println("Opcion invalida, reintente");
						break;
					}
				} else {
					System.out.println("Solo se permiten números");
					Teclado.limpiarBuffer();
				}
			} catch (Exception e) {
				System.out.println("solo se permiten numeros");
				Teclado.limpiarBuffer();
			}
		}

		System.out.println("Fin del programa, muchas gracias :)");
		Teclado.finalizar();
	}
}
