

import java.lang.Math;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
       int arr[] = {1,4,6,7,8,9,10,23};
       int key = 10;
       int value = binarySearch(arr, 0, arr.length, key);
       
        System.out.println("value find using binary search = "+value);
       
    }
    
  public static int binarySearch(int arr[], int low, int high, int key){
      int mid = (low + high)/2;
      while(low <= high){
         if(arr[mid] < key){
             low = mid+1;
         } else if(arr[mid] > key){
             high = mid-1;
         }
         else {
             return mid;
         }
         mid = (low+high)/2;
      }
      if(low>high){
          return -1;
      }
      return -1;
  }
}
