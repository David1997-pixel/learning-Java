package lambdaexpressions;

public class LambdaRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable runnable=()->{
			System.out.println("Runnable interface threads working");
		};
		
		Thread thread1= new Thread(runnable);
		thread1.start();
		
		Thread thread2= new Thread(()->System.out.println("I am implementing it directly"));
		thread2.start();

}
}
