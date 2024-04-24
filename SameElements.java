// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class HelloWorld {
    public static void main(String[] args) {
       Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		System.out.println(isSameElements(a1, a2));
		System.out.println(isSameElements(a1, a3));
    }
    
  public static boolean isSameElements(Integer[] array1, Integer[] array2){
        Set<Integer> unique1 = new HashSet<Integer>(Arrays.asList(array1));
        Set<Integer> unique2 =new HashSet<Integer>(Arrays.asList(array2));
        
        if(unique1.size() != unique2.size()){
            return false;
        }
        for(Integer element : unique1){
            if(!unique2.contains(element))
            return false;
        }
        return true;
            
    }
}
