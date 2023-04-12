package BoletinColecciones;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
		 * control de los artículos de un almacén. De cada artículo se debe saber el
		 * código, la descripción, el precio de venta y el stock (número de unidades).
		 * El menú del programa debe tener, las siguientes opciones: 
		 * 
		 * 1. Listado 
		 * 2. Alta
		 * 3. Baja 
		 * 4. Modificación 
		 * 5. Entrada de mercancía 
		 * 6. Salida de mercancía 
		 * 7.Salir 
		 * 
		 * La entrada y salida de mercancía supone respectivamente el incremento y
		 * decremento de stock de un determinado artículo. Hay que controlar que no se
		 * pueda sacar más mercancía de la que hay en el almacén. Habría que crear la
		 * clase Producto con los atributos que dice el enunciado. Por otro lado estaría
		 * la clase Almacen, que tendría una lista de Artículos, y tendría una seríe de
		 * método para gestionar cada una de las operaciones que se muestran en el menú.
		 * En la clase principal del proyecto habría una instancia del almacen, y un
		 * menú que iria llamando a los distintos métodos de la clase almacen
		 */

		Almacen almacen = new Almacen();
		int opcion;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n\n1. Listado \n" + "2. Alta\n" + "3. Baja \n" + "4. Modificación \n"
					+ "5. Entrada de mercancía \n" + "6. Salida de mercancía \n" + "7. Salir ");
			opcion = sc.nextInt();
		
			switch (opcion) {
			case 1:
				System.out.println("Mostrando el almacén");
				almacen.mostrar();
				break;
			case 2:
				sc = new Scanner(System.in);
				System.out.println("Alta");
				System.out.println("Introduce codigo: ");
				String codigo = sc.nextLine();
				System.out.println("Introduce descripcion: ");
				String descripcion = sc.nextLine();
				System.out.println("Introduce precio: ");
				double precio = sc.nextDouble();
				System.out.println("Introduce stock: ");
				int stock = sc.nextInt();
				
				Articulo a = new Articulo(codigo, descripcion, precio, stock);
				almacen.alta(a);
				break;
			case 3:
				sc = new Scanner(System.in);
				System.out.println("baja");
				System.out.println("Introduce codigo: ");
				String codigo2 = sc.nextLine();
				almacen.baja(codigo2);
				break;
			case 4:
				sc = new Scanner(System.in);
				System.out.println("Modificacion");
				System.out.println("Introduce codigo: ");
				String codigo3 = sc.nextLine();
				System.out.println("Introduce descripcion: ");
				String descripcion3 = sc.nextLine();
				System.out.println("Introduce precio: ");
				double precio3 = sc.nextDouble();
				System.out.println("Introduce stock: ");
				int stock3 = sc.nextInt();
				
				Articulo a3 = new Articulo(codigo3, descripcion3, precio3, stock3);
				almacen.modificacion(a3);
				break;
			case 5:
				sc = new Scanner(System.in);
				System.out.println("Entrada de Mercancia: ");
				System.out.println("Introduce codigo: ");
				String codigo4 = sc.nextLine();
				System.out.println("Introduce stock: ");
				int stock4 = sc.nextInt();
				
				almacen.entrada(codigo4, stock4);
				
				
				break;
			case 6:
				sc = new Scanner(System.in);
				System.out.println("Salida de Mercancia: ");
				System.out.println("Introduce codigo: ");
				String codigo5 = sc.nextLine();
				System.out.println("Introduce stock: ");
				int stock5 = sc.nextInt();
				
				almacen.salida(codigo5, stock5);
				
				break;
			case 7:
				sc = new Scanner(System.in);
				System.out.println("Hasta pronto!!!");
				break;
			default:
				System.out.println("Opcion no disponible!!!");
				break;
			}
			
		} while (opcion !=7);
		
	
	}

}
