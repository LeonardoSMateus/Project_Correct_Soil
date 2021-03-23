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
        S_Cmol s_cmol = new S_Cmol();
        Ctc_Cmol ctc_cmol = new Ctc_Cmol();
        V_Atual v_at = new V_Atual();

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
        result_V_At = v_at.V_At(teor_calcio, teor_magnesio, teor_potassio, h_Al);
        result_Scmol = s_cmol.S_cmol(teor_calcio, teor_magnesio, teor_potassio);
        result_CTCcmol = ctc_cmol.CTC_cmol(teor_calcio, teor_magnesio, teor_potassio,h_Al);
        System.out.printf("Resultado S Cmol = %.2f\n",result_Scmol);
        System.out.printf("Resultado CTC Cmol = %.2f\n",result_CTCcmol);
        System.out.printf("Resultado V Atual = %.2f\n",result_V_At);



        System.out.printf("Teor Potassio = %.2f\n",teor_potassio);
        System.out.printf("Teor Fosforo = %.2f\n",teor_fosforo);
        System.out.printf("Teor Calcio = %.2f\n",teor_calcio);
        System.out.printf("Teor Magnesio = %.2f\n",teor_magnesio);
        System.out.printf("Teor Enxofre = %.2f\n",teor_enxofre);

    }
    

    

}
