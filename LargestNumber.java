
public class LargestNumber {
	
	static int [] numbers ={50,2,1,9};
	
	static int largest;
	static int highest;
	static int max;
	static int largestNum;
	static int lowest;
	static int low;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		myLargest();
	}

	
	public  static String myLargest(){
		
		max = 9;
		lowest = 0;
		//to get highest number through 0-9
		for (int i=0; i <numbers.length -1; i++){
			if (numbers[i]==max){
				
				highest = max;
				largest = highest;
				
			}
			System.out.println(largest);
			if ( numbers[i] < max){
				
			for (int a = 0; a < numbers.length - 1; a++){	
				for (int x = 0; x <=8; x++){
					
					if (numbers[a] > x){
						
						highest = numbers[a];
						
					}
					else if (numbers[a] < x){
						
						max = x;
					}
					
				}
			}
				largest = highest;
			}
			System.out.println(largest);
		if (numbers[i] > max){
				
				max = numbers[i];
				largestNum = max;
			}
		System.out.println(largestNum);
		}
		
		System.out.println(largest);
		
		return " ";
	} 
}
