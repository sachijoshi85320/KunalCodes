import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        int arr[]=cyclicSort();
        System.out.println(Arrays.toString(arr));
    }
    static int[] cyclicSort()
    {
        int arr[]=insertion();
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        return arr;
    }
    static void swap(int [] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
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
}
