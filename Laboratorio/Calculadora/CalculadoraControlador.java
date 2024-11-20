import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraControlador implements ActionListener{
    private CalculadoraModelo modelo;
    private CalculadoraVista vista;
    private double numero1;
    private String operador;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista){
        this.modelo = modelo;
        this.vista = vista;
        this.vista.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent o){
        String comando = o.getActionCommand();

        if(comando.matches("[0-9]")){
            vista.setDisplay(vista.getDisplay() + comando);
        }else if(comando .equals("+") || comando.equals("-") || comando.equals("/") || comando.equals("*")){
            numero1 = Double.parseDouble(vista.getDisplay());
            operador = comando;
            vista.setDisplay("");
        }else if(comando.equals("=")){
            double numero2 = Double.parseDouble(vista.getDisplay());
            switch(operador){
                case "+":
                modelo.sumar(numero1,numero2);
                break;
                case "-":
                modelo.restar(numero1,numero2);
                break;
                case "*":
                modelo.multiplicar(numero1, numero2);
                break;
                case "/":
                modelo.dividir(numero1, numero2);
                break;
            }
            vista.setDisplay(String.valueOf(modelo.getResultado()));
        }else if(comando.equals("C")){
            vista.setDisplay("");
        }

    }
}
