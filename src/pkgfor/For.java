package pkgfor;

import java.util.ArrayList;
import java.util.Scanner;

public class For {

        public static void main(String[] args) {
            ArrayList<String> Usuario = new ArrayList ();
            Scanner leider = new Scanner (System.in);
            boolean ciclo = true;
          
            for(;ciclo;){
    
            System.out.println("menu:\n1.resgistro \n2.mostrar lista \n3.actualizar nombre \n4.eliminar nombre \n5.salir ");
                System.out.println("dijite una opcion");
         
            int opcion = leider.nextInt();
            leider.nextLine();
        
            switch (opcion){
           
            case 1 -> {
            System.out.println("dime tu nombre: ");
            String nombre = leider.nextLine();
            Usuario.add(nombre);
             }
            case 2 -> {
                System.out.println(Usuario);
            }
            case 3 ->{
                System.out.println("como es tu nombre: ");
                String antiguonombre = leider.nextLine();
                if(Usuario.contains(antiguonombre)){
                System.out.println("Cual es su nuevo nombre: ");
                String nombre = leider.nextLine();
                Usuario.add(nombre);
                }else{
                     System.out.println("error");
                }
            }
            case 4 ->{
                System.out.println("que nombre quieres eliminar? ");
                 String nombre = leider.nextLine();
                 if(Usuario.contains(nombre)){
                     Usuario.remove(nombre);
                     System.out.println("se elimino tu nombre");
                 }else{
                     System.out.println("usuario no existe");
                 }
            }
            case 5 ->{
                System.out.println("mirate que antes era nuesto orgullo, vete ahora y nunca regreses");
                ciclo = false;
            }
   }   
  } 
 }
}       
  

              
