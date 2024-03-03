import java.time.LocalTime;

public class SaludoConcurrente extends Thread {
    
    public void run() {
        System.out.println("    Mensaje del "+ getName()+": Nuevo hilo " + " (" + LocalTime.now() + ")");

        @SuppressWarnings("deprecation")
        long id = getId();
        int prioridad = getPriority();
        Thread.State estado = getState();
        ThreadGroup grupo = getThreadGroup();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("    Hola soy el hilo " + getName());
        System.out.println("---> "+getName()+": " + getName() + " terminó ejecución a las (" + LocalTime.now() + ")");

        System.out.println(getName()+": Hola soy un hilo");
        System.out.println(getName()+": Mi nombre = " + getName());
        System.out.println(getName()+": ID: " + id);
        System.out.println(getName()+": Prioridad: " + prioridad);
        System.out.println(getName()+": Estado: " + estado);
        System.out.println(getName()+": Grupo al que pertenece: " + grupo.getName()+"\n");
    }

    public static void mostrarEstadoHilos(){
        System.out.println("main---> Estado de los hilos: ");
        System.out.println("        main: hilo1 = " + Thread.currentThread().getState());
        System.out.println("        main: hilo2 = " + Thread.currentThread().getState());
        System.out.println("        main: hilos activos = " + Thread.activeCount());

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\nmain: inicia ejecución a las " + LocalTime.now());
        System.out.println("main: creando hilos\n");

        mostrarEstadoHilos();

        SaludoConcurrente hilo1 = new SaludoConcurrente();
        SaludoConcurrente hilo2 = new SaludoConcurrente();
        
        hilo1.setPriority(Thread.MIN_PRIORITY);
        hilo2.setPriority(Thread.MAX_PRIORITY);

        hilo1.setName("Hilo1");
        hilo2.setName("Hilo2");

        System.out.println("\nmain: Ejecutando el  Hilo1...");
        hilo1.start();
        hilo1.join();
        
        mostrarEstadoHilos();
        
        System.out.println("\nmain: Ejecutando el  Hilo2...");
        hilo2.start();
        hilo2.join();

        mostrarEstadoHilos();

        System.out.println("\nmain: termina ejecución a las " + LocalTime.now());
    }
}