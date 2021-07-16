package learnings;


public class RemoveDuplicates {

	public static void main(String[] args) {
		

		String text = "We learn java basics as part of java sessions in java week1";
		int count =0;
		
		String arr[] = text.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
				}
			}
			if(count>1) {
				arr[i] = "";
			}else {
				System.out.print(arr[i]+ " ");
			}
		}
		
		
		
	}
}
