//to find the first and last position of element in an array.
import java.util.*;
public class FirstLast
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=insertion();
        System.out.print("Enter the element whose position is to be determined: ");
        int n=sc.nextInt();
        System.out.println("The first and last position of the element is : "+ find(arr,n));
    }
    static int[] insertion()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static String find(int arr[],int n)
    {
        int a[]={-1,-1};
        int s=0;
        int l=arr.length-1;
        int m;
        while(l>=s)
        {
            m=(l+s)/2;
            if(arr[m]==n)
            {
                a[0]=m;
                l=m-1;
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
        s=0;
        l=arr.length;
        while(l>=s)
        {
            m=(l+s)/2;
            if(arr[m]==n)
            {
                a[1]=m;
                s=m+1;
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
        return Arrays.toString(a);
    }
}