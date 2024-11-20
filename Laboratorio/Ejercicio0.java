public class Ejercicio0{
    private static final int NUM_MAX = 20;
    private static Object lock = new Object();
    private static boolean esPar = true; 

    public static void main(String[] args) {
        Thread parH = new Thread(()->{
            for (int i = 2; i <= NUM_MAX; i+=2){
                synchronized (lock) {
                    while (!esPar){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            // TODO: handle exception
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Números pares del Hilo: "+i);
                    esPar = false;
                    lock.notify();
                }
            }
        });
        Thread imparH = new Thread(()->{
            for (int i = 1; i < NUM_MAX; i+=2){
                synchronized (lock) {
                    while(esPar){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            // TODO: handle exception
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Números inpares del Hilo: "+i);
                    esPar = true;
                    lock.notify();
                }
            }
        });

        parH.start();
        imparH.start();

    }
}