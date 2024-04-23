// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        reverseString("Supriya Gupta");
    }
    
     static void reverseString(String input) {  
   
        char[] inputArray = input.toCharArray();  
        char[] result = new char[inputArray.length];  
   
        for (int i = 0; i < inputArray.length; i++) {  
            if (inputArray[i] == ' ') {  
                result[i] = ' ';  
            }  
        }  
   
        int j = result.length - 1;  
   
        for (int i = 0; i < inputArray.length; i++) {  
            if (inputArray[i] != ' ') {  
                if (result[j] == ' ') {  
                    j--;  
                }  
                result[j] = inputArray[i];  
                j--;  
            }  
        }  
        System.out.println(input + " --> " + String.valueOf(result));  
    }  
   
}
