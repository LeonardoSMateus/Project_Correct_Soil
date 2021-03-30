package com.soil;

public class Calculos_CorrecaoFosforo extends App {
    public double quantidadeAplicar(double teor_fosforoAtingir,double fonte_fosforo, double teor_fosforo,double eficiencia_fosforo)
    {
        double teor_p2O5 = 1;
        double quantidade_aplicar;

        if((teor_fosforoAtingir - teor_fosforo)<0.01){
            quantidade_aplicar = 0;
            return quantidade_aplicar;
        }
        else{
            if(fonte_fosforo == 1){
                teor_p2O5 = 18;
            }else if(fonte_fosforo == 2){
                teor_p2O5 = 41;
            }
            else if(fonte_fosforo == 3){
                teor_p2O5 = 48;
            }
            else if(fonte_fosforo == 4){
                teor_p2O5 = 45;
            }
            else if(fonte_fosforo == 5){
                teor_p2O5 = 18;
            }
            else if(fonte_fosforo == 6){
                teor_p2O5 = 33;
            }
            else if(fonte_fosforo == 7){
                teor_p2O5 = 29;
            }
            else if(fonte_fosforo == 8){
                teor_p2O5 = 32;
            }
            else if(fonte_fosforo == 9){
                teor_p2O5 = 24;
            }
            else if(fonte_fosforo == 10){
                teor_p2O5 = 18.5;
            }
            else if(fonte_fosforo == 11){
                teor_p2O5 = 52;
            }
            else if(fonte_fosforo == 12){
                teor_p2O5 = 18;
            }
            quantidade_aplicar = (((teor_fosforoAtingir - teor_fosforo)*2*2.29)*100/eficiencia_fosforo/100)*100/teor_p2O5;
            return quantidade_aplicar;
        }
    }
}

