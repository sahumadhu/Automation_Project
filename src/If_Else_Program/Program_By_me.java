package If_Else_Program;

public class Program_By_me {
	
	
	public static void main (String[] args) {
		int a=5; //a=5 b=7 c=9
		int b=7;
		int c=9;
		
		// version 1: only if
		if (a<b) {
			System.out.println("this is a if statement without else.");
			}
		System.out.println("--------------");
		// version 2: if else statement
		if (a<b && a<c) //5<7 AND 5<9
		{  
			System.out.println("this is a block.");
			System.out.println("this is a if block.");
		    System.out.println("condition true"); // //if (a<b) ans will true
		}
		else {
			System.out.println("this is a else block.");
			System.out.println("condition false");  //if (b<a) ans will false, (b==a)
		}
		
		System.out.println("--------------");
		// version 3: Q. fine smallest num?
		int x=9;
		int y=7;
		int z=5;
		if (x<y && x<z) //x=9, y=7, z=5, AND 
		{
			System.out.println("x is smaller"); // ans false, 1st scenario true
		}
		else if(y<x && y<z)
		{
			System.out.println("y is smaller"); // ans false, 2nd scenario true
		}
		else
		{
			System.out.println("z is smaller"); //1st & 2nd both not true
		}
		
		
		System.out.println("--------------");
		// version 4: Nested if  statement
		if (a<b && a<c) //5<7 AND 5<9
		{  
			System.out.println("I am inside of if block");
			if(true) {  // only write true or false
			System.out.println("condition true"); // if true hai to show krega,
			                                      // false likha to print nhi krega 
			}
			
		}
		else {
			System.out.println("this is a else block.");
			System.out.println("condition false");  //if (b<a) ans will false, (b==a)
		}
	}
}
	
		