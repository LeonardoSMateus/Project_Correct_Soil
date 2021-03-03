package com.soil;

public class Ctc_Cmol extends App{
    public static double CTC_cmol(double teor_calcio,double teor_mag,double teor_pot,double H_Al)
    {
        if((teor_calcio + teor_mag +teor_pot+H_Al)>0.01){
            return (teor_calcio+teor_mag+ teor_pot+H_Al);
        }else{
            return (0);
        }
}
