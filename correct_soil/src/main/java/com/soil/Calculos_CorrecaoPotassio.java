package com.soil;
public class Calculos_CorrecaoPotassio {
    public double potassioCtcSolo(double teor_calcio,double teor_magnesio, double teor_potassio, double teor_hal){
            return ((teor_potassio)/(teor_calcio+teor_magnesio+teor_potassio+teor_hal))*100;
    }
    public double potassioCtcDesejada(double textura){
            if(textura ==1 || textura ==2){
                return 3;
            }
            return 0;
    }
    public double quantidadeAplicarPotassio(Integer fonte_potassioUtilizar,double teor_potassio,double participacao_desejada, double participacao_potassioAtual){
        double[] valor_dividir_p = {0,58,52,22,44};
        return ((((((teor_potassio*participacao_desejada/participacao_potassioAtual)-teor_potassio)*39.1*10)*2*1.2)*100/0.85/100)*100/valor_dividir_p[fonte_potassioUtilizar]);
    }
    public double custoPotassio(double valor_potassio, double quantidade_aplicar, double fonte_potassio){
           if(fonte_potassio == 1 ||fonte_potassio == 2 || fonte_potassio == 3){
               return ((valor_potassio*quantidade_aplicar)/1000);
           }
           return 0;
    }
}
