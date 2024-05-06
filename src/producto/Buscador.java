package producto;

import java.util.Set;

public class Buscador {

	public static Producto buscarProducto(Set<Producto> productos, Producto p) {
		
		for(Producto producto: productos) {
			
			if(producto.getCodigo().compareTo(p.getCodigo())==0) {
				
				return producto;
			}
		}
		return null;
	}

}
