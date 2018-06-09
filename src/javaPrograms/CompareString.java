package javaPrograms;

public class CompareString {

	public static void main(String[] args) {

String s1="123";
String s2="321";

//if(s1.equals(s2)) {
//System.out.println("Strings r equals");
//
//	}
//	else {
//	
//		System.out.println("strings r not equals");	
//		}
if(s1.compareTo(s2)==0) {
	System.out.println("Strings r equals");

	}
	else {
	
		System.out.println("strings r not equals");	
		
	}
System.out.println(s1.equals(s2));
System.out.println(s1.compareTo(s2));
System.out.println(s1==s2);
		}
}

