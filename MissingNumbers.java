// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
       missingNumber();
    }
    
  public static void missingNumber(){
        int arr[] = {1,2,3,4,6,7,8,9,10};
          System.out.println("Input Array ---- "+Arrays.toString(arr));
          int n = arr.length+1;
          int total = n*(n+1)/2;
          for(int i=0;i<arr.length;i++){
              total = total - arr[i];
              
          }
       
        System.out.println("Missing Number in Array ---- "+total);
            
    }
}
