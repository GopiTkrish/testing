package additonalHandson;

public class Sum1 {
    public static void main(String args[])
    {
        int num=1234;
        int sum=0;
        int temp=num;
        for(int i=3;i>=0;i--)
        {
            int p=(temp/(10^i))-(sum*10);
            p=p+2;
            sum=(sum*10)+p;
        }
        System.out.println(sum);
    }
}
