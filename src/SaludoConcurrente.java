import java.time.LocalTime;

public class SaludoConcurrente extends Thread {
    
    public void run() {
        System.out.println("    Hilo: Nuevo hilo " + getName() + " (" + LocalTime.now() + ")");
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("    Hola soy el hilo " + getName());
        System.out.println("    Hilo " + getName() + " terminó (" + LocalTime.now() + ")");
    }

    public static void main(String[] args) {
        System.out.println("main: inicia ejecución a las " + LocalTime.now());

        SaludoConcurrente hilo1 = new SaludoConcurrente();
        SaludoConcurrente hilo2 = new SaludoConcurrente();

        hilo1.start();
        hilo2.start();
        
        System.out.println("main: termina ejecución a las " + LocalTime.now());
    }
}
