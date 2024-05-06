package main;

import java.util.List;
import java.util.Set;

import data.FileLister;
import producto.FusionarProductos;
import producto.Producto;

public class Start {

	
	public static void main(String[] args) {
		
		List<String> nombres = FileLister.getFileNamesStartingWithFT();
		System.out.println("voy a sacar los nombres de los ficheros");
		Set<Producto> productos = FusionarProductos.fusionar(nombres);
		
		System.out.println(productos);

	}
}
