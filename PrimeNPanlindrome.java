package number;

public class PrimeNPanlindrome {
	
	public static void primePalindromeNumber(int st, int ed) {
		
		for(int std = st;std<=ed;std++) {
			if(std%2 != 0 && std%3!=0 && std%5!=0) {
				if(palindrome(std)) {
					System.out.print(std+" ");
				}
			}
		}
	}
	
	public static boolean palindrome(int std) {
		
		int check = 0;
		int og = std;
		while(std > 0) {
			int lastdigit = std%10;
			check =(check * 10) +lastdigit;
			std /= 10;
		}
		if(og == check && og > 10) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNPanlindrome.primePalindromeNumber(2,100000);
	}
}
