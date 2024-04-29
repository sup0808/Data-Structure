

import java.lang.Math;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
       int arr[] = {1,4,6,7,8,9,10,23};
       int key = 23;
       int value = linearSearch(arr, 0, arr.length, key);
       
        System.out.println("value find using linear search = "+value);
       
    }
    
  public static int linearSearch(int arr[], int low, int high, int key){
      
      for(int i =0; i< arr.length; i++){
          if(arr[i] == key){
              return i;
          }
      }
     
      return -1;
  }
}
