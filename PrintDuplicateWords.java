import java.util.HashMap;
import java.util.Set;

class HelloWorld {
    public static void main(String[] args) {
        printDuplicateWords("supriya Gupta shreeja is supriya arvind  shreeja gupta shrestg shreeja ");
    }
    
    public static void printDuplicateWords(String paragraph){
       String[] wordArray =  paragraph.split(" ");
       
       HashMap<String, Integer> wordMap = new HashMap<String,Integer>();
       
       for(String word : wordArray){
           if(wordMap.containsKey(word)){
             wordMap.put(word.toLowerCase(),wordMap.get(word) +1);
           }
           else{
             wordMap.put(word.toLowerCase(),1);    
           }
       }
       
       //print duplicate
       Set<String> wordSet = wordMap.keySet();
       
       for(String word : wordSet){
           if(wordMap.get(word)>1){
               System.out.println(word + "-"+wordMap.get(word));
           }
       }
    }
}
