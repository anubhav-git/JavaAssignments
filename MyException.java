import java.util.Scanner;

class CustomException extends Exception 
{ 
	public CustomException(String s) 
	{ 
		super(s); 
	} 
} 

public class MyException
{ 
	public static void main(String args[]) 
	{ 
		MyException my = new MyException();
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = obj.nextLine();
		
		try
		{ 
			if(str.length()>10)
			throw new CustomException("EXCEPTION: Length of string should be less than 10 characters"); 
		
			System.out.println(str);
		} 
		catch (CustomException ex) 
		{ 		
			System.out.println(ex.getMessage()); 
		} 
	} 
} 
