import java.util.Scanner;
public class PeakIndexSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,5,7,8,9,10,9,8,7,6,5,4,3,2,1};
        int target = 6;
        int end= peak(arr);
        int index=search(arr, target, end);
        System.out.println("INDEX IS :"+ index);
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
    static int search(int arr[],int n,int midd)
    {
        int l=midd;
        int s=0;
        int m;
        int q=-1;
        while(l>=s)
        {
            m=(l+s)/2;
            if(arr[m]==n)
            {
                q= m;
                break;
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
        if (q==-1)
        {
            s=midd+1;
            l=arr.length;
            while(l>=s)
            {
                m=(l+s)/2;
                if(arr[m]==n)
                {
                    q= m;
                    break;
                }
                else if(arr[m]>n)
                {
                    s=m+1;
                }
                else
                {
                    l=m-1;
                }
            }
        }
        return q; 
    }
}
