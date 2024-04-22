class HelloWorld {
    public static void main(String[] args) {
        System.out.println(palindrome("supriya gupta"))  ;
         System.out.println(palindrome("madam"))  ;
     }
    
  public static boolean palindrome(String str){
     
      int i=0;
       int j=str.length()-1;
       while(i<j){
           if(str.charAt(i)!=str.charAt(j)){
              return false;
           } 
           i++;
            j--;
       }
       return true;
  }
}
