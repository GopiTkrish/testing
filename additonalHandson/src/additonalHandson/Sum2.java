package additonalHandson;

public class Sum2 {
    public static void main(String args[])
    {
        int n=123;
        int sum=0;
        for(int i=0;i<3;i++)
        {
            int p=n%10;
            sum=sum+p;
            n=n/10;
        }
        System.out.println(sum);
    }
}
