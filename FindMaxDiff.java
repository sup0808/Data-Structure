// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {2,3,10,6,4,8};
        findMaxDiff(arr);
    }
    
    public static void findMaxDiff(int arr[]){
        
        int minValue = arr[0];
        int maxDiff = arr[1] - arr[0];
        
        for(int value : arr){
            if(value < minValue){
                minValue = value;
            } else{
                int diff = value - minValue;
                if(diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }
        System.out.println(" Maximum difference == "+maxDiff);
    }
}
