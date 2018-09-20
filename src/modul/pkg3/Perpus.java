/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg3;

/**
 *
 * @author win 7
 */
public class Perpus {
    private String judulbuku;
    private String nama;
    private int usia;
    private int NIS;
    private String Kelas;
    
    public Perpus(String nama, int usia, int NIS, String Kelas,String judulbuku) {
        this.judulbuku=judulbuku;
        this.nama = nama;
        this.usia = usia;
        this.NIS=NIS;
        this.Kelas=Kelas;
    }

    public void info () {
        System.out.println("Judul Buku yang di pinjam : "+judulbuku);
        System.out.println("Nama : "+this.nama);
         System.out.println("Usia : "+this.usia);
          System.out.println("NIS : "+this.NIS);
           System.out.println("Kelas : "+this.Kelas);
        
    }
}
