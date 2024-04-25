// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;
import java.util.Arrays;


class HelloWorld {
    public static void main(String[] args) {
      int[] input = {1,2,3,2,1,7,56,8,76};
	
	System.out.println("Input Array -----"+Arrays.toString(input));
	rotateArrayByLeft(input,2);
    }
    
  public static void rotateArrayByLeft(int[] array, int d){
    
     for(int i =0;i< d; i++){
      int j = 0;
      int temp = array[0];
       for(j =0; j< array.length-1; j++){
           array[j] = array[j+1];
       }
        array[j] = temp;
      }
     System.out.println("Output Array---- "+ Arrays.toString(array));
    }
}
