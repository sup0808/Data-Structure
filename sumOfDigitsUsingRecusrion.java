class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
       int sum = sumOfDigitsUsingRecusrion(342);
         System.out.println("Sum of Digits :: "+sum);
    }
    
    public static int sumOfDigitsUsingRecusrion(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n%10 + sumOfDigitsUsingRecusrion(n/10) );
        }
    }
}
