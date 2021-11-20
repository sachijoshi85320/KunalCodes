//to find the first occuring duplicate element int [1.n]
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        int arr[]=insertion();
        int index=missing(arr);
        System.out.println(index);
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
        int prev=0;
        int pre=0;
        while(i<arr.length)
        {
            int correct=arr[i];
            if( arr[i]!=i)
            {
                Systm.out.println("****************");
                swap(arr,i,correct);
                pre=arr[i];
                if(prev==pre)
                return prev;
            }
            else{
                prev=arr[i];
                i++;
            }
        }
        // for(i=0;i<arr.length;i++)
        // {
        //     if(i!=arr[i])
        //     {
        //         for(int j=i;j<arr[i];j++)
        //         System.out.println(j +"\t");
        //         break;
        //     }
        // }
        return arr.length;
    }
    static void swap(int [] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
