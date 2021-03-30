package com.soil;

public class Calculos_CorrecaoCTC extends App{
    public static double CTC_cmol(double teor_calcio,double teor_mag,double teor_pot,double H_Al)
    {
        if((teor_calcio + teor_mag +teor_pot+H_Al)>0.01){
            return (teor_calcio+teor_mag+ teor_pot+H_Al);
        }else{
            return (0);
        }
    }
    public static double S_cmol(double teor_calcio,double teor_mag,double teor_pot)
    {
        if((teor_calcio + teor_mag +teor_pot)>0.01){
            return (teor_calcio+teor_mag+ teor_pot);
        }else{
            return (0);
        }
    }
    
    public double V_At(double teor_calcio,double teor_mag,double teor_pot,double H_Al)
    {
            double a = (100*(teor_calcio+teor_mag+ teor_pot)/(teor_calcio+teor_mag+ teor_pot+ H_Al));       
            return a;
    }

    public double MO_Percentual(double m) {
        if (m > 0) {
            return m / 10;
        } else {
            return 0.0;
        }
    }

    public double Calcula_Carbono(double percentual) {
        if (percentual > 0) {
            return (percentual) / (1.72 * 1);
            
        } else {
            return 0.0;
        }
    }

}
