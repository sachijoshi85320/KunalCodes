import java.util.*;
class assign {
    public static List<Long> addToArrayForm(int[] num, int k) {
        long m=0,count=0;
        for(int i = 0; i < num.length ; i++)
        {
            m=m*10+num[i];
        }
        m=m+k;
        ArrayList<Long> list=new ArrayList<>();
        while(m>0)
        {
            list.add(m%10);
            m=m/10;
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int arr[]={9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(arr, 1));
    }
}