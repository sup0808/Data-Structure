
import java.util.HashMap;
import java.util.Set;

class HelloWorld {
    public static void main(String[] args) {
        printOccurenceOfChar("supriya Gupta shreeja is supriya arvind  shreeja gupta shrestg shreeja ");
    }
    
    public static void printOccurenceOfChar(String paragraph){
       char[] charArray =  paragraph.toCharArray();
       
       HashMap<Character, Integer> charMap = new HashMap<Character,Integer>();
       
       for(char word : charArray){
           if(charMap.containsKey(word)){
             charMap.put(word,charMap.get(word) +1);
           }
           else{
             charMap.put(word,1);    
           }
       }
       
       //print duplicate
       Set<Character> charSet = charMap.keySet();
       
       for(Character word : charSet){
           if(charMap.get(word)>1){
               System.out.println(word + "-"+charMap.get(word));
           }
       }
    }
}
