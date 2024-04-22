class HelloWorld {
    public static void main(String[] args) {
    reverseString("supriya gupta");
}
    
  public static void reverseString(String str){
      String reverse = "";
      for(int i=0;i<str.length();i++){
          reverse = str.charAt(i)+reverse;
      }
      System.out.print("Reverse String :: "+reverse);
  }
  
  
    public static String reverse(String str){
     if(str == null || str.length() == 1){
         return str;
     }
     else {
        return str.charAt(str.length()-1)+ reverse(str.substring(0,str.length()-1));
     }
	
  }
  
   public static void reverseString(String str){
      char[] charArray = str.toCharArray();
      for(int i=charArray.length-1;i>=0;i--){
          System.out.print(""+charArray[i]);
      }
      
  }
}


