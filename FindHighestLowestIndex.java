// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;
import java.util.Arrays;


class HelloWorld {
    public static void main(String[] args) {
      int[] input = {1,89,3,8,1,7,56,9,76};
	
	    System.out.println("Input Array -----"+Arrays.toString(input));
	    findHighestLowestIndex(input,17);
    }
    
    public static void findHighestLowestIndex(int[] arr, int n){
        int lowIndex = arr.length-1;
        int highIndex =0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]  == n){
                if(i< lowIndex){
                    lowIndex = i;
                }
                if(i> highIndex){
                    highIndex = i;
                }
            }
            
        }
       
        
        System.out.println("Low Index of given Number -----  "+lowIndex);
         System.out.println("High Index of given Number -----  "+highIndex);
    }
    

}
