package learnings;


public class FibonacciSeries {

	public static void main(String[] args) {
		
			
		int range = 8, firstNum = 0, secNum = 1;
		System.out.println("FibonacciSeries:"+range);
		System.out.print(firstNum);
		System.out.print(" " + secNum);
		for(int i=1;i<range-1;i++) {
			 int sum = 0;
			sum+= (firstNum + secNum);
			firstNum = secNum;
			secNum = sum;
			System.out.print(" " + sum);
		}			
	
		
	}
}
