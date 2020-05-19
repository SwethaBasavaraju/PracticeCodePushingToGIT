package CoreJava;

public class ConstractorDemo {
	

	public  ConstractorDemo (){
		System.out.println("I am in thr constructor");
	}
	
	public void getdata() {
		System.out.println("I am in the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstractorDemo cd = new ConstractorDemo();
		cd.getdata();
	}

}
