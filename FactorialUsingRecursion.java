class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
      factorial(4);
       System.out.println("Facyorial of Number is "+ factorial(4));
        
    }
    
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return (n*factorial(n-1));
        }
    }
}
