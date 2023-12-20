/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {

        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        int suma = 0;

        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                int c = 0;
                if (fila==col) {
                    suma = suma + arreglo1[fila][col];
                }
            }
        }
        System.out.println(suma);
        /*   
     Lo que se realizo en este codigo fue que utilizando los ciclos for 
     recorremos el arreglo creado y filtramos usando una condicional 
     if para sumar los numero 10,2 y 4 para al final presentar el resultado
     de esa suma fuera de los ciclos for
         */
    }
}
