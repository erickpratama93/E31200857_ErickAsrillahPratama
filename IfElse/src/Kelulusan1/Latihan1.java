/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelulusan1;

import java.util.Scanner;

/**
 *
 * @Erick Asrillah Pratama
 */
public class Latihan1 {
    
    private static int nilai;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   //Buat Scanner
   Scanner inp = new Scanner (System.in);
   
   //Ambil Nama
   System.out.print("Masukkan Nama Anda = ");
   String Nama = inp.next();
   
   //Ambil NIM
   System.out.print("Masukkan NIM = ");
   String NIM = inp.next();
   
   //Ambil Nilai
   System.out.print("Masukkan Nilai = ");
      int Nilai = inp.nextInt();
   
      //Print
      if(Nilai > 55) {
      System.out.println("Selamat Anda Lulus");
      }else {
          System.out.println("Anda Tidak Lulus");
      }
     
      
      
    }
}
