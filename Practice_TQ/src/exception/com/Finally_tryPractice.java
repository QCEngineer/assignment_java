package exception.com;

// 5. WAP where only try and finally is used

public class Finally_tryPractice {
	
	public static void main(String[] args){
		
		int a = 10, b = 5, c = 5, result;
		
		try {
			result = a / (b - c);
			System.out.println("result" + result);
		}

		catch (ArithmeticException e) {
			
			System.out.println("Exception got ,Divided by zero");
		}

		finally {
			System.out.println("Final block Start");
		}
	}
}
