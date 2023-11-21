package supriya;

public class Splitstring {

	public static void main(String[] args) {
	String v="supriya vekshu mounu ";
	String []a=v.split(" ");
	String rev=" ";
	for (String n:a)
	{
		String reverse=" ";
		for(int i=n.length()-1;i>=0;i--)
		{
		reverse=reverse+n.charAt(i);
		}
		rev=rev+reverse+" ";
		System.out.println(rev);
		
		}
	}

	}


