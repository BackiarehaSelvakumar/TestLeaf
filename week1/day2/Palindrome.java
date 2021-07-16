package learnings;


public class Palindrome {

	public static void main(String[] args) {
		
		String input = "madam";
		String reverse = "";
		
		char charArr[] = input.toCharArray();
		
		for(int i=charArr.length-1; i>=0 ; i--) {
			reverse = reverse + charArr[i];
		}
		
		if(input.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}
}
