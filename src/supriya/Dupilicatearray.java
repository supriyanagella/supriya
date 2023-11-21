package supriya;

public class Dupilicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Object a[]= {"supriya",'c',1,"sunitha",'c',"mourya"};
for (int b=0;b<a.length;b++)
{
for(int c=b+1;c<a.length;c++)	
{
	if(a[b]==a[c])
			{
		System.out.println(a[b]);
			}
}
}
		
		
		
		
		
		
	}

}
