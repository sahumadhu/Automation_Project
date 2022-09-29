package SimpleProgram1;

public class Static_Local_N_All {
	static int a=8;  // static
	 int ba=5;       // instance, belongs to object
	 
	Static_Local_N_All(){
		// constructor
		

		int ff=5;  // local variable, belongs to object
	}
	
	static int b=5;   // static
	int bb=5;    // instance, belongs to object
	
	public static void main(String[] args) {
	// input for the login method like uid and pwd
		
		/* This code
		 * is used to login into application
		 */

		int z=a;  // local 
              
                System.out.println(z); 
                System.out.println(a);
                //System.out.println(ba);//error
                System.out.println(b);
                //System.out.println(bb);//error
    }
   static int c=5;
   int cc=5;
}