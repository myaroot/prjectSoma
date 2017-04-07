import java.util.Scanner;
public class FirstReverse {

	public static void main(String args[]){
	
	Scanner readInput = new Scanner(System.in);
		
		System.out.println("Enter String to be reversed:");
		
			reverseFirst(readInput.nextLine());
				
			readInput.close();	
	}
	
	public static String reverseFirst( String str){
		String reversed = "";
		for ( int i = str.length()- 1; i >= 0 ; i--){
			
			reversed += str.charAt(i);			
	}
		System.out.println("Reversed String:"+ reversed);
		
		return reversed;	
		
	}
	
	
}
