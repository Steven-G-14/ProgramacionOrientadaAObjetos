package vista;

import javax.swing.*;
import java.awt.*;


public class PanelProducto extends JPanel {

    private JLabel multiplicandoL, multiplicadorL, resultadoL;
    private JTextField multiplicando, multiplicador, resultado;
    private JButton botonCalcular;

    public PanelProducto(){
        setLayout(new GridLayout(4,3,10,10));
        setBackground((Color.BLUE));
        setBorder(BorderFactory.createTitledBorder("panel producto"));

       multiplicandoL  = new JLabel("Numero 1:");
       multiplicandoL  = new JLabel("Numero 2:");
       resultadoL = new JLabel("Resultado: ");

      multiplicando  = new JTextField(10);
      multiplicador  = new JTextField(10);
      resultado = new JTextField(15);
      resultado.setEditable(false);

      botonCalcular = new JButton("Calcular");
       botonCalcular.setActionCommand("CALCULAR");

       add(multiplicandoL);
       add(multiplicando);
       add(multiplicandoL);
       add(multiplicadorL);
       add(multiplicador);
       add(botonCalcular);
       add(resultadoL);
       add(resultado);


    }

    public JTextField getMultiplicando() {return multiplicando;}
    public JTextField getMultiplicador() {return multiplicador;}
    public JTextField getResultado() {return resultado; }
    public JButton getBotonCalcular() {return botonCalcular;}
    
}
