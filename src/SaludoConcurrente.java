// Se importa libreria que representa la hora del sistema
import java.time.LocalTime;

// Clase que extiende de Thread, se pueden crear hilos
public class SaludoConcurrente extends Thread {
    
    // Sobrescribe el método run(), define el trabajo del hilo cuando sea inicializado
    public void run() {
        // Por default el hilo se llama Thread-#, por eso getName() obtenemos ese nombre
        System.out.println("    Hilo: Nuevo hilo " + getName() + " (" + LocalTime.now() + ")");
        
        // Se usa try-catch para manejar excepciones
        // El programa no se bloqueará si ocurren problema al dormir el hilo con slepp()
        // El flujo continuará sin interrupçiones
        // try: Se genera la excepción sleep()
        try {
            Thread.sleep(2000);
        // catch: Maneja la excepción sleep()
        // El tipo de excepción que se espera es InterruptedException
        // Esto puede ocurrir cuando un hilo es interrumpido mientras está dormido
        } catch (InterruptedException e) {
            // Imprime la información relevante sobre la excepción
            // Es útil para el diagnóstico y la depuración de errores
            // Proporciona una comprensión clara de dónde y por qué ocurrió la excepción
            e.printStackTrace();
        }
        
        System.out.println("    Hola soy el hilo " + getName());
        System.out.println("    Hilo " + getName() + " terminó (" + LocalTime.now() + ")");
    }

    // Main
    public static void main(String[] args) {
        // Inicia main
        System.out.println("main: inicia ejecución a las " + LocalTime.now());

        // Instanciamos la clase SaludoConcurrente
        SaludoConcurrente hilo1 = new SaludoConcurrente();
        SaludoConcurrente hilo2 = new SaludoConcurrente();

        // El método star() inicializa la ejecución
        hilo1.start();
        hilo2.start();
        
        // Termina main
        System.out.println("main: termina ejecución a las " + LocalTime.now());
    }
}
