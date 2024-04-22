
class HelloWorld {
    public static void main(String[] args) {
   int n = 10;
    for (int i = 0; i < n; i++) {
      	    System.out.print(fibanoccai(i) + " ");
    	}
	 }
    
   public static int fibanoccai(int n){
     if(n<=1){
         return n;
     }
     else{
         return fibanoccai(n-1) + fibanoccai(n-2);
     }
   }
}
