package tarealp.gui;

import tarealp.modelo.Cliente;
import tarealp.modelo.Direccion;

import javax.swing.*;

public class RegistrarCliente extends JDialog {
    public  JPanel contentPane;
    public JButton buttonRegistrar;
    public  JTextField txtRut;
    public  JTextField txtNombres;
    public  JTextField txtApellidos;
    public  JTextField txtCalle;
    public  JTextField txtNumero;
    public  JTextField txtComuna;
    public  JTextField txtRegion;
    //private JButton buttonCancel;

    public RegistrarCliente(JDialog owner) {
        super(owner);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonRegistrar);

    }


    public RegistrarCliente() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonRegistrar);
        setSize(400, 400);
        setVisible(false);


    }



    public static void main(String[] args) {
        RegistrarCliente dialog = new RegistrarCliente();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
