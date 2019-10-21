package number;

public class RoundOff {

	public static void roundOff(double d) {
		if(((double)(int)d)+0.5 > d) {
			System.out.println((int)d);
		}
		else {
			System.out.println((int)d+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoundOff.roundOff(34.90);
		RoundOff.roundOff(34.20);
		RoundOff.roundOff(99.50);
		RoundOff.roundOff(99.00);
	}

}
