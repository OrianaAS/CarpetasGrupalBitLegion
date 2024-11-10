//Video_4
package test;

import domain.Persona;


public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2] ;
        personas[0] = new Persona("Oriana");
        personas[1] = new Persona("Ariel");
       System.out.println("personas 0 = " + personas[0]);
       System.out.println("personas 1 = " + personas[1]);
       
       //Video_6
       for(int i = 0; i < personas.length; i++) {
           System.out.println("personas "+i+" = " + personas[i]);
       }
       //Trabajamos con arreglos en la sistaxis  resumida
      
     String frutas[] = {"Banana", "Pera", "Durazno"};
     for (int i = 0; i < frutas.length; i++) {
         System.out.println("frutas " +i+" = "+ frutas[i]);
                
     }
    }
}
