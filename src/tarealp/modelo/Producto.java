package tarealp.modelo;

public class Producto {
    // atributos
    String nombre;
    String descripcion;
    Integer id;
    Integer stock_disponible;
    Integer precio;

    public Producto(Integer id, String nombre, String descripcion,Integer stock, Integer precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
        this.precio = precio;
        this.stock_disponible = stock;
    }

    public Producto(Producto otroProducto){
        this.nombre = otroProducto.nombre;
        this.descripcion = otroProducto.descripcion;
        this.id = otroProducto.id;
        this.precio = otroProducto.precio;
        this.stock_disponible = otroProducto.stock_disponible;
    }

    public void agregarStrock(int nuevo_stock){
        this.stock_disponible = this.stock_disponible + nuevo_stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getId() {
        return id;
    }

    public Integer getStock_disponible() {
        return stock_disponible;
    }

    public Integer getPrecio() {
        return precio;
    }
}
