class HelloWorld {
    public static void main(String[] args) {
       findOccurenceOfVowelsConstants("supriya gupta") ;
        
     }
    
  public static void findOccurenceOfVowelsConstants(String str){
      int vowels =0;
      int consonants =0;
      for(int i=0; i<str.length()-1; i++){
          char c= str.charAt(i);
          if(c=='a' || c == 'i' || c=='e' || c == 'o' || c == 
         'u'){
            vowels ++; 
         }
         else{
             consonants++;
         }
         }
     
        System.out.println("vowels :: "+vowels)  ;
        System.out.println("consonants :: "+consonants)  ;
  }
}
