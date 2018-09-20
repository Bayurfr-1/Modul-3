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
public class Gajah  extends Hewan {
    public static void testClassMethod () {
        System.out.println("The Class method in hewan ");
    }
    public void testInstanceMethod (){
        System.out.println("The Instance Method in Gajah");
    }
    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = new Hewan();
        Hewan.testClassMethod();
        myHewan.testinstanceMethod();
    }
}
