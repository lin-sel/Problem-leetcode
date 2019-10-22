package string;

// Given a string, the task is to count all palindrome substring in a given string. 
//Length of palindrome substring is greater then or equal to 2.
public class PalindromeSubstringCount {
	
	public static int palindromeSubstring(String str) {
		
		String st = "";
		StringBuffer stf;
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j <= str.length();j++) {
				st = str.substring(i,j);
				if(st.length()>=2) {
					stf = new StringBuffer(st);
					stf.reverse();
					if(stf.toString().compareTo(st) == 0) {
						count++;
					}
				}
			}
		}
		
		return count;
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println(PalindromeSubstringCount.palindromeSubstring("abbaeae"));
	}

}
