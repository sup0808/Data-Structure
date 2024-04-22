class HelloWorld {
    public static void main(String[] args) {
       swap();
    }
    
    public static void swapUsingVariable(){
        int a=20,b=30;
       int temp;
       temp =a;
       a=b;
       b= temp;
         System.out.println("Numbers after swap a is  " + a );
          System.out.println("Numbers after swap b is  " + b );
    }
}
