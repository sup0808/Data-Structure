import java.util.HashMap;
import java.util.Set;

class HelloWorld {
    public static void main(String[] args) {
        removeDuplicateWords("supriya Gupta shreeja is supriya arvind  shreeja gupta shrestg shreeja ");
    }
    
    public static void removeDuplicateWords(String paragraph){
       String[] wordArray =  paragraph.split(" ");
       
       HashMap<String, Integer> wordMap = new HashMap<String,Integer>();
       
       for(String word : wordArray){
             wordMap.put(word.toLowerCase(),1);    
       }
       
       //print duplicate
       Set<String> wordSet = wordMap.keySet();
       
       for(String word : wordSet){
           System.out.print(word + " ");
        }
    }
}
