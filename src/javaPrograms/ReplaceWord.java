package javaPrograms;

public class ReplaceWord {

	public static void main(String[] args) {
	String str1="nitin is tourist";
	String str2=str1.replace('n','N');
	System.out.println(str1);
	
	System.out.println(str2);
	String str3=str1.replace("nitin", "tourist");
	System.out.println(str3);
	String str="my name is abc";
	String Newstr=str.replace('a', 'e');
	System.out.println(Newstr);
	}

}
