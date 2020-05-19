package CoreJava;

public class childDemo extends parentDemo{
	
	public  childDemo() {
		super();
		System.out.println("I am child contructor");
	}
	String name ="KashviShashidhar";
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
		
	}
	public void getData() {
		super.getData();
		System.out.println("I am child class");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo cd = new childDemo();
		cd.getData();
		cd.getStringData();
	}

}
