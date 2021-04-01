package additonalHandson;

public class Sum {
    public static void main(String args[])
    {
        int num=12345;
        int sum=0;
        for(int i=0;i<5;i++)
        {
            if(i==1 || i==4)
            {
                int p=num%10;
                sum=sum+p;
            }
            num=num/10;
        }
        System.out.println(sum);
    }
}
