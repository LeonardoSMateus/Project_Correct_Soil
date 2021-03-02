package com.soil;

/**
 * Hello world!
 *
 */
public class App extends Potassio
{
    public static void main( String[] args )
    {
        double valor_p=0;
        double valor_f=0
        Potassio p = new Potassio();
        p.setText_pot(1);

        if(p.getText_pot() == 1){
            valor_p = 0.35;
        }else if(p.getText_pot() ==2){
            valor_p = 0.25;
        }


        System.out.println(p.getPotassio());
    }
}
