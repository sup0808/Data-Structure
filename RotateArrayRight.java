
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;
import java.util.Arrays;


class HelloWorld {
    public static void main(String[] args) {
      int[] input = {1,89,3,8,1,7,56,9,76};
	
	System.out.println("Input Array -----"+Arrays.toString(input));
	rotateArrayRight(input,2);
    }
    
    public static void reverseArray(int[] arr, int  start, int end){
        int temp =0 ;
        
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    
  public static void rotateArrayRight(int[] array, int d){
    reverseArray(array, 0, array.length-1);
    reverseArray(array, 0, d-1);
    reverseArray(array, d, array.length-1);
    
    System.out.println("Output Array---- "+ Arrays.toString(array));
    }
}
