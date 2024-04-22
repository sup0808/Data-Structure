
import java.util.HashMap;
import java.util.Set;
import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        isAnagaram();
        isRotation();
    }
    
   public static  void isAnagaram(){
       String s1 = "javaj2eestrutshibernate";
       String s2 = "strutshibernatejavaj2ee";
       
       if(s1.length() != s2.length()){
           System.out.println("---s1 and s2 are not anagram---");
          
       } else {
       String s3 = s1 + s1;
        if(s3.contains(s2)){
           System.out.println("s1 and s2 are anagram"); 
        }
         else{
            System.out.println("s1 and s2 are not anagram"); 
        }
       }
     }
     
      public static  void isRotation(){
       String s1 = "javaj2eestrutshibernate";
       String s2 = "strutshibernatejavaj2ee";
       
       if(s1.length() != s2.length()){
           System.out.println("isRotation  ---s1 and s2 are not anagram---");
          
       } else {
       char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
         Arrays.sort(str2);
        if(Arrays.equals(str1,str2)){
           System.out.println("isRotation---s1 and s2 are anagram"); 
        }
         else{
            System.out.println(" isRotation---s1 and s2 are not anagram"); 
        }
       }
     }
}
