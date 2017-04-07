
public class Insert {

	static String numbers = "123456789";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayNumbers();
	}

	public static void displayNumbers(){
		
		for (int next =0; next < numbers.length(); next++){
			
			System.out.print(numbers.charAt(next));
		}
		
	}
}
