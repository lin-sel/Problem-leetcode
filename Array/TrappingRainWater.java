/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 * compute how much water it is able to trap after raining.
 * 
 * Example:
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * 
 * Input: [4,2,3]
 * Output: 1
 * 
 * Input: [2]
 * Output: 0
 * 
 * Input: []
 * Output: 0
 * 
 */




package array;

public class TrappingRainWater {
	 
	public int trap(int[] height) {
        int total = 0;
        if(height.length == 0 && height.length == 1){
            return total;
        }
        int length = height.length;
        int[] east = new int[length];
        int max = 0;
        for(int i = 0; i < height.length; i++) {
        	if(height[i] >= height[max]) {
        		max = i;
        	}
        }
        
        for (int i = 0; i <= max && i < height.length; i++) {
            if (i == 0) {
                east[i] = height[i];
            } else {
                east[i] = Math.max(east[i - 1], height[i]);
            }
        }
        
        for(int i = height.length-1; i > max; i--) {
        	if (i == height.length-1) {
                east[i] = height[i];
            } else {
                east[i] = Math.max(east[i + 1], height[i]);
            }
        }
        
        for (int i = 0; i < length; i++) {
             total += east[i] - height[i];
        }
        
        return total;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = {4,2,3};
		TrappingRainWater trw = new TrappingRainWater();
		System.out.println(trw.trap(height));
		
	}

}
