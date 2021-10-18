//Find position of an element in a sorted array of infinite numbers
import java.util.Scanner;
public class InfinitePosition {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int [] arr={3,5,7,9,10,90,100,130,140,160,170};
    int target=10;
    System.out.println(ans(arr,target));
  }  
  static int ans(int arr[], int target)
  {
      int start =0;
      int end=1;
      //condition foe the target to lie in the range
      while(target>arr[end])
      {
          int newStart=end+1;
          end=end+(end-start+1)*2;
          start= newStart;
      }
      return binarySearch(arr, target, start,end);
  }
  static int binarySearch(int [] arr, int target, int start, int end)
  {
      int mid=(start+end)/2;
      while(start<=end)
      {
        if(arr[start]==target)
      {
        return mid;
      }
      else if(arr[mid]>target)
      {
        end=mid-1;
      }
      else
      {
        start=mid+1;
      }
      }
      return -1;
  }
}
