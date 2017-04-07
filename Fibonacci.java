
public class Fibonacci {

	static int[] numbers = new int [100];
	static int n;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numbers[0]= 0;
		numbers[1]= 1;
		n = numbers[0]+numbers[1];
		numbers[2] = n ;
		
		compute();
	}

	public static String compute(){
		
		for (int i = 2; i < numbers.length -1 ; i++){
			
			n = n + numbers[i - 1];
			
			numbers[i+1] = n ; 
			
			
		}
		for (int x = 0 ; x < numbers.length -1; x++){
			
			System.out.println(numbers[x]);
			
		}
	
	return  " ";
	}
	}
