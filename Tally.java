import java.util.*;
public class Tally{
	public static void main(String[] args){
		int [] test = {1,2,3};
		int num = mode(test);
		System.out.println(num);

	}

	public static int mode(int[] a) {
    
	    // tally all the occurrences of each element 
	    int[] tally = new int[101]; 
	    for (int i = 0; i < a.length; i++) { 
	        tally[a[i]]++; 
	        System.out.println("tally array = " + Arrays.toString(tally));
	    } 
	    
	    // scan the array of tallies to find the highest tally (the mode) 
	    int maxCount = 0; 
	    int modeValue = 0; 
	    for (int i = 0; i < tally.length; i++) { 
	        if (tally[i] > maxCount) { 
	            maxCount = tally[i]; 
	            modeValue = i; 
	        } 
	    } 
	    return modeValue; 
	}
}
