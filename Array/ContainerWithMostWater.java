/*
 * 
 * Given n non-negative integers a1, a2, ..., an , 
 * where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 * 
 * Example:
 * Input: [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * 
 * 
 */


package array;

public class ContainerWithMostWater {
	
	public int maxArea(int[] height) {
		
		int index = 0;
		int maxarea = Integer.MIN_VALUE;
		int end = height.length-1;
		while(index < end) {
				int localmax = height[index] > height[end] ? height[end]*Math.abs(index-end) : height[index]*Math.abs(index-end);
				if(localmax > maxarea) {
					maxarea = localmax;
				}
				if(height[end] > height[index]) {
					index += 1;;
				}
				else {
					end -= 1;
				}
		}
		
		return maxarea;
	}
	public static void main(String[] args) {
		int []height  = {1,2,1};
		ContainerWithMostWater cwm = new ContainerWithMostWater();
		System.out.println(cwm.maxArea(height));
	}

}
