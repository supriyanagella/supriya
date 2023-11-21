package supriya;

public class Fibonacciseries {

	public static void main(String[] args) {
	int a=0;
	int a1= 1;
	int sum=0;
	System.out.println(a+a1);
	for(int i=2;i<10;i++)
	{
		sum=a+a1;
		System.out.println(" "+sum);
		a=a1;
		a=sum;
	}
	

	}

}
