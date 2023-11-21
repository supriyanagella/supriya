package supriya;

public class Multidimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int[3][3];
a[0][0]=0;
a[0][1]=1;
a[0][2]=2;
a[1][0]=3;
a[1][1]=4;
a[1][2]=5;
a[2][0]=6;
a[2][1]=7;
a[2][2]=8;
for (int m=0;m<=2;m++)
{
for(int n=0;n<=2;n++)
{
System.out.print(a[m][n]+" ");

}
System.out.println();
}
	}
}


