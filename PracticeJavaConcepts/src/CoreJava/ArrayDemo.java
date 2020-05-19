package CoreJava;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=4;
		
		int a[] = new int[5];
//		int b[] = new int[10];//Declares an array and allocate memory for the variables

		a[0]=2;
		a[1]=6;
		a[2]=1;
		a[3]=9;
		a[4]=12;
	
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		int b[]= {1,4,7,8,9};
	
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
}
}