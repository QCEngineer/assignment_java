package exception.com;


	// Java program practice of throws
	
	public class ThrowsExecp {
		
		static void practice() throws IllegalAccessException
		{
			System.out.println("Inside practice print  ");
			
			throw new IllegalAccessException("practice");
		}

		public static void main(String args[]) {
			// TODO Auto-generated method stub

			try {
				practice ();
			}
			catch (IllegalAccessException e) {
				
				System.out.println("working ");
			}
		}
	}
