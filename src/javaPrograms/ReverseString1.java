package javaPrograms;

public class ReverseString1 {

	public static void main(String[] args) {
		String s1="i got job ";
		String rev=" ";
		String s1new[]=s1.split(" ");
		for(int i=s1new.length-1;i>=0;i--)
		{
		rev=rev+" "+s1new[i];

	}
		System.out.println(rev);

}
}
