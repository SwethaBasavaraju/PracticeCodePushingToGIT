package CoreJava;

public class thisDemo {
	
	int a=2;
	
	public void getData() {
		int a=3;
		int b= a+this.a;
		System.out.println(b);
		
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo tf= new thisDemo();
		tf.getData();
	}

}
