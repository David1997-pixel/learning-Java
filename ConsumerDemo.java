 package lambdaexpressions;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String  > cons=( input)->{
		System.out.println(input);
		
				
		};
		
	cons.accept("hello  world");
	
	Supplier<LocalDateTime> sup = () -> LocalDateTime.now();
		
	
	
	System.out.println(sup.get());
	
	System.out.println("Hello world...");

	}

}
