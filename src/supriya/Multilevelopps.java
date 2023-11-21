package supriya;
class m{
	int a;
	char b;
	void sum() {
		System.out.println(a+b);
	}
}
class n extends m {
	int d;
	char e;
	void add() {
		System.out.println(d+e);
	}
}
class o extends m{
	int g;
	char h;
	void sum() {
		System.out.println(g+h);
    }
}
public class Multilevelopps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
m obj=new m();
obj.a=10;
obj.b='s';
obj.sum();
n obj1=new n();
obj1.d=10;
obj1.e='s';
obj1.add();
o obj2=new o();
obj2.g=10;
obj2.h='s';
obj2.sum();


	}

}
