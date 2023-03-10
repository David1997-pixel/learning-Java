package lambdaexpressions;

interface Draw{
	void draw();
}

public class LambdaExampe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Draw circle= () -> System.out.println("Circle drawing");
		//circle.draw();
		
		Draw rectangle= ()-> System.out.println("rectangle drawing..");
		//rectangle.draw();
		
		Draw triangle  = ()->System.out.println("Draw triangle");;
		
		print(circle);
		print(rectangle); 
		print(triangle);

		
		print(()->System.out.println("Draw triangle"));
	}
	
	private static void print(Draw circle) {
		circle.draw();
	}

}
