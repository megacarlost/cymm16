/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomRules;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author Carlos
 */
public class TestCustomRule {
    @Rule
    public TimeTestRule r = new TimeTestRule();
    
    
    @Test
    public void casodeprueba1()
    {
        assertEquals("Son inguales", 5,5);
    }
    
    public void casodeprueba2()
    {
        assertEquals("Es nulo", null);
    }
    
    public void casodeprueba3()
    {
        assertEquals("Es verdad que van a pasar", true);
    }
    
    
    public TestCustomRule() {
    }
    
}
