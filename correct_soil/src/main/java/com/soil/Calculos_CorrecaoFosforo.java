package com.soil;
public class Calculos_CorrecaoFosforo{
    public double quantidadeAplicar(double teor_fosforoAtingir,Integer fonte_fosforo, double teor_fosforo,double eficiencia_fosforo){
        double[] array_resultado = {18,41,48,45,18,33,29,32,24,18.5,52,12};
        if((teor_fosforoAtingir - teor_fosforo)<0.01){
            return 0;
        }
    return ((((teor_fosforoAtingir - teor_fosforo)*2*2.29)/eficiencia_fosforo)*100/(array_resultado[fonte_fosforo-1]));
    }
    public double superfosfato_Simples(double teor_fosforoAtingir,Integer fonte_fosforo, double quantidade_aplicar, double teor_fosforo,double eficiencia_fosforo) {
        double[] array_resultado = {18,41,48,45,18,33,29,32,24,18.5,52,12};
        if(fonte_fosforo == 5){
            return (quantidade_aplicar*0.15);
        }
        else if(fonte_fosforo == 1){
            return (((((teor_fosforoAtingir - teor_fosforo)*2*2.29)/eficiencia_fosforo)*100/(array_resultado[fonte_fosforo-1]))*0.1);
        }
        else if(fonte_fosforo == 12){
            return (((((teor_fosforoAtingir - teor_fosforo)*2*2.29)/eficiencia_fosforo)*100/(array_resultado[fonte_fosforo-1]))*0.11);
        }
        return 0.0;
    }
   public double custoFosforo(double fonte_fosforo,double quantidade_aplicar, double valor_superfosfato_simples){
        if(fonte_fosforo >=1 && fonte_fosforo<=12){
            return (valor_superfosfato_simples*quantidade_aplicar/1000);
        }
        return 0.0;
    }
    public double enxofre(double quantidade_aplicar, Integer fonte_fosforo){
        double[] array_resultado = {0,quantidade_aplicar*0.28,quantidade_aplicar*0.2,quantidade_aplicar*0.09,
            quantidade_aplicar*0.16,quantidade_aplicar*0.28,quantidade_aplicar*0.52,quantidade_aplicar*0.53,quantidade_aplicar*0.45,quantidade_aplicar*0.28,quantidade_aplicar*0.44,0,quantidade_aplicar*0.18};
            if(fonte_fosforo < 0 || fonte_fosforo>12){
                return 0;
            }
        return array_resultado[fonte_fosforo];
    }
}