package String_Java;

public class Count_Each_Char_In_give_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello"; 
		int strlen=str.length();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			System.out.print("Count of "+ch+" :");
			System.out.print(strlen-str.replace(Character.toString(ch), "").length());
			System.out.println();
		}
				
//		System.out.println("length of a given string: "+ strlen);
//		System.out.println("Count of H: "+(str.length()-str.replace(Character.toString(str.charAt(0)), "").length()));
//		System.out.println(str.length()-str.replace(Character.toString(str.charAt(1)), "").length());
//		System.out.println(str.length()-str.replace(Character.toString(str.charAt(2)), "").length());
//		System.out.println(str.length()-str.replace(Character.toString(str.charAt(3)), "").length());
//		System.out.println(str.length()-str.replace(Character.toString(str.charAt(4)), "").length());
		
		
	}

}
