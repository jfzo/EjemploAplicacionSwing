package tarealp.modelo;

import java.lang.Math;
import java.util.ArrayList;

public class Carrito {
    ArrayList<ItemAComprar> selecciones;
    Integer subtotal;
    Double impto;
    public Integer valorTotal;
    Cliente cliente;

    public Carrito(Cliente comprador){
        selecciones = new ArrayList<>();
        subtotal = 0;
        impto = 0.0;
        valorTotal = 0;
        cliente = new Cliente(comprador);
    }

    public void agregarItem(ItemAComprar item){
        selecciones.add(item);
    }

    public void finalizarCompra(){
        for(int i=0; i < selecciones.size(); i++){
            ItemAComprar sel = selecciones.get(i);
            this.subtotal += (sel.item.precio * sel.cantidad);
            this.impto += (sel.item.precio * sel.cantidad)*0.2;
        }
        this.valorTotal = this.subtotal + (int)Math.round(this.impto);

    }

    public String obtenerDetalle(){
        return new String();
    }
}
