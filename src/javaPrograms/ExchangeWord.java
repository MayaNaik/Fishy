package javaPrograms;

public class ExchangeWord {

	public static void main(String[] args) {
		String s="i am abc better than xyz";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equalsIgnoreCase("abc"))
			{
				s1[i]="xyz";
			}
			else if(s1[i].equalsIgnoreCase("xyz")) 
			{
				s1[i]="abc";
			}
			System.out.print(s1[i]+" ");
		}
	
	}




}





