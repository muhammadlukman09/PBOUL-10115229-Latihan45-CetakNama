/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan45.cetaknama;

/**
 *
 * @author Lukman
 */
public class Printer {
    private int jmlCetak;
    private String nama;
    
    public Printer(){
        
    }

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(int jmlhCetak, String nama){
        int i;
        for (i=1; i<=jmlCetak; i++){
            System.out.println(i+""+nama);
        }
        
        
    }
    
    
}
