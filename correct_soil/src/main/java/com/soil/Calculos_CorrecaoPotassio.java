package com.soil;
public class Calculos_CorrecaoPotassio {
    public double potassioAtualNaCTCSolo(double teor_calcio,double teor_magnesio, double teor_potassio, double teor_hal){
            return ((teor_potassio)/(teor_calcio+teor_magnesio+teor_potassio+teor_hal))*100;
    }
    
    public double potassioPosCorrecaoCTCSolo(double potassio_desejado){
        if(potassio_desejado > 0.001){
            return potassio_desejado;
        }
        return 0.0;
    }
    
    public double potassioIdealNaCTCSolo(int textura){
            if(textura ==1 || textura ==2){
                return 3;
            }
            return 0;
    }
    public double quantidadeAplicarPotassio(Integer fonte_potassioUtilizar,double teor_potassio,double participacao_desejada, double participacao_potassioAtual){
        double[] valor_dividir_p = {0,58,52,22,44};
        double nescessidade_de_potassio_adicionar = teor_potassio*participacao_desejada/ participacao_potassioAtual - teor_potassio;
        
        if(nescessidade_de_potassio_adicionar > 0.001){
            return nescessidade_de_potassio_adicionar* 39.1 * 10 * 2 * 1.2 * 100/85 * 100/valor_dividir_p[fonte_potassioUtilizar];
        }
        return 0.0;
    }
    public double custoPotassio(double valor_potassio, double quantidade_aplicar, double fonte_potassio, int textura){
           if(fonte_potassio == 1 ||fonte_potassio == 2 || fonte_potassio == 3){
               return ((valor_potassio*quantidade_aplicar)/1000);
           }
           else if(fonte_potassio == 4){
                switch (textura) {
                case 1 :return 0.7*quantidade_aplicar/1000;
                case 2 :return 0.5*quantidade_aplicar/1000;
            }
           }
           return 0.0;
    }
}
