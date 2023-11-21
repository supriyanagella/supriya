package supriya;
public class Reversestring {
public static void main(String[] args) {
	String supriya="marolix";
	String reverse="";
	int length= supriya.length();
	for(int i=length-1;i>=0;i--)
	{
		reverse=reverse+supriya.charAt(i);
	}
	System.out.println("reverse string:"+" "+reverse);
}
}
