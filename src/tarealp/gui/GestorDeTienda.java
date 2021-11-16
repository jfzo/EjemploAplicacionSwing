package tarealp.gui;

import tarealp.controlador.ControladorCliente;
import tarealp.controlador.ControladorProducto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorDeTienda {
    public JTable tablaClientes;
    public JTable tablaProductos;
    public JTable tablaVentas;
    private JButton agregarClienteButton;
    private JButton agregarProductoButton;
    private JButton nuevaVentaButton;
    private JButton salirButton;
    private JPanel panelGeneral;
    private JScrollPane scrollPaneClientes;
    private JScrollPane scrollPaneProductos;
    private JScrollPane scrollPaneVentas;
    public RegistrarCliente registrarCliente;
    public RegistrarProducto registrarProducto;


    public GestorDeTienda() {
        registrarCliente = new RegistrarCliente();
        registrarProducto = new RegistrarProducto();

        // Llenamos la estructura de la tabla de clientes
        this.tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {"RUT", "NOMBRES", "APELLIDOS"}
        ));

        // idem para los productos
        this.tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {"ID", "NOMBRE", "STOCK", "PRECIO"}
        ));


        agregarClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarCliente.setVisible(true);
            }
        });

        agregarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarProducto.setVisible(true);
            }
        });

        nuevaVentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("AUN NO IMPLEMEntADO");
            }
        });


        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Terminando.");
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tienda Genérica");
        GestorDeTienda ejemploProfesor = new GestorDeTienda();
        ControladorCliente gestorClientes = new ControladorCliente(ejemploProfesor);
        ControladorProducto gestorProductos = new ControladorProducto(ejemploProfesor);

        frame.setContentPane(ejemploProfesor.panelGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
