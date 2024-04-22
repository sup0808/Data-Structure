class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
      factorial(4);
        
    }
    
    public static void factorial(int n){
        int fact =1;
       for(int i=1;i<=n;i++){
           fact = fact*i;
       }
        System.out.println("factorial of n is  :: "+fact);
    }
}
