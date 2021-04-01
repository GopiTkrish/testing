package additonalHandson;

public class MathPower {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        double c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=Math.pow(a,b);
        System.out.println(c);
    }
}
