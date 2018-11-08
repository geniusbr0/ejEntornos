/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howyoudoin;
import java.util.*;
/**
 *
 * @author admin
 */
public class Howyoudoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String cadena;
       int cont=0;
       
       Scanner sc=new Scanner (System.in);
       
       System.out.println("anota cadena");
       cadena=sc.nextLine();
       
       cadena=cadena.toUpperCase();
       
       System.out.println("anota letra");
       char letra=sc.nextLine().charAt(0);
       
       letra=Character.toUpperCase(letra);
       
           for(int i=0;i<cadena.length();i++){
               
               if(cadena.charAt(i)==letra){
                   cont++;
               }
               
           }
       System.out.println("hay "+cont+" letras que son "+letra);
           
           
   }
   
}
