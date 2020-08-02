package toughprogram;

import org.exceptions.MyException1;

class Calculator {

	public int power(int a, int b) throws Exception 
    {
        int d =1;
        
        try{
    if(!(a==0) && !(b==0) && !(a<0) && !(b<0))
    {
     for(int i =0 ; i<b;i++)
     {
        d = d*a;
         
     }
     
        } 
 
    else if ((a<0) && (b<0))
    {
  throw new Exception("n or p should not be negative");
  
      }
    else if ((a==0) || (b==0))
    {
          throw new MyException1("n and p should not be zero.");
         
            }  
    
        }
        finally
        {
        	
        }
        return d;  
    }  
    

}
