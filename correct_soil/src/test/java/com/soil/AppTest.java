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
}
