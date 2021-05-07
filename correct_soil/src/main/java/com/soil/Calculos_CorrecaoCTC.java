package com.soil;

public class Calculos_CorrecaoCTC{
    
    public double[] SoloIdeal(int texturaDoSolo){
        switch(texturaDoSolo){
            case 1:
                double solo_argiloso[] = {9.0, 0.35, 6.0, 1.5, 9.0, 0.0};
                return solo_argiloso;
            case 2:
                double textura_media[] = {12.0, 0.25, 4.0, 1.0, 6.0, 0.0};
                return textura_media;
        }
        double solo[] = {0.0,0.0,0.0,0.0,0.0,0.0};
        return solo;
    }
    
    public double CTC_cmol(double teor_calcio,double teor_mag,double teor_pot,double H_Al)
    {
        if((teor_calcio + teor_mag +teor_pot+H_Al)>0.01){
            return (teor_calcio+teor_mag+ teor_pot+H_Al);
        }else{
            return (0);
        }
    }
    public double S_cmol(double teor_calcio,double teor_mag,double teor_pot)
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
            return percentual / 1.72 * 10;
            
        } else {
            return 0.0;
        }
    }

}
