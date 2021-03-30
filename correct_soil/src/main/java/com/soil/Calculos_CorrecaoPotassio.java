package com.soil;

public class Calculos_CorrecaoPotassio {
    public double potassioCtcSolo(double teor_calcio,double teor_magnesio, double teor_potassio, double teor_hal)
    {
            return ((teor_potassio)/(teor_calcio+teor_magnesio+teor_potassio+teor_hal))*100;
    }
    public double potassioCtcDesejada(double textura)
    {
            if(textura ==1 || textura ==2){
                return 3;
            }
            return 0;
    }
}
