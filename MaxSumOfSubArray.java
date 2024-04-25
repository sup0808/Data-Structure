// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;
import java.util.Arrays;


class HelloWorld {
    public static void main(String[] args) {
      int[] input = {-2,-3,4,-1,2,1,-5,3};
	
	    System.out.println("Input Array -----"+Arrays.toString(input));
	    MaxSumOfSubArray(input);
    }
    
    public static void MaxSumOfSubArray(int[] arr){
        int far = 0; //max_sum
        int end =0;//curremt_sum
        for(int i = 0;i< arr.length;i++){
            end = end + arr[i];
                if(far< end){
                    far = end;
                }
                if(end<0){
                    end = 0;
                }
            }
            
        
        System.out.println("Maximum sum of subArray is  -----  "+far);
         
    }
    

}
