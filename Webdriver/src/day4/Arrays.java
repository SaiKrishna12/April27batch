package day4;

public class Arrays {

	public static void main(String[] args) {
		int[] a={10,20,35,56,53,79,11};
		for(int i=0;i<a.length;i++)
		{
		   System.out.println(a[i]);
		}
		
		System.out.println("########");
		
		int[] b=new int[4];
		b[0]=32;
		b[1]=31;
		b[2]=56;
		b[3]=79;
		for(int i=0;i<b.length;i++)
		{
		   System.out.println(b[i]);
		}
	}
}

