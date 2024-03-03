# Programación Concurrente

## Primer Práctica - Saludo Concurrente

- Se utilizó el lenguaje de JAVA para realizar el siguiente código

---

### Acerca del Proyecto
- Se compone de **2 ejercicios**:
    - Ejercicio 1 - Creación de hilos
    - Ejercicio 2 - Configuración de atributos
- Cada ejercicio se puede ver por medio de las [commits](https://github.com/Chersito/Act1_SaludoConcurrente/commits/main/) realizadas en la línea del tiempo que se despliega
- Elegir la versión del código que requieras

_Nota: Hay versiones con comentarios para conocer lo que hace cada línea de código_

### **Ejercicio 1 :**
1. Escribir un programa concurrente que imprima a pantalla un saludo
2. Se deben crear tanto el `main` como la clase `Saludo`
2. En el método `main` se debe:
    - Crear 2 hilos y ejecutarlos sin esperar su finalización
    - Escribir a pantalla el inicio y terminación del hilo main
    - Cada hilo que envíe un mensaje a pantalla debe identificarse
3. En la clase `Saludo` deben crearse los hilos y definir su comportamiento al sobrescribir el método `run()` para mandar un saludo a pantalla
4. El output esperado debe ser :
```
main: inicia ejecución a las 20:00:04.756322900
main: termina ejecución a las 20:00:04.758324400
    Hilo: Nuevo hilo Thread-1 (20:00:04.759325400)
    Hilo: Nuevo hilo Thread-0 (20:00:04.758324400)
    Hola soy el hilo Thread-0
    Hola soy el hilo Thread-1
    Hilo Thread-0 terminó (20:00:06.768094300)
    Hilo Thread-1 terminó (20:00:06.768094300)
```
_Nota: El output puede variar dependiendo de la condición de competencia entre hilos y procesos_

### **Ejercicio 2 :**
1. A partir del _**Ejercicio 1**_ modificar el método `run()` para conocer los valores por default de las propiedades al crear un hilo, el método deberá imprimir a pantalla la siguiente información:
    - Id
    - Prioridad
    - Estado
    - Grupo al que pertenece
2. Luego, se configura los siguiente:
    - Modificar el nombre default de los hilos
    - Cambiar la prioridad del hilo 1 a la mínima prioridad.
    - Cambiar la prioridad del hilo 2 a la máxima prioridad.
    - Imprimir a pantalla nuevamente la información del hilo, cada hilo que envíe un mensaje a pantalla debe identificarse
3. Finalmente modificar el método `main` para que al momento de crear los hilos indique el estado de cada hilo y el número de hilos activos, para cada hilo que ejecute el `main` debe de indicar nuevamente el estado de los hilos y el número de hilos activos en ese momento

4. El output esperado debe ser:
```
main: inicia ejecución a las 19:35:54.507944800
main: creando hilos

main---> Estado de los hilos:
        main: hilo1 = RUNNABLE
        main: hilo2 = RUNNABLE
        main: hilos activos = 1

main: Ejecutando el  Hilo1...
    Mensaje del Hilo1: Nuevo hilo  (19:35:54.514951100)
    Hola soy el hilo Hilo1
---> Hilo1: Hilo1 terminó ejecución a las (19:35:56.528415)
Hilo1: Hola soy un hilo
Hilo1: Mi nombre = Hilo1
Hilo1: ID: 29
Hilo1: Prioridad: 1
Hilo1: Estado: RUNNABLE
Hilo1: Grupo al que pertenece: main

main---> Estado de los hilos:
        main: hilo1 = RUNNABLE
        main: hilo2 = RUNNABLE
        main: hilos activos = 1

main: Ejecutando el  Hilo2...
    Mensaje del Hilo2: Nuevo hilo  (19:35:56.540438100)
    Hola soy el hilo Hilo2
---> Hilo2: Hilo2 terminó ejecución a las (19:35:58.545759800)
Hilo2: Hola soy un hilo
Hilo2: Mi nombre = Hilo2
Hilo2: ID: 30
Hilo2: Prioridad: 10
Hilo2: Estado: RUNNABLE
Hilo2: Grupo al que pertenece: main

main---> Estado de los hilos:
        main: hilo1 = RUNNABLE
        main: hilo2 = RUNNABLE
        main: hilos activos = 1

main: termina ejecución a las 19:35:58.545996100
```
_Nota: El output puede variar dependiendo de la condición de competencia entre hilos y procesos_

---

### Para abrir el código :
Opción 1 :
1. Abrir la carpeta de [src](https://github.com/Chersito/Act1_SaludoConcurrente/tree/main/src)

2. Código en  [SaludoConcurrente.java](https://github.com/Chersito/Act1_SaludoConcurrente/blob/main/src/SaludoConcurrente.java)

Opción 2 :

Utiliza `git clone https://github.com/Chersito/Act1_SaludoConcurrente.git` para obtener el repositorio por medio de tu terminal