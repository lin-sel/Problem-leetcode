package charproblem;

public class AlphabeticallyOrder {
	
	public static boolean checkOrder(char arr[]) {
		
		for(int i = 0; i < arr.length-2;i++) {
			if(toLower(arr[i]) < toLower(arr[i+1])) {
				continue;
			}
			else {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static int toLower(char st) {
		
		if((int)st >= 97) {
			return 65+((int)st-97);
		}
		
		return (int)st;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'A','B','C','D','E','f'};
		char arr2[] = {'k','q','A','a','E','F'};
		System.out.println(AlphabeticallyOrder.checkOrder(arr));
		System.out.println(AlphabeticallyOrder.checkOrder(arr2));
	}

}
