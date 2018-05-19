package javaPrograms;

public class ReverseString {
	static String rev="";
	public static void main(String[] args) {
		String s1="Sandy is bad";
		for(int i=s1.length()-1;i>=0;i--) {
			 rev=rev+s1.charAt(i);
			 
		}
		System.out.println("reverse string is"+" "+rev);
	}

}
