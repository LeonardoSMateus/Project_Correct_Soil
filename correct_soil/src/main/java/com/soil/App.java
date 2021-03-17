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
        h_Al = H_AL();
       

        
        teor_potassio = CalculosTeorPotassio(); 
        teor_fosforo = CalculosTeorfosforo(); 
        teor_calcio =  CalculosTeorCalcio();
        teor_magnesio =  CalculosTeorMagnesio();
        teor_enxofre = CalculosTeorEnxofre();
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
    public static double CalculosTeorPotassio()
    {
        double valor_potassio=0;
        double teor_potassio=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o Teor do Potassio = ");
        teor_potassio = ler.nextDouble();
        if(teor_potassio == 1){
            valor_potassio = 0.35;
        }else if(teor_potassio ==2){
            valor_potassio = 0.25;
        }
        return valor_potassio;
    }
    public static double CalculosTeorfosforo()
    {
        double valor_fosforo=0;
        double teor_fosforo=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o Teor do Fosforo = ");
        teor_fosforo = ler.nextDouble();
        if(teor_fosforo == 1){
            valor_fosforo = 9;
        }else if(teor_fosforo == 2){
            valor_fosforo = 12;
        }
        
        return valor_fosforo;

    }

    public static double CalculosTeorCalcio()
    {
        double valor_calcio=0;
        double teor_calcio=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o Teor do Calcio = ");
        teor_calcio = ler.nextDouble();
        if(teor_calcio== 1){
            valor_calcio = 6;
        }else if(teor_calcio == 2){
            valor_calcio = 4;
        }

        return valor_calcio;

    }

    public static double CalculosTeorMagnesio()
    {
        double valor_magnesio=0;
        double teor_magnesio=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o Teor do Magnesio = ");
        teor_magnesio = ler.nextDouble();
        if(teor_magnesio == 1){
            valor_magnesio = 1.5;
        }else if(teor_magnesio == 2){
            valor_magnesio = 1;
        }
        return valor_magnesio;

    }
    public static double CalculosTeorEnxofre()
    {
        double valor_enxofre=0;
        double teor_enxofre=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o Teor do Enxofre = ");
        teor_enxofre = ler.nextDouble();
        if(teor_enxofre == 1){
            valor_enxofre = 9;
        }else if(teor_enxofre == 2){
            valor_enxofre = 6;
        }
        return valor_enxofre;

    }
    public static double H_AL()
    {
        double h_Al=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o H + AL = ");
        h_Al = ler.nextDouble();
        return (h_Al);

    }

}
