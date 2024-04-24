// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
       sortArrayInSingleLoop();
    }
    
  public static void sortArrayInSingleLoop(){
        int arr[] = {1,0,0,2,0,3,0,5,0};
          System.out.println("Input Array ---- "+Arrays.toString(arr));
        for(int i=0,j=i+1 ; i<arr.length && j<arr.length;){
           int temp =0;
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i=0;
                j = i+1;
            }
            else{
                i++;
                j++;
            }
        }
        System.out.println("Sorted Array ---- "+Arrays.toString(arr));
            
    }
}
