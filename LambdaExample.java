package lambdaexpressions;

interface Shape{
	void execute();
	
	default void add(int a, int b) {
		System.out.println(a+b);
	}
}

public class LambdaExample {

	public static void main(String[] args) {
		
		Shape shape = ()-> System.out.println("I am executing a method in functionl minterface");
shape.execute();

Shape shape1= () -> {
	System.out.println("I am a functional interface ");
	System.out.println("I am a version 8 type");
};
System.out.println();

shape1.execute();
shape1.add(2, 4);

	}

}
