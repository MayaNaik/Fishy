package javaPrograms;

import java.util.Scanner;

public class DecToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int binary=0,rem;
		while(no!=0) {
			rem=no%2;
			binary=binary*10+rem;
			no=no/2;
		}
		System.out.println("binary of no is "+binary);

	}

}
