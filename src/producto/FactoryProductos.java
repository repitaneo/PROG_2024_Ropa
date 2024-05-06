package producto;

public class FactoryProductos {

	public static Producto crearProducto(String codigo, String precio, String cantidad) {

		Producto p = new Producto();
		
		p.setCodigo(codigo);
		p.setCantidad(Integer.parseInt(cantidad));
		p.setPrecio(Float.parseFloat(precio));
		
		return p;
	}

}
