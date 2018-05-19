package javaPrograms;

public class ImplimentAbstractClass extends PracticeAbstract {

	public static void main(String[] args) {
		ImplimentAbstractClass imp=new ImplimentAbstractClass();
		PracticeAbstract.balance(100);
        imp.withdrow();
        System.out.println(PracticeAbstract.statment);
	}

	
	public void withdrow() {
		System.out.println("widrowal amt is ");
		
	}

}
