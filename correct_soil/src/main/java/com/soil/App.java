package com.soil;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        double valor_f=0;
        
        CalculosTeorPotassio(); 
        CalculosTeorfosforo(); 
    }
    public static void CalculosTeorPotassio()
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
        System.out.println(p.getPotassio());
    }
    public static void CalculosTeorfosforo()
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
        System.out.println(f.getFosforo());

    }
}