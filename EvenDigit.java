import java.util.*;
public class EvenDigit {
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        arr=intii(a,b);
        System.out.println("The total number of digits which have even number of digits are: "+target(arr));
    }
    static int[][] intii(int a, int b)
    {
        int ar[][]=new int[a][b];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        return ar;
    }
    static int target(int arr[][])
    {
        int d=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                d=count(arr[i][j]);
            }
        }
        return d;
    }
    static int count(int n)
    {
        int p=0;
        while(n>0)
        {
            p=p+1;
            n=n/10;
        }
        if(p%2==0)
        {
            sum++;
        }
        return sum;
    }
}
