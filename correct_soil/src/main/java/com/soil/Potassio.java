package com.soil;

public class Potassio {
    private double valor_potassio;
    private double text_pot;
    private double v_p = 0.35;
    private double v_p2 = 0.25;

    public void setText_pot(double val)
    {
        this.text_pot = val;
    }
    public Double getText_pot()
    {
        return text_pot;
    }
    public void setPotassio(double val)
    {
        this.valor_potassio = val;
    }


    public double getPotassio()
    {
        return valor_potassio;
    }
}
