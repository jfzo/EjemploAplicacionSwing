import tarealp.modelo.*;

public class TiendaOnline {
    public static void main(String[] args) {
        // Crear productos
            Producto a1 = new Producto(1, "peugeot 305", "automovil 5 puertas hibrido", 1,8500000);
            a1.agregarStrock(10);
        Producto a2 = new Producto(2,"mazda 5", "automovil 3 puertas electrico", 2,1000000);
        a2.agregarStrock(5);
        Producto a3 = new Producto(3, "suzuki baleno", "automovil 5 puertas bencina", 3,8000000);
        a3.agregarStrock(15);
        Producto a4 = new Producto(4, "nissan qashqai", "suv 5 puertas diesel", 4,11000000);
        Producto a5 = new Producto(5, "chevrolet a4", "camioneta 2 puertas carga", 5,15000000);
        a5.agregarStrock(3);

        // Crear clientes
        Cliente c1 = new Cliente(
                "Juan Francisco",
                "Zamora Osorio",
                "153409595",
                new Direccion("las pataguas", 434, "quilpue", "valparaíso")
        );

        System.out.println(c1.direccion);

        // generar compras
        Carrito carrito = new Carrito(c1);
        ItemAComprar item1 = new ItemAComprar(a2, 3);
        ItemAComprar item2 = new ItemAComprar(a3, 2);

        carrito.agregarItem(item1);
        carrito.agregarItem(item2);

        carrito.finalizarCompra();
        System.out.println("Su total es "+carrito.valorTotal);
    }
}
