/**
 *ICE 22.1
 *@author 
 *@unityID jcericks
 *class HuntLibrary prints information about books checked out or in 
 */
public class HuntLibrary{
    /**
	 *main method creates 2 book objects using an array
	 *@params command line args
	 *@prints info about book checked out
	 */
    public static void main(String[] args){
	    /*                Creates two Book objects             */
		/*          A Book should start in the checked state   */
		
		//checkedOut and dueDate = null;
		//sets the location to some number 
		Book[] book = new Book[3];//book objects 		
		book[0] = new Book("Building Java Programs: A Back to Basics Approach", "Stuart Reges and Marty Stepp",
		2013, 1);
		book[1] = new Book("Java Precisely", "Peter Sestoft", 2005, 5);
		book[2] = new Book("Java Precisely", "Peter Sestoft", 2005, 5);
		
		/*          Prints book info about books        */ 
		System.out.println("Book 1:\n" + book[0].toString());
		System.out.println("Book 2:\n" + book[1].toString());
		
		/* Checks out two books and prints out name and due date info */ 
		book[0].checkOut("alice");
		book[1].checkOut("bob");
		System.out.println("Book 1 is checked out to " + book[0].getCheckedOut()
			+ " and is due back to library by " + book[0].getDueDate());
		System.out.println("Book 2 is checked out to " + book[1].getCheckedOut()
			+ " and is due back to library by " + book[1].getDueDate());
			
		/*  Checks out a book; if already checked out, prints error */ 
		if (!book[0].checkOut("carol")){
		    System.out.println("Failed to check Book 1 out to carol because "
			    + "the book is already checked out to " + book[0].getCheckedOut());
		}
		/*          Checks a book in                    */ 
		book[0].checkIn();
		System.out.println("Book 1 is checked in");
		
		/*          Prints book info about books        */ 
		System.out.println("Book 1:\n" + book[0].toString());
		System.out.println("Book 2:\n" + book[1].toString());
		
		/*checks equals method */
		System.out.println("Book 2 and 3 are the same? --> " + book[1].equals(book[2]));  
		
	}
}
