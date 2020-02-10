package Assignment;

import java.util.Scanner;

public class MyCalculator extends Exception
	
	{  
		
		public MyCalculator()
		{
			
		}
		public MyCalculator(String s) 
		{
			super(s);
		}
	
		public static int pow(int base, int power) throws MyCalculator
	{	
		int i, output;
		if( base<0 || power<0) 
	     { 
	      throw new MyCalculator("base or power not be negative");
	     }
		
		output=base;
		
		for(i=1;i<power;i++)
		{
			output=output*base;
		}
		return output;
	}
	
	public static void main(String ar[])
	{	
		int base,power,result;
		try
		{
		System.out.println("enter positive base integer");
		base=new Scanner(System.in).nextInt();
		System.out.println("enter positive power integer");
		power=new Scanner(System.in).nextInt();
		result=pow(base,power);
		
		System.out.println("output is = "+ result);
		}
		catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+m);
	      } 
	}

}
