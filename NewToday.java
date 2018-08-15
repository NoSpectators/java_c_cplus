public class NewToday{
	public static void main(String[] args){
		oddStuff();
		weird();
	}
	public static void oddStuff() {
		int number = 4;
		for (int count = 1; count <= number; count++) {
			System.out.println(number);
			number = number / 2;
		}
    } 
    public static void weird(){
		for (int i = 1; i <= 3; i++)
            System.out.println("How many lines");
            System.out.println("are printed?");
		
	}
}