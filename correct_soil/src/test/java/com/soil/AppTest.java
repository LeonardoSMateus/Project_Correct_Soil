package com.soil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testCtc_Cmol(){
        Calculos_CorrecaoCTC c = new Calculos_CorrecaoCTC();
        double resultado = c.CTC_cmol(1, 1, 1, 5.35);
        assertEquals(8.35,resultado,0);
    }

    @Test
    public void S_Cmol(){
        Calculos_CorrecaoCTC s = new Calculos_CorrecaoCTC();
        double resultado = s.S_cmol(1, 1, 1);
        assertEquals(3,resultado,0);
    }

    @Test
    public void V_Atual(){
        Calculos_CorrecaoCTC v = new Calculos_CorrecaoCTC();
        double resultado = v.V_At(0,0,0,0);
        assertEquals(Double.NaN,resultado,0);
    }

    @Test
    public void MO_Percentual(){
        Calculos_CorrecaoCTC mo = new Calculos_CorrecaoCTC();
        double resultado = mo.MO_Percentual(30.7);
        assertEquals(3.07,resultado,0);
    }
    @Test
    public void Calcula_Carbono(){
        Calculos_CorrecaoCTC carb = new Calculos_CorrecaoCTC();
        double resultado = carb.Calcula_Carbono(0);
        assertEquals(0,resultado,0);
    }
    @Test
    public void quantidadeAplicar(){
        Calculos_CorrecaoFosforo quant = new Calculos_CorrecaoFosforo();
        double resultado = quant.quantidadeAplicar(12,1,8.59,0.7);
        assertEquals(123.95,resultado,1);
    }
    @Test
    public void superfosfatoSimples(){
        Calculos_CorrecaoFosforo valor = new Calculos_CorrecaoFosforo();
        double resultado = valor.superfosfato_Simples(12, 1, 123.95, 8.59, 0.7);
        assertEquals(12.4,resultado,1);
    }
    @Test
    public void enxofre(){
        Calculos_CorrecaoFosforo valor = new Calculos_CorrecaoFosforo();
        double resultado = valor.enxofre(123.95,1);
        assertEquals(34.71,resultado,1);
    }
    @Test
    public void custoFosforo(){
        Calculos_CorrecaoFosforo valor = new Calculos_CorrecaoFosforo();
        double resultado = valor.custoFosforo(1,123.95,1260);
        assertEquals(156.18,resultado,1);
    }
    @Test
    public void potassioSolo(){
        Calculos_CorrecaoPotassio valor = new Calculos_CorrecaoPotassio();
        double resultado = valor.potassioCtcSolo(5.76, 1.63, 0.15,5.35);
        assertEquals(1.16,resultado,1);
    }
    @Test
    public void potassioDesejada(){
        Calculos_CorrecaoPotassio valor = new Calculos_CorrecaoPotassio();
        double resultado = valor.potassioCtcDesejada(1);
        assertEquals(3,resultado,1);
    }

    @Test
    public void custoPotassio(){
        Calculos_CorrecaoPotassio valor = new Calculos_CorrecaoPotassio();
        double resultado = valor.custoPotassio(2500, 450.55, 1);
        assertEquals(1126.37,resultado,1);
    }
    @Test
    public void quantidadeAplicarPotassio(){
        Calculos_CorrecaoPotassio valor = new Calculos_CorrecaoPotassio();
        double resultado = valor.quantidadeAplicarPotassio(1,0.15,3.0,valor.potassioCtcSolo(5.76, 1.63, 0.15,5.35));
        assertEquals(450.55,resultado,1);
    }
    
    @Test
    public void teoresDoSoloTest(){
        Calculos_CorrecaoCTC CTC = new Calculos_CorrecaoCTC();
        
        assertEquals(new double[]{9.0, 0.35, 6.0, 1.5, 9.0, 0.0},CTC.SoloIdeal(1));
        assertEquals(new double[]{12.0, 0.25, 4.0, 1.0, 6.0, 0.0},CTC.SoloIdeal(2));
        assertEquals(new double[]{0.0,0.0,0.0,0.0,0.0,0.0},CTC.SoloIdeal(3));
        
        assertEquals(7.54, CTC.S_cmol(5.76, 1.63, 0.15),0.0);
        assertEquals(10.22, CTC.S_cmol(6.94, 2.87, 0.41),0.0);
        assertEquals(16.74, CTC.S_cmol(12.45, 3.47, 0.82),0.0);
        
        assertEquals(12.89,CTC.CTC_cmol(5.76, 1.63, 0.15, 5.35),0.0);
        assertEquals(14.50,CTC.CTC_cmol(6.94, 2.87, 0.41, 4.28),0.0);
        assertEquals(21.89,CTC.CTC_cmol(12.45, 3.47, 0.82, 5.15),0.0);
        
        assertEquals(58.494957331264544, CTC.V_At(5.76, 1.63, 0.15, 5.35), 0.0);
        assertEquals(70.48275862068967, CTC.V_At(6.94, 2.87, 0.41, 4.28), 0.0);
        assertEquals(76.47327546825034, CTC.V_At(12.45, 3.47, 0.82, 5.15), 0.0);
        
        assertEquals(3.07, CTC.MO_Percentual(30.7),0.0);
        
        assertEquals(17.848837209302324, CTC.Calcula_Carbono(
                                                             CTC.MO_Percentual(30.7)),0.0);
    }
}
