package charproblem;

public class CharArrayRev {
	
	public static void charArray(char arr[]) {
		int i = 0;
		int j = arr.length-1;
		while(i < j) {
			arr[i] = (char) (arr[i]+arr[j]-(arr[j]=arr[i]));
			i++;
			j--;
		}
		for(char k : arr) {
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'a','b','c','d','e','f'};
		CharArrayRev.charArray(arr);
	}

}
