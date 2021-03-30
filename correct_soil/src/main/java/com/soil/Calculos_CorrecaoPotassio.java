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
    public double quantidadeAplicarPotassio(double fonte_potassioUtilizar,double teor_potassio,double participacao_desejada, double participacao_potassioAtual)
    {
        double k_adicionar = (teor_potassio*participacao_desejada/participacao_potassioAtual)-teor_potassio;
        double quantidade_aplicar = 0;
        double valor_dividir_p = 1;
        if(fonte_potassioUtilizar == 1){
            valor_dividir_p = 58;
        }else if(fonte_potassioUtilizar == 2){
            valor_dividir_p = 52;
        }else if(fonte_potassioUtilizar == 3){
            valor_dividir_p = 22;
        }else if(fonte_potassioUtilizar == 4){
            valor_dividir_p = 44;
        }
        quantidade_aplicar = (((k_adicionar*39.1*10)*2*1.2)*100/0.85/100)*100/valor_dividir_p;
        return (quantidade_aplicar);
    }
    public double custoPotassio(double valor_potassio, double quantidade_aplicar, double fonte_potassio)
    {
           if(fonte_potassio == 1 ||fonte_potassio == 2 || fonte_potassio == 3){
               return ((valor_potassio*quantidade_aplicar)/1000);
           }
           return 0;
    }

}
