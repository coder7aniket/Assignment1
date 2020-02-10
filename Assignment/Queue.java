package Assignment;

import java.util.Scanner;

class Myqueue 
{	
	int queue[] = new int[30];
    int front = -1;
    int rear = -1;
	void create(int item)
	{
		if (front == (rear+1)%30) 
		{
            System.out.println("queue is overflown");
        }
        else if((front==-1) && (rear==-1))
        { 	
        	front=0;
        	rear=(rear+1)%30;
            queue[rear] = item;
        }
        else
        {
        	rear=(rear+1)%30;
        	queue[rear]=item;
        }
	}
	void delete()
	{
		if (front==-1) {
            System.out.println("underflow");            
        }
        else if(rear==front)
        {
        	int x=queue[front];
            System.out.println("the deleted element is :" + x);
            front++;  
        } 
        else
        {
        	int x=queue[front];
        	System.out.println("the deleted element is :" + x);
        	front=(front+1)%30;
        	
        }
	}
	void display()
	{	int i;
		for (i = front;i<rear+1;i++) {
            System.out.println(queue[i]);
        }
		
	}
	
}
public class Queue
{
	public static void main (String ar[])
	{	
		Myqueue q=new Myqueue();
		int ch;
		do
		{	
			System.out.println("1.To add an element into your queue");
			System.out.println("2.To delete an element from your queue");
			System.out.println("3.To display your queue");
			System.out.println("4.Exit from this operation ");
			System.out.println("Enter your choice");
			ch= new Scanner(System.in).nextInt();
	
			switch(ch)
				{
					case 1: System.out.println("create function calling");
							System.out.println("Enter your item");
							int item=new Scanner(System.in).nextInt();	
							q.create(item);
							break;
					case 2: System.out.println("delete function calling");
							q.delete();
							break;
					case 3: System.out.println("display function calling");
							q.display();
							break;
					case 4: 
							break;
					default:
							System.out.println("Wrong choice");
				}
		}while(ch!=4);

	}
}
