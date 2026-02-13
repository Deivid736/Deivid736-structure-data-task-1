package com.tarea1;

import java.util.ArrayList;
/**
 * Hello world!
 */
import java.util.Arrays;
public class App {
	
    public static void main(String[] args) {
    	// a) "Hola mundo"
        System.out.println("Hola mundo desde Java");
        
        // b) multiplicacion de dos numeros 
        int num1 =2;
        int num2 =3;
        int resultado = num1*num2;
        System.out.println("Rusultado:" + resultado);
        
        
        //4.1 ¿Como se declara un arreglo en Java?
        
        int[] num = new int[3];   // Con tamaño definido
        int[] valores = {5, 10, 15};  // Con valores iniciales
        
        
        //4.2 Metodos y utilidades principales para arreglos
        
        // c) Ejemplo con Arrays.toString()
        int[] numeros = {10, 20, 30};
        System.out.println("Arreglo completo: " + Arrays.toString(numeros));
        //crea un arreglo con 3 numeros y comviere el arreglo en texto. Permite mostrar todos los valores juntos en una sola linea
        
        // d) Ejemplo con Arrays.sort()
        int[] desordenados = {30, 10, 20};
        Arrays.sort(desordenados); // Ordena el arreglo
        System.out.println("Arreglo ordenado: " + Arrays.toString(desordenados));
        //crea un arreglo con numeros desordenados y los ordena automaticamente de menor a mayor, Luego imprime el arreglo ordenado
        
        // e) Ejemplo con Arrays.fill()
        int[] llenado = new int[5]; // Arreglo con 5 espacios
        Arrays.fill(llenado, 7); // Llena todo con 7
        System.out.println("Arreglo llenado: " + Arrays.toString(llenado));
        //Llena todas las posiciones del arreglo con el mismo numero.
        
        // f) Arrays.stream()
        int[] datos = {5, 10, 15};
        // Sumar todos los elementos del arreglo
        int suma = Arrays.stream(datos).sum();
        System.out.println("Suma del arreglo: " + suma);
        //Convierte el arreglo en un "stream" suma todos los números automaticamente.
        
        // g) Ejemplo con Arrays.equals()
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {1, 2, 3};
        
        boolean iguales = Arrays.equals(arreglo1, arreglo2);
        System.out.println("¿Los arreglos son iguales? " + iguales);
        // Compara ambos arreglos y devuelve true si tienen los mismos valores y orden
        
        
       // 4.3 ¿Como se recorren los arreglos en Java?
        
        int[] valore = {10, 20, 30};

        for (int i = 0; i < valore.length; i++) {
            System.out.println(valore[i]);
            //i empieza en 0. valores.length indica el tamaño del arreglo. En cada vuelta muestra un elemento.
            
            
            int[] valor = {10, 20, 30};

            for (int numero : valor) {
                System.out.println(numero);
                
                //Recorre automaticamente cada elemento. No necesita usar índices. numero toma el valor de cada elemento.
                
            }

        }    

int[] valo = {10, 20, 30};

Arrays.stream(valo).forEach(numero -> {
    System.out.println(numero);
});

//Convierte el arreglo en un "stream". forEach ejecuta una accion para cada elemento. numero -> es una expresion lambda (forma corta de funcion).

       
//4.4 Diferencias entre arreglos y ArrayList en Java

//Tamaño fijo vs tamaño dinamico

//Arreglos (arrays) El tamaño se define al crearlo. No puede cambiar despues.
int[] numer = new int[3];
//Solo tendra 3 espacios siempre.

//ArrayList. El tamaño cambia automaticamente. Se puede agregar o quitar elementos.
ArrayList<Integer> lista = new ArrayList<>();
lista.add(10);
lista.add(20);
//La lista crece segun lo que agregues.

//Tipos primitivos vs clases envolventes

//Arreglos Pueden usar tipos primitivos directamente:
int[] nm = {1, 2, 3};

//ArrayList. No acepta tipos primitivos directamente. se debe usar clases envolventes.

ArrayList<Integer> list = new ArrayList<>();
//int se convierte en Integer.

// Metodos disponibles
//Arreglos. No tienen muchos metodos propios.
int[] meros = {1, 2, 3};
System.out.println(numeros.length);
//Solo usan .length

//ArrayList. Tiene muchos métodos utiles:
lista.add(30);        // Agregar
lista.remove(0);      // Eliminar
lista.size();         // Tamaño
lista.get(0);         // Obtener elemento

//Rendimiento

//Arreglos → Más rápidos y consumen menos memoria.

//ArrayList → Un poco más lento porque es dinámico.

//¿Cuándo usar cada uno?

//Usa arreglos cuando:

//Se sabe el tamaño fijo.

//Se necesita mejor rendimiento.

//Trabajas con muchos datos numéricos.

//Usa ArrayList cuando:

//No se sabe cuántos elementos habrá.

//se necesita agregar o eliminar elementos.

//Quieres usar metodos como add() y remove().
    }  
}