// Online Java Compiler
// Use this editor to write, compile and run your Java code online

java -cp /tmp/LjO7tCKPzx/HelloWorld
Input Array -----[1, 2, 3, 2, 1, 7, 56, 8, 76]
Shuffled array ------ [76, 56, 1, 7, 1, 8, 3, 2, 2]

	
import java.util.Random;
import java.util.Arrays;


class HelloWorld {
    public static void main(String[] args) {
      int[] input = {1,2,3,2,1,7,56,8,76};
	
	System.out.println("Input Array -----"+Arrays.toString(input));
	shuffleArray(input);
    }
    
  public static void shuffleArray(int[] array){
      Random random = new Random();
      for(int i =0;i< array.length; i++){
        int randomIndex = random.nextInt(array.length);
        int temp = array[randomIndex];
        array[randomIndex] = array[i];
        array[i] = temp;
      
      }
     System.out.println("Shuffled array ------ "+ Arrays.toString(array));
    }
}
