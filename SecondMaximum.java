package string;

public class SecondMaximum {
	
	public static void secondMaximum(int arr[]) {
		int longest = Integer.MIN_VALUE;
		int secondlongest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length;i++) {
			if(longest < arr[i]) {
				secondlongest = longest;
				longest = arr[i];
			}
			else if(secondlongest < arr[i] && arr[i] < longest ) {
				secondlongest = arr[i];
			}
		}
		System.out.println(longest+" "+secondlongest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {38,84,9,2,56,37,39,4};
		SecondMaximum.secondMaximum(arr);

	}

}
