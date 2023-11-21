package supriya;
import java.util.Scanner;
public class Scanner2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
System.out.println(" enter leaper");
int b=sc.nextInt();
if((b%400==0)||(b%4==0)&(b%100!=0))
{
	System.out.println("leaper");
}
else {
	System.out.println("not leaper");
}
	}

}
