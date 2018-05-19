package javaPrograms;

public class PatternJava {

	public static void main(String[] args) {
		
		int noofRow;
		int row,colspaces,colChar;
		for(row=0;row<7;row++)
		{
			for(colspaces=7-row;colspaces>=1;colspaces--)
			{
				System.out.print("");
			}
			int  printChar=1;
			int num=row;
			int den=1;
			for(colChar=0;colChar<=row;colChar++)
			{
				System.out.print(printChar);
				printChar=printChar*num;
				printChar=printChar/den;
				num--;
				den++;
			}
			System.out.println();
		}
	}
}
