package additonalHandson;
import java.util.*;
public class ConsoleCheck {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
	    if(a<50 || a<b)
	    {
	        System.out.println("True");
	    }
	    else
	    {
	       System.out.println("False");
	    }
	}
}
