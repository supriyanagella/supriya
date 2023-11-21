package supriya;
class a{
	int b;
	char c;
	void multification() {
		System.out.println(b*c);
	}
}
class d extends a{
	int e;
	char f;
	void add() {
		System.out.println(e+f);
	}
}
public class inheritace1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
a obj=new a();
obj. b= 50;
obj. c= 'n';
obj.multification();
d obj1=new d();
obj1. e=50;
obj1.f='n';
obj1.add();
	}

}
