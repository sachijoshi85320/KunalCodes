//Smallest target greater than target
import java.util.*;
public class GreaterChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch[]=insertion();
        //System.out.println(Arrays.toString(ch));
        System.out.println("Enter the target character");
        char c=sc.next().charAt(0);
        char m=search(ch,c);
        System.out.println("The answer is :"+m);
    }
    static char[] insertion()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of character array");
        char ch[]=new char[sc.nextInt()];
        System.out.println("Enter the elements of the character array");
        for(int i=0;i<ch.length;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        return ch;
    }
    static char search(char ch[], char c)
    {
        int l=ch.length-1;
        int s=0;
        int m;
        while(l>=s)
        {
            m=(l+s)/2;
            if(ch[m]==c)
            {
                return ch[m];
            }
            else if(ch[m]>c)
            {
                l=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return ch[s];
    }
}
