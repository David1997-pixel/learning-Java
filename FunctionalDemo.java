package lambdaexpressions;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}

public class FunctionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> func= new FunctionImpl();
		
		System.out.println(func.apply("Ramesh")) ;
		
		Function<String, Integer> function =(String s)->s.length();
		
		System.out.println(function.apply("DavidMurege"));
		
		

	}

}
