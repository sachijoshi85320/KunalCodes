import java.util.*;
public class SetMismatch {
    public static void main(String[] args) {
        int arr[]=insertion();
        int correct[]=new int[2];
        correct[1]=missing(arr); 
        correct[0]=correct[1]-1;
        System.out.println(Arrays.toString(correct));
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
    static  int missing(int arr[])
    {
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
        for( i=0;i<arr.length;i++){
            if(arr[i]!=i+1)
            {
                return i-1;
            }
        }
        return 0;
    }
    static void swap(int [] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
