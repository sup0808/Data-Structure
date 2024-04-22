import java.util.HashMap;
import java.util.Set;

class HelloWorld {
    public static void main(String[] args) {
        CountWords("supriya Gupta shreeja is supriya arvind  shreeja gupta shrestg shreeja");
    }
    
    public static void CountWords(String paragraph){
       String[] wordArray =  paragraph.split(" ");

        //Approach 1
       int wordCount= 0;
      for(String word : wordArray){
            wordCount++;   
       }
       //Approach 2
       int count =1;
       for(int i=0;i<paragraph.length()-1; i++){
             if(paragraph.charAt(i) == ' ' && paragraph.charAt(i+1)!= ' ' ){
               count++;
           }
           
       }
       System.out.println("Words in String = "+ (wordCount-1));
              System.out.println("Words in String = "+ (count));
       
    }
}
