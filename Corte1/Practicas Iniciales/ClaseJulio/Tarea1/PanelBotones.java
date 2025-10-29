package vista;

import javax.swing.*;
import java.awt.*;



public class PanelBotones extends JPanel {

    private JButton btnLimpiar, btnSuma, btnProducto;

    public PanelBotones() {
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setActionCommand("LIMPIAR");
        
        btnSuma = new JButton("Sumadora");
        btnSuma.setActionCommand("Sumar");

        btnProducto = new JButton("Multiplicadora");
        btnProducto.setActionCommand("PRODUCTO");

        add(btnLimpiar);
        add(btnSuma);
        add(btnProducto);


    }

    public JButton getBtnLimpiar() { return btnLimpiar; }
    public JButton getBtnSuma() { return btnSuma; }
    public JButton getBtnProducto() { return btnProducto; }
    
}
