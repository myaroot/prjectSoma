import java.util.Scanner; 


public class FirstFactorial {  
  public static String Firstfactorial(int num) { 
	  int factorial = num;
      int myFactorial = 1;
  
      int next = num;
      
  for ( int  i = num -1; i >=1; i--){
     
      myFactorial *= (next - 1);
      next--;
      
      
  }
    
      System.out.println("Factorial of	" + num + "	is:"+ (myFactorial * factorial)); 
       
    return "Done...";
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(Firstfactorial(s.nextInt())); 
    s.close();
  }   
  
}








  