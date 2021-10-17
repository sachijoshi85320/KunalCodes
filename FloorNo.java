//floor of a number is the biggest no. smaller than equal to target number.
import java.util.*;
public class FloorNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=number();
        System.out.print("Enter the target Number");
        int n= sc.nextInt();
        System.out.println("we found the no at " +search(arr,n));
    }
    static int[] number()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of an array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static int search(int arr[],int n)
    {
        int l=arr.length-1;
        int s=0;
        int m;
        while(l>=s)
        {
            m=(l+s)/2;
            if(arr[m]==n)
            {
                return m;
            }
            else if(arr[m]>n)
            {
                l=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return arr[l];
    } 
}
