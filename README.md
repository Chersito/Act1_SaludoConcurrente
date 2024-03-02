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
2.

---

### Para abrir el código :
Opción 1 : 
1. Abrir la carpeta de [src](https://github.com/Chersito/Act1_SaludoConcurrente/tree/main/src)

2. Código en  [SaludoConcurrente.java](https://github.com/Chersito/Act1_SaludoConcurrente/blob/main/src/SaludoConcurrente.java)

Opción 2 : 

Utiliza `git clone https://github.com/Chersito/Act1_SaludoConcurrente.git` para obtener el repositorio por medio de tu terminal  
