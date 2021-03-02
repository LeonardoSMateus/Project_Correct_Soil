package com.soil;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        double teor_fosforo=0;
        double teor_calcio=0;
        double teor_potassio=0;
        double teor_magnesio=0;

        
        teor_potassio = CalculosTeorPotassio(); 
        teor_fosforo = CalculosTeorfosforo(); 
        teor_calcio =  CalculosTeorCalcio();
        teor_magnesio =  CalculosTeorMagnesio();

        System.out.println(teor_potassio);
        System.out.println(teor_fosforo);
        System.out.println(teor_calcio);
        System.out.println(teor_magnesio);

    }
    public static double CalculosTeorPotassio()
    {
        double valor_p=0;
        Potassio p = new Potassio();
        p.setText_pot(1);
        if(p.getText_pot() == 1){
            valor_p = 0.35;
        }else if(p.getText_pot() ==2){
            valor_p = 0.25;
        }
        p.setPotassio(valor_p);
        return (p.getPotassio());
    }
    public static double CalculosTeorfosforo()
    {
        double valor_f=0;
        Fosforo f = new Fosforo();
        f.setText_fos(1);
        if(f.getText_fos() == 1){
            valor_f = 9;
        }else if(f.getText_fos() == 2){
            valor_f = 12;
        }
        f.setFosforo(valor_f);
        return f.getFosforo();

    }

    public static double CalculosTeorCalcio()
    {
        double valor_c=0;
        Calcio c = new Calcio();
        c.setText_cal(1);
        if(c.getText_cal() == 1){
            valor_c = 6;
        }else if(c.getText_cal() == 2){
            valor_c = 4;
        }
        c.setCalcio(valor_c);
        return (c.getFosforo());

    }

    public static double CalculosTeorMagnesio()
    {
        double valor_m=0;
        Magnesio m = new Magnesio();
        m.setText_mag(1);
        if(m.getText_mag() == 1){
            valor_m = 1.5;
        }else if(m.getText_mag() == 2){
            valor_m = 1;
        }
        m.setMagnesio(valor_m);
        return (m.getMagnesio());

    }
}
