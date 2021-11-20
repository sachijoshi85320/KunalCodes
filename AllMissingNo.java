import java.util.*;
public class AllMissingNo {
    public static void main(String[] args) {
      int arr[]=insertion();
      System.out.println("The array of numbers entered is : "+ Arrays.toString(arr));
      System.out.println("The missing number is:"+ missing(arr));  
    }
    static int[] insertion()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of elements to be inserted in the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    return arr;
    }
    static int missing(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(i!=arr[i])
            {
                for(int j=i;j<arr[i];j++)
                System.out.println(j +"\t");
                break;
            }
        }
        return arr.length;
    }
    static void swap(int [] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
