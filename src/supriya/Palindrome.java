package supriya;

public class Palindrome {

	public static void main(String[] args) {
	Scanner supriya=new Scanner();
System.out.println("enter string:");
String n=supriya.next();
String rev=" ";
int len=n.length();
for(int z=len-1;z>=0;z--)
 {
rev=rev+n.charAt(z);
}
System.out.println("rev string:"+" "+rev);
	if(rev.equals(n))
	{
	System.out.println(n+"palindrom");
}
else {
	System.out.println(n+"not palindrom");
}
	}
	}



	

