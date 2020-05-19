package CoreJava;

public class expectionDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=4;
		int b=9;
		int c=0;
		
		try {
//		int k =b/c;
//			System.out.println(k);
//			
			int arr[]=new int [5];
			System.out.println(arr[7]);
		
		}
		catch(IndexOutOfBoundsException et)
		{
			System.out.println("i CATCHED THE IndexOutOfBound EXCEPTION");
		}
		
		catch(ArithmeticException eth)
		{
			System.out.println("i CATCHED THE Arithmetic EXCEPTION");
		}
		catch(Exception e)
		{
			System.out.println("i CATCHED THE ERROE/EXCEPTION");
		}
		finally{
			
			System.out.println("delete cookies");
		}
	

	}

}
