/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomRules;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author Carlos
 */
public class TimeTestRule implements TestRule
{
    
    public TimeTestRule() 
    {
        
    }

    @Override
    public Statement apply(Statement stmnt, Description d) {
        return new TimeStatement(stmnt);
    }
    
    class TimeStatement extends Statement
    {
        private final Statement stmnt;
        TimeStatement(Statement stmnt)
        {
            this.stmnt=stmnt;
        }
        
    }
    
    public void evaluate() throws Throwable
    {
        long time = 0;
        try
        {
            time = System.currentTimeMillis();
            stmnt.evaluate();
        }
        
        finally
        {
            System.out.println(("La prueba tardo") + (System.currentTimeMillis()-time));
        }
        
    }
    
}
