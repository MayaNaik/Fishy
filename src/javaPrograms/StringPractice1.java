package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class StringPractice1 {

	public static void main(String[] args) {
		String s1=" i am i name is am abc i am", duplicateword="";
		String[]s=s1.split(" ");
		Set<String>s2=new HashSet<String>();
		//String[]duplicate = String[] ;
		for(String name:s) {
			if(s2.add(name)==false)
			{
				duplicateword =name;
			}
		}
		
		System.out.println("Dublicate values are "+duplicateword);
			for(int i=0;i<s.length;i++)
			{
				if(s[i].equalsIgnoreCase(duplicateword))
				{
					s[i]="";
				}
				System.out.print(s[i].trim()+" ");
				
			}
			//System.out.println(s);

		
	}

}//it has to check how to remove duplicate from string
