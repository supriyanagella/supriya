package supriya;
import java.util.Scanner;
public class Palindrome1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter string:");
String a=sc.next();
String rev="";
int len=a.length();
for(int b=len-1;b>=0;b--) 
{
	rev=rev+a.charAt(b);
}
System.out.println(rev);
if(a.equals(rev));
{
	System.out.println("palindrome");
}
else {
	System.out.println("not palindrome");
}
  }
	}

