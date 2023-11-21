package supriya;
class k{
	int a;
	char b;
	void nagella() {
		System.out.println(a+b);
	}
}
class L{
	int c;
	char d;
	void nagella() {
		System.out.println(c+d);
	}
}
class M{
int e;
char f;
void vekshu() {
	System.out.println(e+f);
}
}
class N extends M{
	int g;
	char h;
	void vekshu() {
		System.out.println(g+h);
	}
}
public class Hieraricalopps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
k obj=new k();
obj.a= 100;
obj.b=50;
obj.nagella();
L obj1=new L();
obj1.c=100;
obj1.d=100;
obj1.nagella();
M obj2 = new M();
obj2.e=100;
obj2.f=200;
obj2.vekshu();
N obj3 =new N();
obj3.g =200;
obj3.h =200;
obj3.vekshu
();


	}

}

