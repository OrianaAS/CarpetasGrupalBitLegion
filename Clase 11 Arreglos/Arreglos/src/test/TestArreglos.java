package test;

//Video_1
public class TestArreglos {
    public static void main(String[] args) { //lado derecho, instanciamos un objeto de tipo object
        int edades[] = new int [3]; //el lado izquierdo, decalramos la variable 
        System.out.println("edades =" + edades);
        
        
     //Video_2   
     
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        edades[1] =  20;
        System.out.println("edades 1 = " + edades[1]);
        edades[2] = 27;
        System.out.println("edades 2 = " + edades[2]);
       
        //Video_3
        
        //edades[3] = 7; //Fuera de rango, error en tiempo de ejecicion 
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos "+i+": "+edades[i]);
        }
    }
}
