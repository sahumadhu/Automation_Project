package SimpleProgram1;

public class Ex_Long_Primitive_DataType {

	public static void main(String[] args) {

			double d=7.5;
			int i=(int) d; // int is casting 
			int i2=5;// 4 bit
			double d2=i2;// 8bit
			long l=500000000;
			int i3=(int) l;
			
		//	System.out.println(d);
			//	System.out.println(i);
			//	System.out.println(d2);
			//	System.out.println(i2);
			//	System.out.println(l);
			//	System.out.println(i3);
			char c=78; // 4byte
			int i5=c; // 4 byte
			int d5=5;
			char a='N'; // ASCII CODE equivalent char
			System.out.println(c);
			System.out.println(d5);
			System.out.println(a);
			System.out.println(c+d5);// N+5
			System.out.println(i5);
		}
	}