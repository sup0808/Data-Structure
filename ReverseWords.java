// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        reverseWords("Supriya Gupta");
    }
    
     static void reverseWords(String input) {  
         String[] words = input.split(" ");
        
         for(int i = 0;i< words.length; i++ ){
              String reverseWords = "";
              String eachWord = words[i];
              
              for(int j = eachWord.length()-1;j>=0; j--){
                  reverseWords = reverseWords + eachWord.charAt(j);
              }
              System.out.print(reverseWords+" ");
         }
    }  
 }
