package array;

public class SecondLargest {
	
	// Function to find second largest.
	public int secondLargest(int arr[]){
		int largest = Intger.MIN_VALUE;
		int seclargest = Intger.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > largest){
				seclargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > seclargest){
				seclargest = arr[i];
			}
		}
		return seclargest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,98,18,893,36,09273,92837,9230180};
		SecondLargest sl = new SecondLargest();
		System.out.println(sl.secondLargest(arr));
	}

}
