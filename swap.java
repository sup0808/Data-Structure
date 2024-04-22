class HelloWorld {
    public static void main(String[] args) {
       swap();
    }
    
    public static void swap(){
        int a=20,b=30;
        a = a+b;
        b = a-b;
        a = a-b;
         System.out.println("Numbers after swap a is  " + a );
          System.out.println("Numbers after swap b is  " + b );
    }
}
