package additonalHandson;
import java.util.*;

public class DirectSwap {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a,b,t;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping a and b :"+a+" "+b);
		a = a + b; 
        b = a - b;
        a = a - b;
		System.out.println("After Swapping a and b :"+a+" "+b);
		sc.close();
	}
}
