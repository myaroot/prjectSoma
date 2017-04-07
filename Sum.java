
public class Sum {

	static int[] numbers = {23,56,78,45,69,45,100};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//call the sum function
		int sum = sumTotal( numbers);
		
		System.out.println("Sum is:"+sum);
		
	}
public static int sumTotal( int [] list){
	
	int total = 0;
	
	if (list.length > 0){
		
		for (int i =0; i < list.length; i++){
			
			total += list[i];
		}
	}
	else if ( list.length == 1){
		
		total = sumTotal (list);
	}
	else 
		System.out.println("Error");
	
	 return total;
	}
}
