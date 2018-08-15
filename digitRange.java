public class digitRange{

	public static void main (String[] args){
		int num1 = 68437;
		int range1 = digitRange(num1);
		//System.out.println(range1);

		int num2 = swapDigitPairs(1234567);
		//System.out.println(num2);

		mystery(40);
	}
	public static int digitRange(int num){

		int min = 10000;
		int max = -10000;

		while (num / 10 != 0){	
			int digit = num % 10; //save last number for max/min
			num  /= 10; //shave off last number from original number
			if (digit < min){
				min = digit;
			} else if (digit > max){
				max = digit;
			}
		}
		return max - min +1 ;

	}
	public static int swapDigitPairs(int number) {
	    int result = 0;
	    int place = 1;
	    while (number > 9) {
	        result += place * 10 * (number % 10);
	        //System.out.println("result = " + result);
	        number /= 10;
	        //System.out.println("number = " + number);
	        result += place * (number % 10);
	        //System.out.println("result = " + result);
	        number /= 10;
	        //System.out.println("number = " + number);
	        place *= 100;
	        //System.out.println("place " + place); 
	    }
	    return result + place * number;
	}
	public static void mystery (int n){
		System.out.print(n + " ");
		if (n > 10){
			n = n / 2;
		} else {
			n = n + 7;
		}
		if (n *2 < 25){
			n = n + 10;
		}
		System.out.println(n);
	}

}
