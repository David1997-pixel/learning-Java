package lambdaexpressions;

interface Addable{
	int addition(int a,int b);
}

public class LambdaParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable add= (int a,int b)->(a+b);
		
	
		System.out.println(	add.addition(0, 0));
		
		Addable add1= (int a, int b)->{
			int c= a+b;
			return c;
		};
		
	int result=	add1.addition(23, 45);
	
	System.out.println(result);
		

	}

}
