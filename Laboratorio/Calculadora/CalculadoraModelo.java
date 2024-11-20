public class CalculadoraModelo {
    private double resultado;

    public void sumar(double numero1, double numero2){
        resultado = numero1 + numero2;
    }

    public void restar(double numero1, double numero2){
        resultado = numero1 - numero2;
    }

    public void multiplicar(double numero1, double numero2){
        resultado = numero1 * numero2;
    }

    public void dividir(double numero1, double numero2){
        if(numero2 != 0){
            resultado = numero1 / numero2;
        } else {
            resultado = Double.NaN; 
        }
    }

    public double getResultado(){
        return this.resultado;
    }
}
