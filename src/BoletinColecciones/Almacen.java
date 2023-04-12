package BoletinColecciones;

import java.util.ArrayList;

public class Almacen {
	ArrayList<Articulo> lista;

	public Almacen() {
		this.lista = new ArrayList<Articulo>();
	}

	public ArrayList<Articulo> getLista() {
		return lista;
	}

	public void alta(Articulo a) {

		// Comprobar si existe previamente el articulo en la lista
		boolean existe = false;
		for (Articulo articulo : lista) {
			if (articulo.getCodigo().equals(a.getCodigo())) {
				existe = true;
			}
		}

		if (existe) {
			System.out.println("El codigo del articulo introducido ya existe en la lista");

		} else {
			lista.add(a);
			System.out.println("El articulo ha sido dado de alta en la lista");
		}
	}

	public void baja(String codigo) {

		// Comprobar si existe previamente el articulo en la lista
		boolean existe = false;
		int posicion=-1;
		for (Articulo articulo : lista) {
			if (articulo.getCodigo().equals(codigo)) {
				existe = true;
				// Guardo la posición que ocupa el articulo existente
				posicion = lista.indexOf(articulo);
			}
		}

		if (existe) {
			lista.remove(posicion);
			System.out.println("El codigo del articulo se ha eliminado de la lista");

		} else {
			System.out.println("El articulo no exixte en la lista");
		}
	}
	
	public void entrada(String codigo, int cantidad) {

		// Comprobar si existe previamente el articulo en la lista
		boolean existe = false;
		int posicion=-1;
		for (Articulo articulo : lista) {
			if (articulo.getCodigo().equals(codigo)) {
				existe = true;
				// Guardo la posición que ocupa el articulo existente
				posicion = lista.indexOf(articulo);
			}
		}

		if (existe) {
			// CONTABILIZO la cantidad que ya tenía más la que me ha entrado de reposición	GETSTOCK
			int cantidadTotal = cantidad + lista.get(posicion).getStock();
			
			// ACTUALIZO el stock	SETSTOCK
			lista.get(posicion).setStock(cantidadTotal);
			
			System.out.println("El codigo del articulo se ha actualizado dentro de la lista");

		} else {
			System.out.println("El articulo no exixte en la lista");
		}
	}
	
	public void salida(String codigo, int cantidad) {

		// Comprobar si existe previamente el articulo en la lista
		boolean existe = false;
		int posicion=-1;
		for (Articulo articulo : lista) {
			if (articulo.getCodigo().equals(codigo)) {
				existe = true;
				// Guardo la posición que ocupa el articulo existente
				posicion = lista.indexOf(articulo);
			}
		}

		if (existe) {
			if(lista.get(posicion).getStock()>= cantidad) {
				int cantidadTotal = lista.get(posicion).getStock() - cantidad;
				
				// ACTUALIZO el stock	SETSTOCK
				lista.get(posicion).setStock(cantidadTotal);
				
				System.out.println("El stock del artículo es actualmente "+cantidadTotal+ " unidad/es");
			}else {
				System.out.println("No disponemos de la cantidad solicitada");
			}

		} else {
			System.out.println("El articulo no exixte en la lista");
		}
	}
	
	public void modificacion(Articulo a) {
		// Comprobar si existe previamente el articulo en la lista
				boolean existe = false;
				int posicion=-1;
				for (Articulo articulo : lista) {
					if (articulo.getCodigo().equals(a.getCodigo())) {
						existe = true;
						// Guardo la posición que ocupa el articulo existente
						posicion = lista.indexOf(articulo);
					}
				}
				
				if(existe) {
					lista.get(posicion).setDescripcion(a.getDescripcion());
					lista.get(posicion).setPrecio(a.getPrecio());
					lista.get(posicion).setStock(a.getStock());
					
					System.out.println("El articulo se ha modificado");
				}else {
					System.out.println("El articulo no existe en la lista");
				}
	}

	public void mostrar() {
		if(lista.isEmpty()) {
			System.out.println("No existen artículos que mostrar");
		}else {
			for (Articulo articulo : lista) {
				System.out.println(articulo);
			}
		}
		
	}
}
