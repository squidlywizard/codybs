package codybs.control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppName
{
	public void start()
	{

		moreInput(); //use this at the end to indicate the starting of the next bit of code eg moreInput
		questions();
		
		
		//String Fug = ("Fug");
		//System.out.println(Fug); //Fug
		//System.out.println(Fug);//Fug
		//System.out.print(Fug);//Fug Fug
		//System.out.print(Fug);
		
		
		
	}
	
	private void questions()
	{
		
		String fug2 = ("");
		System.out.print("whats your favorite color ");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.print("whats the meaning of life the universe and everything ");
	    String fug = inputScanner.next();
	    System.out.println(fug);
	    
	    System.out.print("fug? ");
	    String dog = inputScanner.next();
	    System.out.println(dog);
	    
	    switch (fug) {
	    	case "fortytwo":
	    		fug2 = ("you are pretty cool");
	    System.out.println(fug2);
	    	 inputScanner.close();
	    }
	    
	
	   
	    }
	
	public void moreInput() 
	{
		boolean ifTheUserIsSilly = true;
		int banswer = 0 ;
		Scanner moreInputScanner = new Scanner(System.in);
		
		System.out.println("What is the meaning of life the universe and everything");
	
		try {
			banswer = moreInputScanner.nextInt();
			 ifTheUserIsSilly = false;
		} catch (InputMismatchException e) {
			System.out.println("you are silly put in a number");
		}
	
		System.out.println("You typed: " + banswer);
				
		
		moreInputScanner.nextLine(); // used to clear the buffer and prevent the no such element exception https://docs.oracle.com/javase/7/docs/api/java/util/NoSuchElementException.html
		
		//double holds real numbers with a decimal point eg 1.4
		double magicNumber;
		
		System.out.println("type in a number wit a decimal point and stuff behind it");
		magicNumber = moreInputScanner.nextDouble();
		
		System.out.println(magicNumber);
		
		}	
	  public boolean validDouble(String example){
	  {
		  boolean ifTheUserIsSilly = false;
		  return ifTheUserIsSilly;
		  
	  }
    }
}
	
		


