/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor_4;

/**
 *
 * @author hp
 */
public class Nomor_4 {
   public static void main (String[] args){
       
       for(var counter = 1; counter <= 100; counter++){
           if(counter % 2 == 0){
               continue;
           }
           System.out.println("perulanagn ganjil " + counter);
       }
   } 
}
