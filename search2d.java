import java.util.*;
public class search2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=inputElements();
        // for (int[] i : arr) {
        //     System.out.println(Arrays.toString(i));   
        // }
        System.out.print("Enter the Element to be searched: ");
        int n=sc.nextInt();
        System.out.println(Arrays.toString(search(arr,n)));

    }
    static int [][] inputElements()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimentions of the array: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the elements in the 2d array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    static int[] search(int arr[][], int n)
    {
        int r=0;
        int c=arr.length-1;
        while(r< arr.length && c>=0)
        {
            if(arr[r][c]==n)
            {
                return new int []{r,c};
            }
            else if(arr[r][c]<n)
            {
                r++;
            }
            else if(arr[r][c]>n)
            {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
