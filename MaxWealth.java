import java.util.*;
class MaxWealth
{
    static int m=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=creation();
        iterate(arr);
        System.out.println("The max wealth is of :"+ iterate(arr));
    }
    static int[][] creation()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter the size of the array"));
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    static int iterate(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
           int m=count(i,arr);
        }
        return m;
    }
    static int count(int n,int arr[][])
    {
        int sum=0;
        for(int j=0;j<arr[n].length;j++)
        {
            sum=sum+arr[n][j];
        }
        return findMax(sum);
    }
    static int findMax(int sum)
    {
        if(sum>m)
        m=sum;
        return m;
    }
}