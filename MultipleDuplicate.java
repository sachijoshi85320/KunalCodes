import java.util.*;
public class MultipleDuplicate{
    public static void main(String[] args) {
        int arr[]=insertion();
        List<Integer> ans= missing(arr);
        System.out.println(ans);
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
    static  List<Integer> missing(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
                System.out.println("+++++++++");
            }
            else{
                
                i++;
            }
        }
        List<Integer> ans=new ArrayList <>();
        for( i=0;i<arr.length;i++){
            if(arr[i]!=i+1)
            {
                ans.add(arr[i]);
            }
        }
        return ans;
        // for(i=0;i<arr.length;i++)
        // {
        //     if(i!=arr[i])
        //     {
        //         for(int j=i;j<arr[i];j++)
        //         System.out.println(j +"\t");
        //         break;
        //     }
        // }
        
    }
    static void swap(int [] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

