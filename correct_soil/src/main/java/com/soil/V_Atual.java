package com.soil;

public class V_Atual extends App {
    public double V_At(double teor_calcio,double teor_mag,double teor_pot,double H_Al)
    {
       

            return ((100*(teor_calcio+teor_mag+ teor_pot)/(teor_calcio+teor_mag+ teor_pot+ H_Al)));
    
    }
}
