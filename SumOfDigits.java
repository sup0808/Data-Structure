class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        sumOfDigits(342);
    }
    
    public static void sumOfDigits(int n){
        int sum =0;
         while(n>0){
            sum = sum + n%10;
            n = n/10;
         }
        System.out.println("Sum of Digits "+sum);
    }
}
