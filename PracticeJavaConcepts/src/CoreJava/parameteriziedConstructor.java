package CoreJava;

public class parameteriziedConstructor {
	
	
	public  parameteriziedConstructor (){
		System.out.println("I am in Default constructor");
	}
	

	public  parameteriziedConstructor (int a,int b){
		System.out.println("I am in Parameterizied constructor");
	}
	
	public  parameteriziedConstructor (String c){
		System.out.println(c);
	}
	
	public void getdata() {
		System.out.println("I am in the method");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameteriziedConstructor cd1 = new parameteriziedConstructor();
		parameteriziedConstructor cd = new parameteriziedConstructor(4,5);
		
		parameteriziedConstructor cd2 = new parameteriziedConstructor("Hello");
	}

}
