package tarealp.modelo;

public class ItemAComprar {
    Producto item;
    Integer cantidad;

    public ItemAComprar(Producto item, Integer cantidad_a_llevar){
        this.item = new Producto(item);
        this.cantidad = cantidad_a_llevar;
    }
}
