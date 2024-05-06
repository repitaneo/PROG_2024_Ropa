package producto;

public class Producto {

	private String codigo;
	private int cantidad;
	private float precio;
	
	
	public Producto() {
		
	}
	
	public Producto(String codigo, int cantidad, float precio) {
		super();
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "[" + codigo + " <" + cantidad + "> (" + precio + ")]";
	}
	
	
	
	
}
