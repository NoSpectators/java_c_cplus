public class firstDigit{

	public static void main(String [] args){
		int num1 = 3572;
		int first = firstDigit(num1);
		System.out.println(first);
		whileMystery(10, 31);
	}
	public static int firstDigit(int num){
		num = Math.abs(num);
		while (num / 10 != 0){
			num /= 10;
			//System.out.println(num);
		}
		return num;
	}
	public static void whileMystery(int x, int y){
		int s = 0;

		while (x > 0 && 2 * y >= x){
			System.out.print(s + " ");
			y = y - x;
			x--;
			s = s + x;
		}
		System.out.println(s);
	}

}