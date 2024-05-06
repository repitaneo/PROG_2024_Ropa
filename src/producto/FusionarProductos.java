package producto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FusionarProductos {

	
	
	public static Set<Producto> fusionar(List<String> nombresArchivos) {
		
		Set<Producto> productos = new HashSet<Producto>();
		
		
		for(String nombre: nombresArchivos) {

			// abrir el fichero que "toque"
			try {
				BufferedReader ficheroEntrada = new BufferedReader(new FileReader(nombre));
				
				while (ficheroEntrada.ready()) {

					String codigo = ficheroEntrada.readLine();
					String cantidad = ficheroEntrada.readLine();
					String precio = ficheroEntrada.readLine();
					String asteriscos = ficheroEntrada.readLine();

					Producto p = FactoryProductos.crearProducto(codigo,precio,cantidad);
					Producto dentro = Buscador.buscarProducto(productos,p);
					
					if(dentro!=null) {

						productos.remove(dentro);
						
						float nuevoPrecio = (p.getPrecio()>dentro.getPrecio())
												?p.getPrecio()
												:dentro.getPrecio();
						
						Producto nuevo = new Producto(p.getCodigo(),
													p.getCantidad()+dentro.getCantidad(),
													nuevoPrecio);
						
						productos.add(nuevo);
						
					}
					else productos.add(p);
				}
				ficheroEntrada.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return productos;
	}
	
	
}
