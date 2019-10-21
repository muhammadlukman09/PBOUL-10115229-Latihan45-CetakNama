/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUAHMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class PBOUL10115229Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Printer printer1 = new Printer();
         
        System.out.println("Masukkan Nama Anda : ");
        Scanner scn = new Scanner(System.in);
        String nama = scn.nextLine();
        
        printer1.setNama(nama);
        System.out.println("Mau Cetak Berapa Kali? " );
        Scanner sci = new Scanner(System.in);
        int i = sci.nextInt();
        printer1.setJmlCetak(i);
        
        System.out.println("/n Nama Anda : "+printer1.getNama());
        System.out.println("Hasil Cetak : ");
        
        printer1.cetak(printer1.getJmlCetak(), printer1.getNama());
        
        
        
      
       
        
        
    }
    
}
