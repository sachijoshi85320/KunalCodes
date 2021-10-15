import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        Checki(n);
    }
    static void Checki(int n)
    {
        if(n%2==0)
        {
            System.out.println("YES it is divisible");
        }
    }
}
