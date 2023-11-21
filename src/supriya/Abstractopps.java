package supriya;
interface vekshu{
int a=10;         
int b=20;
void baby ();
}
public class Abstractopps implements vekshu{
	public void baby() {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		Abstractopps obj=new Abstractopps();
		obj.baby();
		
	}

}
