package array;

public class ReachToTheEnd {
	
	public static boolean makeTrue(int[] arr) {
		int i = 0;
		while(i+arr[i] < arr.length) {
			i = i+arr[i];
			if(i == arr.length-1){
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,9,0};
		System.out.println(makeTrue(arr));
		int[] arr1 = {2,0,1,0};
		System.out.println(makeTrue(arr1));
	}

}
