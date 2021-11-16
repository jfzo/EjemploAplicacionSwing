package tarealp.controlador;

import tarealp.gui.Example;
import tarealp.gui.GestorDeTienda;
import tarealp.gui.RegistrarCliente;
import tarealp.modelo.Cliente;
import tarealp.modelo.Direccion;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ControladorCliente implements ActionListener {
    List<Cliente> clientes;
    RegistrarCliente gestor;
    GestorDeTienda vistaPrincipal;
    DefaultTableModel modelo;

    public ControladorCliente(GestorDeTienda vistaPrincipal) {
        modelo = new DefaultTableModel();
        clientes = new ArrayList<>();
        this.vistaPrincipal = vistaPrincipal;
        this.gestor = this.vistaPrincipal.registrarCliente;
        this.gestor.buttonRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == gestor.buttonRegistrar){
            System.out.println("Registrando nuevo cliente.");
            agregarNuevoCliente();
            listarClientes();
            gestor.dispose();
        }
    }

    private void listarClientes() {
        this.modelo = (DefaultTableModel) vistaPrincipal.tablaClientes.getModel();
        modelo.setRowCount(0); // se limpia la tabla
        Object[] obj = new Object[3]; // 3 columnas
        for(int i =0; i< this.clientes.size(); i++){
            obj[1] = this.clientes.get(i).getNombres();
            obj[2] = this.clientes.get(i).getApellidos();
            obj[0] = this.clientes.get(i).getRut();
            modelo.addRow(obj);
        }
        vistaPrincipal.tablaClientes.setModel(modelo);
    }

    private void agregarNuevoCliente() {
        Cliente cliente = new Cliente(
                this.gestor.txtNombres.getText(),
                this.gestor.txtApellidos.getText(),
                this.gestor.txtRut.getText(),
                new Direccion(
                        this.gestor.txtCalle.getText(),
                        Integer.parseInt(this.gestor.txtNumero.getText()),
                        this.gestor.txtComuna.getText(),
                        this.gestor.txtRegion.getText()));
        System.out.println(cliente);

        this.clientes.add(cliente);
    }
}
