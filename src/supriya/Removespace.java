package supriya;

public class Removespace {

	public static void main(String[] args) {
	String n="birds are  flying  in the    sky";	
String s="";
for(int b=0;b<n.length();b++) {
	if(n.charAt(b)!=' ') {
		s=s+n.charAt(b);
	}
	else {
		if(b+1<n.length()||n.charAt(b+1)!=' ') {
			s=s+n.charAt(b);
		}
	}
}
System.out.println(n);
	}

}
