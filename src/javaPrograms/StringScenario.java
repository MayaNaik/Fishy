package javaPrograms;

public class StringScenario {
//String s="my account no is 12345" position of 12345 can vary then display 12345; 
	public static void main(String[] args) {
		String s="my account 12345 no is ";int i=0;
		i=s.indexOf("12345");
	System.out.println("index i="+i);	
	

System.out.println(s.subSequence(i, i+5));

	}

}
