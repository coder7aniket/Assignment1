package Assignment;

import java.util.Scanner;

class MyStack 
{	
	int stack[]=new int[30];
	int top=-1;
	void push(int item)
	{
		 if (top == (10 - 1)) 
			{ 
    			System.out.println("stack overflow");
			} 
		 else 
			{ 
    			stack[++top] = item; 
			}
	}
	void pop()
	{
		if (top == 0) 
		{ 
		System.out.println("Stack Underflow"); 
		} 
	else
		{
		int x=stack[top--];
		System.out.println("deleted element = " + x);
		}
	}
	void display()
	{
		int i;
		for(i=0;i<top+1;i++)
		{
			System.out.println(stack[i]);
		}
	}
}
public class stack
{
	public static void main (String ar[])
	{	
		MyStack s=new MyStack();
		int ch;
		do
			{	
				System.out.println("1.To push an element into your stack");
				System.out.println("2.To pop an element from your stack");
				System.out.println("3.To display your stack");
				System.out.println("4.Exit from this operation");
				System.out.println("Enter your choice");
				ch= new Scanner(System.in).nextInt();
	
				switch(ch)
				{
					case 1: 
							System.out.println("push function calling");
							System.out.println("push item in your stack");
							int item= new Scanner(System.in).nextInt();
							s.push(item);	
							break;
					case 2: 
							System.out.println("pop function calling");
							s.pop();
							break;
					case 3: System.out.println("display function calling");
							s.display();
							break;
					case 4: 
							break;
					default:
							System.out.println("Wrong choice");
				}
			}	while(ch!=4);

	}
}	

