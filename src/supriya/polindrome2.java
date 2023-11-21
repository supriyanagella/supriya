package supriya;
public class polindrome2 {
	public static void main(String[] args) {
		
String a="vekshu";
String rev="";
int len=a.length();
for( int b=a.length();b>0;b--)
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
