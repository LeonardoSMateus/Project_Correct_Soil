package com.soil;

public class Calcio extends App{
    private double valor_calcio;
    private double text_cal;


    public void setText_cal(double val){
        this.text_cal = val;
    }
    public Double getText_cal(){
        return text_cal;
    }
    public void setCalcio(double val){
        this.valor_calcio = val;
    }
    public double getFosforo(){
        return valor_calcio;
    }
}
