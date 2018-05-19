package javaPrograms;

public class ObjectCount {
	static int count=0;
 ObjectCount(){
	count++;
}
	public static void main(String[] args) {
		new ObjectCount();
		new ObjectCount();
		new ObjectCount();
		new ObjectCount();
		new ObjectCount();
		ObjectCount.countOfObject();
	}
	public static void countOfObject()
	{
		System.out.println("no of object created are "+count);
	}

}
