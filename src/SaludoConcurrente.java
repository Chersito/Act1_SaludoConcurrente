// Se importa libreria que representa la hora del sistema
import java.time.LocalTime;

// Clase que extiende de Thread, se pueden crear hilos
public class SaludoConcurrente extends Thread {
    
    // Se sobreescribe el método run
    @Override
    // Método run(), define el trabajo del hilo cuando sea inicializado
    public void run() {
        // Por default el hilo se llama Thread-#, por eso getName() obtenemos ese nombre
        System.out.println("    Mensaje del "+ getName()+": Nuevo hilo " + " (" + LocalTime.now() + ")");

        // @SuppressWarnings() se utiliza para suprimir advertencias específicas del compilador
        // "deprecation" se refiere a advertencias sobre el uso de elementos obsoletos (métodos o clases )
        // Se está suprimiendo la advertencia de obsolescencia para el método getId()
        @SuppressWarnings("deprecation")
        // getId()btiene el identificador único del hilo actual
        long id = getId();
        // getPriority() se obtiene la prioridad del hilo actual
        int prioridad = getPriority();
        // Obtiene el estado actual del hilo ("NEW", "RUNNABLE", "BLOCKED", "WAITING", "TIMED_WAITING", o "TERMINATED")
        Thread.State estado = getState();
        // Obtiene el grupo de hilos al que pertenece el hilo actual.
        ThreadGroup grupo = getThreadGroup();
        
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
        
        // Presentación y Despedida de los Hilos
        System.out.println("    Hola soy el hilo " + getName());
        System.out.println("---> "+getName()+": " + getName() + " terminó ejecución a las (" + LocalTime.now() + ")");

        // Son las instrucciones solicitadas en el Ejercicio 2 a mostrar en consola
        System.out.println(getName()+": Hola soy un hilo");
        System.out.println(getName()+": Mi nombre = " + getName());
        System.out.println(getName()+": ID: " + id);
        System.out.println(getName()+": Prioridad: " + prioridad);
        System.out.println(getName()+": Estado: " + estado);
        System.out.println(getName()+": Grupo al que pertenece: " + grupo.getName()+"\n");
    }

    // Método para mostrar el Estado de los Hilos
    public static void mostrarEstadoHilos(){
        System.out.println("main---> Estado de los hilos: ");
        // Mostrar el estado de los hilos ejecutados actuales
        System.out.println("        main: hilo1 = " + Thread.currentThread().getState());
        System.out.println("        main: hilo2 = " + Thread.currentThread().getState());
        // Devuelve el número total de hilos activos en el grupo de subprocesos actual
        System.out.println("        main: hilos activos = " + Thread.activeCount());

    }

    // Main
    // Método main se agrega "throws InterruptedException"
    // Significa que ese método puede verse interrumpido mientras espera
    // Asegurando de que el código que lo llama sea consciente de que puede ocurrir una interrupción
    // Y que debe manejarla apropiadamente
    public static void main(String[] args) throws InterruptedException {
        // Inicia main
        System.out.println("\nmain: inicia ejecución a las " + LocalTime.now());
        System.out.println("main: creando hilos\n");

        // Se llama al método mostrarEstadoHilos() de arriba
        mostrarEstadoHilos();

        // Instanciamos la clase SaludoConcurrente
        SaludoConcurrente hilo1 = new SaludoConcurrente();
        SaludoConcurrente hilo2 = new SaludoConcurrente();
        
        hilo1.setPriority(Thread.MIN_PRIORITY); // Establecer a la mínima (1)
        hilo2.setPriority(Thread.MAX_PRIORITY); // Establecer a la máxima (10)

        // Cambiar el nombre de los hilos
        hilo1.setName("Hilo1");
        hilo2.setName("Hilo2");

        System.out.println("\nmain: Ejecutando el  Hilo1...");
        hilo1.start();  // El método star() inicializa la ejecución
        hilo1.join();   // Espera a que el hilo1 termine antes de continuar

        // Se llama al método mostrarEstadoHilos() de arriba
        mostrarEstadoHilos();
        
        System.out.println("\nmain: Ejecutando el  Hilo2...");
        hilo2.start();  // El método star() inicializa la ejecución
        hilo2.join();   // Espera a que el hilo1 termine antes de continuar

        // Se llama al método mostrarEstadoHilos() de arriba
        mostrarEstadoHilos();

        // Termina main
        System.out.println("\nmain: termina ejecución a las " + LocalTime.now());
    }
}