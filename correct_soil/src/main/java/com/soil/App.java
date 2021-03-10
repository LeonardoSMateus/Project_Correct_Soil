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
        Potassio p = new Potassio();
        double valor_potassio=0;
        double teor_potassio=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o Teor do Potassio = ");
        teor_potassio = ler.nextDouble();
        p.setText_pot(teor_potassio);
        if(p.getText_pot() == 1){
            valor_potassio = 0.35;
        }else if(p.getText_pot() ==2){
            valor_potassio = 0.25;
        }
        p.setPotassio(valor_potassio);
        return (p.getPotassio());
    }
    public static double CalculosTeorfosforo()
    {
        double valor_fosforo=0;
        Fosforo f = new Fosforo();
        double teor_fosforo=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o Teor do Fosforo = ");
        teor_fosforo = ler.nextDouble();
        f.setText_fos(teor_fosforo);
        if(f.getText_fos() == 1){
            valor_fosforo = 9;
        }else if(f.getText_fos() == 2){
            valor_fosforo = 12;
        }
        f.setFosforo(valor_fosforo);
        return f.getFosforo();

    }

    public static double CalculosTeorCalcio()
    {
        double valor_calcio=0;
        Calcio c = new Calcio();
        double teor_calcio=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o Teor do Calcio = ");
        teor_calcio = ler.nextDouble();
        c.setText_cal(teor_calcio);
        if(c.getText_cal() == 1){
            valor_calcio = 6;
        }else if(c.getText_cal() == 2){
            valor_calcio = 4;
        }
        c.setCalcio(valor_calcio);
        return (c.getFosforo());

    }

    public static double CalculosTeorMagnesio()
    {
        double valor_magnesio=0;
        Magnesio m = new Magnesio();
        double teor_magnesio=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o Teor do Magnesio = ");
        teor_magnesio = ler.nextDouble();
        m.setText_mag(teor_magnesio);
        if(m.getText_mag() == 1){
            valor_magnesio = 1.5;
        }else if(m.getText_mag() == 2){
            valor_magnesio = 1;
        }
        m.setMagnesio(valor_magnesio);
        return (m.getMagnesio());

    }
    public static double CalculosTeorEnxofre()
    {
        double valor_enxofre=0;
        Enxofre e = new Enxofre();
        double teor_enxofre=0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o Teor do Enxofre = ");
        teor_enxofre = ler.nextDouble();
        e.setText_enx(teor_enxofre);
        if(e.getText_enx() == 1){
            valor_enxofre = 9;
        }else if(e.getText_enx() == 2){
            valor_enxofre = 6;
        }
        e.setEnxofre(valor_enxofre);
        return (e.getEnxofre());

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
