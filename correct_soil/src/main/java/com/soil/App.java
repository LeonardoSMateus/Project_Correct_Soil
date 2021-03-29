package com.soil;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App
{
    
    public static void main( String[] args )
    {
        Calculos_CorrecaoCTC correcaoCtc = new Calculos_CorrecaoCTC();

        double teor_fosforo=0;
        double teor_calcio=0;
        double teor_potassio=0;
        double teor_magnesio=0;
        double teor_enxofre =0;
        double teor_aluminio = 0;
        double h_Al=0;
        double result_Scmol=0;
        double result_CTCcmol=0;
        double result_V_At=0;     
        double mo_percentual = 0;   
        double calc_carbono = 0;   
        double textura = 1;

        h_Al = 5.35;


        if(textura == 1){
            teor_potassio = 0.35;
        }else if(textura ==2){
            teor_potassio = 0.25;
        }
        

        if(textura == 1){
            teor_fosforo = 9;
        }else if(textura == 2){
            teor_fosforo = 12;
        }

        if(textura== 1){
            teor_calcio = 6;
        }else if(textura == 2){
            teor_calcio = 4;
        }
        
        if(textura == 1){
            teor_magnesio = 1.5;
        }else if(textura == 2){
            teor_magnesio = 1;
        }
        if(textura == 1){
            teor_enxofre = 9;
        }else if(textura == 2){
            teor_enxofre = 6;
        }
        result_V_At = correcaoCtc.V_At(teor_calcio, teor_magnesio, teor_potassio, h_Al);
        result_Scmol = correcaoCtc.S_cmol(teor_calcio, teor_magnesio, teor_potassio);
        result_CTCcmol = correcaoCtc.CTC_cmol(teor_calcio, teor_magnesio, teor_potassio,h_Al);
        mo_percentual = correcaoCtc.MO_Percentual(30.7);
        calc_carbono = correcaoCtc.Calcula_Carbono(30.7);


        System.out.printf("Resultado S Cmol = %.2f\n",result_Scmol);
        System.out.printf("Resultado CTC Cmol = %.2f\n",result_CTCcmol);
        System.out.printf("Resultado V Atual = %.2f\n",result_V_At);
        System.out.printf("Resultado Mo_Percentual = %.2f %%\n",mo_percentual);
        System.out.printf("Resultado Calculo do Carbono = %.2f\n",calc_carbono);




        System.out.printf("Teor Potassio = %.2f\n",teor_potassio);
        System.out.printf("Teor Fosforo = %.2f\n",teor_fosforo);
        System.out.printf("Teor Calcio = %.2f\n",teor_calcio);
        System.out.printf("Teor Magnesio = %.2f\n",teor_magnesio);
        System.out.printf("Teor Enxofre = %.2f\n",teor_enxofre);

    }
    

    

}
