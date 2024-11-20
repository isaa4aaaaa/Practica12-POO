import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio0{
    private static Ejercicio0 instance;
    private Queue<String> colaDocumentos;

    private Ejercicio0(){
        colaDocumentos = new LinkedList<>();
    }

    public static Ejercicio0 getInstance(){
        if(instance == null){
            instance = new Ejercicio0();
        }
        return instance;
    }

    public void agregardocumento(String documento){
        colaDocumentos.add(documento);
        System.out.println("Documento \""+documento+"\" agregadp a la cola de impresión.");
    }

    public void imprimirDocumento(){
        if(colaDocumentos.isEmpty()){
            System.out.println("No hay elementos en la cola de impresión.");
        }else{
            String documento = colaDocumentos.poll();
            System.out.println("Imprimiento docuemento: "+documento);
        }

    }

    public static void main(String[] args) {
        Ejercicio0 impresora = Ejercicio0.getInstance();

        impresora.agregardocumento("Documento 1");
        impresora.agregardocumento("Documento 2");
        impresora.agregardocumento("Documento 3");

        impresora.imprimirDocumento();
        impresora.imprimirDocumento();
        impresora.imprimirDocumento();

    }
}