package javaPrograms;

public class ImplimentInterface  implements InterfaceOne,InterfaceTwo {

	public static void main(String[] args) {
		ImplimentInterface i1=new ImplimentInterface();
     i1.print();
     InterfaceOne i2=new ImplimentInterface();
     i2.print();
     InterfaceTwo i3=new ImplimentInterface();
     i3.print();
     i1.hello();
     i1.hello1();
     i1.hello2();
     
	}

	@Override
	public void print() {
	System.out.println("print method");
		
	}
	public void hello() {
		System.out.println("hello");
	}
	public void hello1() {
		System.out.println("hello1");
	}
	public void hello2() {
		System.out.println("hello2");
	}
	

}
