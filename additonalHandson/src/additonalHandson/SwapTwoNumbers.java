package additonalHandson;

public class SwapTwoNumbers {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a,b,t;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Swapping a and b :"+a+" "+b);
        t=a;
        a=b;
        b=t;
        System.out.println("After Swapping a and b :"+a+" "+b);
	}
}
