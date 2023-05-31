package week1.day1;

public class Fibonacci1 {

	public static void main(String[] args) {
		int num1 = 0 ;
		int num2 = 1 ;
		int sum;
	for(int i = 0; i < 13; i++) {
	 sum = num1 + num2;
	 num1=num2;
	 num2=sum;
	 System.out.println("Fibonacci number is" + sum);
			 
		
	}
	
		
	}
   }
