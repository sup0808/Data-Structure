// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Input :: jsp");
        
        permutationOfString(" ","jsp");
    }
    
     static void permutationOfString(String permutation,String input) {  
         if(input.length() == 0){
            System.out.println(permutation + " "); 
         }else{
            for(int i =0 ;i<input.length();i++){
                 // ith character of str
            char ch = input.charAt(i);
 
            // Rest of the string after excluding
            // the ith character
            String ros = input.substring(0, i) +
                        input.substring(i + 1);
 
            // Recursive call
            permutationOfString(permutation + ch, ros);
                  
            } 
         }
    }  
 }
