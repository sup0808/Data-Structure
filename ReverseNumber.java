package com.demo.datastructureprogram;

class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        reverseNumber(342);
    }

    public static void reverseNumber(int n){
        int rev =0;
        while(n>0){
            rev =  rev*10;
            rev = rev + n%10;
            n = n/10;

        }
        System.out.println("Reverse Number "+rev);
    }
}
