package javaPrograms;

public abstract  class  PracticeAbstract {

	public static boolean statment=true;
	public abstract void  withdrow();
	public  static void balance(int i) {
		System.out.println("total bal is" +i);
	}
	
	PracticeAbstract(){
		System.out.println("connstructor of abstract class");
	}

	public static void main(String[] args) {
	System.out.println(PracticeAbstract.statment);
	PracticeAbstract.balance(900);
	}

}
