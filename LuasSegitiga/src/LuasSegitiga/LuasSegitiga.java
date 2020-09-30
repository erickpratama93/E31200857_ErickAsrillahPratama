/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuasSegitiga;
/**
 *
 * @Erick Asrillah Pratama
 */    
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LuasSegitiga {
    public static void main(String[] args){
        
        String tinggi = "";
        String alas = "";
        int luas;
        
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Tinggi = ");
        try{
            tinggi = nilai.readLine();
        }catch(IOException ex){
            System.out.println("Error");
        }
        
        System.out.print("Masukkan Alas = ");
        try{
            alas = nilai.readLine();
        }catch(IOException ex){
            System.out.println("Error");
        }
        
        luas =(Integer.parseInt(alas)*Integer.parseInt(tinggi)) / 2;
        System.out.println("Luas Segitiga = "+luas);
    }
}
