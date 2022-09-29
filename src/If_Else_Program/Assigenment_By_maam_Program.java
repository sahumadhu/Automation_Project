package If_Else_Program;

public class Assigenment_By_maam_Program {
	public static void main(String[] args) 
	{
		System.out.println("********************************");
		System.out.println("Q.1 Print grades (A, B, C) based on the percentage obtained by a student.\r\n"
				+ "\r\n"
				+ "if the percentage is above 90, assign grade A\r\n"
				+ "if the percentage is above 75, assign grade B\r\n"
				+ "if the percentage is above 65, assign grade C");
		int per=85;
		if (per>90) {
			System.out.println("==>Grad A");
		}
		else if (per>75 && per<90) {
			System.out.println("==>Grad B");
		}
		else if (per>65 && per<75 ){
			System.out.println("==>Grad C");
		}
		else {
			System.out.println("==>Grad D");
		}

		System.out.println("********************************");
		System.out.println("Q.2 check whether given number is positive or negative.");
		int a=85;
		if (a>0) {
			System.out.println("=>positive");
		}
		else if (a<0 ){
			System.out.println("=>Neagtive");
		}
		
		else {
			System.out.println("=>Zero");
		}
		System.out.println("********************************");
		System.out.println("Q.3 Check whether the given number is even or odd.");
		int b=88;
		if (b%2==0) {
			System.out.println("=>Even");
		}
			else {
			System.out.println("=>Odd");
		}
		System.out.println("********************************");
		System.out.println("Q.4 Find the smallest and largest number in the given 5 number.");
		int c=78,d=55,e=83,f=89,g=58;
		if(c>d && c>e &&  c>f && c>g) {
			System.out.println(c+" is Largest");
		}
		else if(d>e && d>f &&  d>g ) {
			System.out.println(d+" is Largest");
		}
		else if(e>f && e>g) {
			System.out.println(e+" is Largest");
		}
		else if(f>g) {
			System.out.println(f+" is Largest");
		} 

			else {
			System.out.println(g+ " is Largest");
		}
		// smallest programme
		if(c<d && c<e &&  c<f && c<g) {
			System.out.println(c+" is smallest");
		}
		else if(d<e && d<f &&  d<g ) {
			System.out.println(d+"is smallest");
		}
		else if(e<f && e<g) {
			System.out.println(e+" is smallest");
		}
		else if(f<g) {
			System.out.println(f+" is smallest");
		}

			else {
			System.out.println(g+ " is smallest");
		}
		System.out.println("********************************");
		System.out.println("Q.5 Check whether the given year is a leap year or not. leap year is divisible by 4 and 400. But, not by 100.");
		int y=2000;
		if (y%4==0 && y%400==0 ) {
			System.out.println("Leap year");
		}
			else {
			System.out.println("not a leap year");
		}
		
		 
	}
}

	