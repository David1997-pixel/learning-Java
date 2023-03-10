package lambdaexpressions;

public class RunnableLambdaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable runnable=() ->System.out.println("running the reunnable method");
		
		
		Thread thread1= new Thread(runnable);
		thread1.start();

	}

}
