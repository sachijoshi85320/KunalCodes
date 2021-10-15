import java.util.*;
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int n = sc.nextInt();
        int arr[]= Elementss(n);
        Pythagorean(arr);
    }
    static int[] Elementss(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements of the array");
        int arrr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arrr[i]= sc.nextInt();
        }
        return arrr ; 
    }
    static void Pythagorean(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++ )
                {
                    int m= arr[k]*arr[k];
                    int l=arr[j]*arr[j];
                    int o= arr[i]*arr[i];
                    if(m== l+o || l== m+o || o== m+l )
                    {
                        System.out.println( "Pythagorean triplet is : "+ i+ " "+ j+" "+ k);
                    }
                }
            }
        }
    }
}
