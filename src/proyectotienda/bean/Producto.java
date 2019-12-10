
package proyectotienda.bean;

public class Producto {
    private int clave;
    private String descripcion;
    private int cantidad;
    private double costo;
    private double precio;
    private int unidades;
    private int categoria;
    private int claveProveedor;

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getClaveProveedor() {
        return claveProveedor;
    }

    public void setClaveProveedor(int claveProveedor) {
        this.claveProveedor = claveProveedor;
    }
    
    
}
