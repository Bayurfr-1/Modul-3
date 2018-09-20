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
public class UjiPerpus extends Perpus{
    
    private int kartupelajarmoklet;
 
    public UjiPerpus(String judulbuku, int kartupelajarmoklet,String nama, int usia, int NIS, String Kelas) {
        super(nama, usia, NIS, Kelas, judulbuku);
        this.kartupelajarmoklet=kartupelajarmoklet;
        
   }
    public void info(){
        System.out.println("NO. Kartu Pelajar Telkom : " + this.kartupelajarmoklet);
          super.info();
}
}