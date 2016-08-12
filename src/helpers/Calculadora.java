/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Carlos
 */
public class Calculadora 
{
    
    public int suma(int a, int b)
    {
        return a + b;
    }
    
    public int resta(int a, int b)
    {
        return a - b;
    }
    
    public int mult(int a, int b)
    {
        return a * b;
    }
    
    public int div(int a, int b)
    {
        if(b==0)
        {
            return 0;
        }
        else
        return a / b;
    }
    
    
    
    
}
