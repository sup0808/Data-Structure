// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;
import java.util.Arrays;


class HelloWorld {
    public static void main(String[] args) {
      int[] input = {1,89,3,8,1,7,56,9,76};
	
	    System.out.println("Input Array -----"+Arrays.toString(input));
	    reverseArray(input);
    }
    
    public static void reverseArray(int[] arr){
        int temp =0 ;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Output Array -----"+Arrays.toString(arr));
    }
    

}
