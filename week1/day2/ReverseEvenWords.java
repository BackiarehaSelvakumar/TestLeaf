package learnings;


public class ReverseEvenWords {

	public static void main(String[] args) {
		

		String test = "I am a software tester"; 
		String arr[] = test.split(" ");
		
		for(int i=0; i <arr.length; i++) {
			if(i % 2 != 0) {
				
				char charArr[] = arr[i].toCharArray();
				String reverse = "";
				for(int j=charArr.length-1; j>=0 ; j--) {
					reverse = reverse + charArr[j];
				}
				
				arr[i] = reverse;
			}
			
			System.out.print(arr[i]+ " ");
		}
		
		
		
	}
}
