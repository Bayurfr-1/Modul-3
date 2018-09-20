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
public class Truck {
    public int cadence;
    public int gear;
    public int speed;
    public Truck(int startCadence, int startSpeed, int startGear){
        gear =  startGear;
        speed= startSpeed;
        cadence=startCadence;
    }
    public void setCadence(int newValue){
        cadence=newValue;
    }
     public void setGear(int newValue){
        gear=newValue;
    }
      public void applybrake(int decrement){
        speed=decrement;
    }
       public void speedup(int increment){
        speed=increment;
    }
}
