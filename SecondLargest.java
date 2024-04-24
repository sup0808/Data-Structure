// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class HelloWorld {
    public static void main(String[] args) {
      int[] input = {1,2,3,2,1,7,56,8,76};
	
	System.out.println("Input -----"+Arrays.toString(input));
	secondLargest(input);
    }
    
  public static void secondLargest(int[] array){
      int highest = Integer.MIN_VALUE;
      int secondHighest = Integer.MIN_VALUE;
      
      for(int i : array){
         if(i>highest){
             secondHighest = highest;
             highest = i;
         } else if(i>secondHighest){
             secondHighest = i;
         }
      }
     System.out.println("Second Largest number in array---- "+ secondHighest);
    }
}
