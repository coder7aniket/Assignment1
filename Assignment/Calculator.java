package Assignment;

import java.util.Scanner;

public class Calculator {
	public static void main (String ar[])
	{	int ch;
		do
		{	System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Divison");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			ch= new Scanner(System.in).nextInt();
			
			switch(ch)	
			{	
				case 1 :
					int n1,n2;
					System.out.println("Enter first number");
					n1=new Scanner(System.in).nextInt();
					System.out.println("Enter Second number");
					n2=new Scanner(System.in).nextInt();
					System.out.println("output = " + (n1 + n2));
					break;
				case 2 :
					int num1,num2;
					System.out.println("Enter first number");
					num1=new Scanner(System.in).nextInt();
					System.out.println("Enter Second number");
					num2=new Scanner(System.in).nextInt();
					System.out.println("output = " + (num1 - num2));
					break;
				case 3 :
					int nu1,nu2;
					System.out.println("Enter first number");
					nu1=new Scanner(System.in).nextInt();
					System.out.println("Enter Second number");
					nu2=new Scanner(System.in).nextInt();
					System.out.println("output = " + (nu1 * nu2));
					break;
				case 4 :
					int f1,f2;
					System.out.println("Enter first number");
					f1=new Scanner(System.in).nextInt();
					System.out.println("Enter Second number");
					f2=new Scanner(System.in).nextInt();
					System.out.println("output = " + (f1 / f2));
					break;
				case 5 :
					System.exit(0);
					break;
				default :
					System.out.println("Wrong choice..!!\n");
			}
			} while(ch!=5);
		
		
		
	}
	
	
	
	

}
