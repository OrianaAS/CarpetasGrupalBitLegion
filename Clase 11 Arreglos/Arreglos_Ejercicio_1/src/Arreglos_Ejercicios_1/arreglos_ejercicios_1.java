//Video_7
//Ejercicio 1: Leer 5 numeros, guardarlos en un arreglo
//mostrarlos en e mismo orden introducidos
package Arreglos_Ejercicios_1;

import java.util.Scanner;

public class arreglos_ejercicios_1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float[] arreglos = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". Digite un numero: ");
            arreglos[i] = entrada.nextFloat();
        }
        
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i:arreglos){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
}
