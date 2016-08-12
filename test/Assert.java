/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import helpers.Calculadora;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class Assert {
    
    Calculadora c;
    @Before
    public void crearInstancias()
            
    {
        
        c = new Calculadora();
    }
    
    
    @Test
    public void test()
    {
        Calculadora b= null;
        
        Calculadora d = c;
        assertEquals(10, c.suma(5,5));
        assertTrue(true);
        assertFalse(false);
        assertNull(b);
        assertNotNull(c);
        assertSame(c,d);
        assertNotSame(b,c);
        
    }
    
    @Test
    public void multiplicaChars()
    {
        assertEquals(9506,c.mult('a','b'));
    }
    
    
    @Test
    public void divisionCero()
    {
        assertEquals(0,c.div(3,0));
    }
    public Assert() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
