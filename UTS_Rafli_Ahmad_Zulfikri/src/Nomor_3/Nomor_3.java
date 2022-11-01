/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor_3;

/**
 *
 * @author hp
 */
public class Nomor_3 {
  public static void main (String[] args){
      
      int [] values = {80, 50, 50, 50, 80};
      sayCongrats("Eko", values);
      
      sayCongrats("Budi", 80, 90, 76, 80);
  }
  
  static void sayCongrats (String name, int... values){
      var total = 0;
      for (var value : values){
          total += value;
      }
      var finalValues = total / values.length;
      
      if (finalValues >= 75){
          System.out.println("Selamat" + name + ",Anda Lulus");
      } else{
          System.out.println("Maaaf" + name + ", Anda Tidak lulus");
      }
  }
}
