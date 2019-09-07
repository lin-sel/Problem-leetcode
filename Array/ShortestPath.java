/*
 * Minimum number of jumps to reach end
 * Given an array of integers where each element represents the max number of steps that can be made forward from that element. Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then cannot move through that element.
 *
 * Example:
 *
 * Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
 * Output: 3 (1-> 3 -> 8 ->9)
 * First element is 1, so can only go to 3. Second element is 3, so can make at most 3 steps eg to 5 or 8 or 9.
 * 
 */


package array;

public class ShortestPath {
	
	public static int largestelement(int arr[],int path,int init) {
		int largest = arr[path+1];
		int index = path+1;
		for(int i = path+1; i <= init ; i++) {
			if(largest < arr[i]) {
				largest = arr[i];
				index = i;
			}
		}
		
		return index;
	}
	public static void pathfind(int arr[]) {
		int init = 0;
		int path = arr[0],index = 0;
		System.out.print(path+"->");
		while((path+init) < arr.length) {
			init += path;
			index = largestelement(arr,index,init);
			path = arr[index];
			System.out.print(path+"->");
		}
		System.out.print(arr[arr.length-1]);
	}
	public static void main(String[] args) {
		int arr[] = {2,6,1,2,5,7,8,12,5,9,7,5};
		pathfind(arr);
	}

}
