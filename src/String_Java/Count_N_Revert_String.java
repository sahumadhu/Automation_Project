package String_Java;

public class Count_N_Revert_String {

	public static void main(String[] args) {
		String str="Hello";
		int strlen = str.length();
		// System.out.println(strlen);
		String st2=str.replace("l", "");
		int st2len=st2.length();
		System.out.println(strlen-st2len);
		
		System.out.println(str.length()-str.replace("l", "").length());

	}

}
