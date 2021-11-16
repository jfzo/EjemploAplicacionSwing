package tarealp.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarProducto extends JDialog {
    private JPanel contentPane;
    public JButton buttonRegistrar;
    public JTextField txtNombre;
    public JTextField txtDescripcion;
    public JTextField txtPrecio;
    public JTextField txtStock;

    public RegistrarProducto() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonRegistrar);
        setSize(400, 250);
        setVisible(false);

        buttonRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public static void main(String[] args) {
        RegistrarProducto dialog = new RegistrarProducto();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
