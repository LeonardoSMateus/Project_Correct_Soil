package com.soil;

public class S_Cmol extends App {
    public static double S_cmol(double teor_calcio,double teor_mag,double teor_pot)
    {
        if((teor_calcio + teor_mag +teor_pot)>0.01){
            return (teor_calcio+teor_mag+ teor_pot);
        }else{
            return (0);
        }
       

    }
}
