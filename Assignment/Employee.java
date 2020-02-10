package Assignment;

final class Details
{
	final String name; 
	final int empid; 

	public Details(String name, int empid) 
		{ 
			this.name = name; 
			this.empid =empid; 
		} 
		public String getName() 
			{ 
				return name; 
			} 
		public int getEmpid() 
			{ 
				return empid; 
			}
}

public class Employee
		{ 
		public static void main(String ar[]) 
			{ 
				Details d1 = new Details("ABC", 101); 
				System.out.println(d1.getName()); 
				System.out.println(d1.getEmpid());  
				//e1.regNo = 102; 
			} 
		} 
	

