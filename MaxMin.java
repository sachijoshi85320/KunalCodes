import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        Maxx(a,b,c);
        Minn(a,b,c);
    }
    static void Maxx(int a, int b, int c)
    {
        int m= a>b && a>c ? a: b>a && b>c ? b: c>a && c>b? c: -81111;
        System.out.println("the Max no. is: "+m);
    }
    static void Minn(int a, int b, int c)
    {
        int m= a<b && a<c ? a: b<a && b<c ? b: c<a && c<b? c: -81111;
        System.out.println("the Min no. is: "+m);
    }
}
