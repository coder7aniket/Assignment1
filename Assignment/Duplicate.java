package Assignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Duplicate
{   
	
    public static void main(String[] args) 
    {  
        int i,item,max;
        
        System.out.println("enter the max length of your list");
        max=new Scanner(System.in).nextInt();
        
        ArrayList<Integer> list=new ArrayList();
        
        for(i=0;i<max;i++)
        	{  
        	System.out.println("enter items");
        	item=new Scanner(System.in).nextInt();
            list.add(item);
        	}
        System.out.println(list);
        
        ArrayList<Integer> list1=new ArrayList();
        
        Iterator it = list.iterator();
        
        while(it.hasNext())
        	{
        	it.next();
        	}   
        System.out.println("for each loop");
        
        for(Integer k : list)
        	{
        	if (!list1.contains(k)) 
        		{ 
                list1.add(k); 
        		} 
        	}
        System.out.println(list1);      
        
     }
}