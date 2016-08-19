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
public class PrimeNumbers 
{
    public Boolean isPrime(Integer num)
    {
        for(int i=2; i<(num/2); i++)
        {
            if(num%i == 0) 
            {
                
                return false;
                
            }
        }
        
        return true;
    }
    
    public Boolean isNatural(Integer num)
    {
        int x = 0;
        
        for(int i=1; i<num; i++)
        {
            if(num%i==0)
            {
                x = x + i;
            }
        }
        
        if(x==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
