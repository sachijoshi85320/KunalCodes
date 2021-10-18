//Peak Index in a mountain array 
//Mountain Array are also called bitonic arrays wherein the array elements value first increase and then decrease.
// eg:- [1,2,3,5,7,6,3,2]
import java.util.*;
public class PeakIndex {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int arr[]={1,2,3,5,7,8,9,10,9,8,7,6,5,4,3,2,1};
       System.out.println(peak(arr));         
   } 
   static int peak(int arr[])
   {
       int start=0;
       int end=arr.length-1;
       int mid=-1;
      while(start<end)
      {
          mid=(start+end)/2;
          if(arr[mid]>arr[mid+1])
          {
              end=mid;
          }
          else if(arr[mid]<arr[mid+1])
          {
              start=mid+1;
          }
      }
       return arr[start];
   }
}
