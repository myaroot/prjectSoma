public class AlternatingElements {

	static String[] alphabates = { "a", "b", "c" };
	static String[] numbers = {"1", "2" , "3"};
	static final int SIZE = alphabates.length + numbers.length;
	static String[] alternating = new String[SIZE];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		alternate ();
			
		
	}
	public static String alternate(){
		if ( alphabates.length == numbers.length){
			
		
			
		for ( int i = 0; i <alphabates.length; i++){
			
			alternating[i+i] = alphabates[i];
		 
		}
		}
		for (int x = 1; x <= 5; x++){
			
			if ( x % 2 != 0){
				
					alternating[x] = numbers[((x+1)/2)-1];
				}
			
		}
		
		
		for ( int i = 0; i <alternating.length; i++){
			
			System.out.println(alternating[i]);
	}
		return "";
		
	 
	}
}
