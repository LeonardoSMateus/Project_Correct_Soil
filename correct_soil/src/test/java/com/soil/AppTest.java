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
        Ctc_Cmol c = new Ctc_Cmol();
        double resultado = c.CTC_cmol(1, 1, 1, 5.35);
        assertEquals(8.35,resultado,0);
    }
    @Test

    public void S_Cmol(){
        S_Cmol s = new S_Cmol();
        double resultado = s.S_cmol(1, 1, 1);
        assertEquals(3,resultado,0);
    }
    
    public void V_Atual(){
        V_Atual v = new V_Atual();
        double resultado = v.V_At(0,0,0,0);
        assertEquals(0,resultado,0);
    }
}
