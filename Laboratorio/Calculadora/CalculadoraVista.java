import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculadoraVista extends JFrame{
    private JTextField display;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton botonSuma, botonResta, botonMultiplica, botonDivide, botonIgual, botonBorrar;

    public CalculadoraVista(){
        setTitle("Calculadora MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setLocationRelativeTo(null);

        JPanel panelDisplay = new JPanel();
        display = new JTextField(20);
        display.setEditable(false);
        panelDisplay.add(display);
        JPanel panelBotones = new JPanel(new GridLayout(4,4));
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        botonDivide = new JButton("/");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        botonMultiplica = new JButton("*");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        botonResta = new JButton("-");
        b0 = new JButton("0");
        botonIgual = new JButton("=");
        botonBorrar = new JButton("C");
        botonSuma = new JButton("+");

        panelBotones.add(b7);
        panelBotones.add(b8);
        panelBotones.add(b9);
        panelBotones.add(botonDivide);
        panelBotones.add(b4);
        panelBotones.add(b5);
        panelBotones.add(b6);
        panelBotones.add(botonMultiplica);
        panelBotones.add(b1);
        panelBotones.add(b2);
        panelBotones.add(b3);
        panelBotones.add(botonResta);
        panelBotones.add(b0);
        panelBotones.add(botonIgual);
        panelBotones.add(botonSuma);

        add(panelDisplay, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);

        setVisible(true);
    }

    public String getDisplay(){
        return display.getText();
    }

    public void setDisplay(String texto){
        display.setText(texto);
    }

    public void agregarListener(ActionListener listener){
        b0.addActionListener(listener);
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        b6.addActionListener(listener);
        b7.addActionListener(listener);
        b8.addActionListener(listener);
        b9.addActionListener(listener);
        botonDivide.addActionListener(listener);
        botonBorrar.addActionListener(listener);
        botonIgual.addActionListener(listener);
        botonMultiplica.addActionListener(listener);
        botonResta.addActionListener(listener);
        botonSuma.addActionListener(listener);
    }
}
