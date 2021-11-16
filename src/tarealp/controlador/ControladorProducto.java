package tarealp.controlador;

import tarealp.gui.GestorDeTienda;
import tarealp.gui.RegistrarCliente;
import tarealp.gui.RegistrarProducto;
import tarealp.modelo.Cliente;
import tarealp.modelo.Direccion;
import tarealp.modelo.Producto;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ControladorProducto implements ActionListener {
    List<Producto> productos;
    RegistrarProducto gestor;
    GestorDeTienda vistaPrincipal;
    DefaultTableModel modelo;

    public ControladorProducto(GestorDeTienda vistaPrincipal) {
        modelo = new DefaultTableModel();
        productos = new ArrayList<>();
        this.vistaPrincipal = vistaPrincipal;
        this.gestor = this.vistaPrincipal.registrarProducto;
        this.gestor.buttonRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == gestor.buttonRegistrar){
            System.out.println("Registrando nuevo producto.");
            agregarNuevoProducto();
            listarProductos();
            gestor.dispose();
        }
    }

    private void listarProductos() {
        this.modelo = (DefaultTableModel) vistaPrincipal.tablaProductos.getModel();
        modelo.setRowCount(0); // se limpia la tabla
        Object[] obj = new Object[4]; // 4 columnas
        for(int i =0; i< this.productos.size(); i++){
            obj[0] = this.productos.get(i).getId();
            obj[1] = this.productos.get(i).getNombre();
            obj[2] = this.productos.get(i).getStock_disponible();
            obj[3] = this.productos.get(i).getPrecio();
            modelo.addRow(obj);
        }
        vistaPrincipal.tablaProductos.setModel(modelo);
    }

    private void agregarNuevoProducto() {
        // String nombre, String descripcion,Integer stock, Integer precio
        Producto producto = new Producto(
                this.productos.size() + 1,
                this.gestor.txtNombre.getText(),
                this.gestor.txtDescripcion.getText(),
                Integer.parseInt(this.gestor.txtStock.getText()),
                Integer.parseInt(this.gestor.txtPrecio.getText())
                );

        System.out.println(producto);

        this.productos.add(producto);
    }
}
