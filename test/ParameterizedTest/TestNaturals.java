/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParameterizedTest;

import helpers.PrimeNumbers;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Carlos
 */
@RunWith(Parameterized.class)
public class TestNaturals 
{
    
    
    
  
    private Integer num; 
    private Boolean expected;
    private isNatural clase;
    
    @Before
    public void before()
    {
        clase = new isNatural();
    }
    
    public TestNaturals(Integer num, Boolean expected)
    {
        this.num = num;
        this.expected = expected;
    }
    
    @Parameters
    public static Collection primeNumber2Test()
    {
      return Arrays.asList(new Object [][]
              {
                    {6, true},
                    {28, true},
                    {5, false},
                    {10, false},
                   
              
              });
    }
    
    @Test
    public void testPrimeNumbers()
    {
        System.out.println("el numero probado es:" + num);
        assertEquals("error" + num, expected, clase.isNatural(num));
    }
    
}

    
    

