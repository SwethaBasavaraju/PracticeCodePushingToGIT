package CoreJava;

public class MultiDemesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [][] = new int [2][3];
		a[0] [0]=2;
		a[0] [1]=4;
		a[0] [2]=2;
		a[1] [0]=5;
		a[1] [1]=9;
		a[1] [2]=7;
		
		System.out.println(a[0][1]); 
		
		int b[][]= {{2,4,5} ,{3,5,7},{5,6,8}};
		System.out.println(b[0][1]); 
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
			{
				
				System.out.println(a[i][j]);
		}
	
		
		}
	}

}
