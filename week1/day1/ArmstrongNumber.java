package learnings;


public class ArmstrongNumber {

	public static void main(String[] args) {
		
			
			int num =153;
			int original = num;
			int calculated = 0;
			int reminder = 0;
			
			while(original > 0) {
				
				reminder = original % 10;
				
				calculated = calculated + (reminder * reminder * reminder); 
				
				original = original / 10;
				
			}
			
						
			if(calculated == num) {
				System.out.println("ArmstrongNumber");
			}else {
				System.out.println("Not An ArmstrongNumber");
			}
		
		
	
	
		
		
	}
}
