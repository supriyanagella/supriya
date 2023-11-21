package supriya;

public class Occuranceofcharecters {

	public static void main(String[] args) {
		String z="extend key words";
		int n1=z.length();
		int n2=z.replace("q","").length();
		int count =n1-n2;
		System.out.println("count string:"+count);

	}

}
