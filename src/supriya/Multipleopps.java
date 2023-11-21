package supriya;
interface tree{
	int a =500;
	String b = "flowers";
	void colours();
	}
interface plants{
	int c = 100;
	String d= "leafs";
	void flowers();
	}
public class Multipleopps implements tree ,plants {
	public void colours() {
	System.out.println(a+b);
	}
	public void flowers() {
	System.out.println(c+d);	
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Multipleopps obj = new Multipleopps();
obj.colours();
obj.flowers();
	}

}
