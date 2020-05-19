package CoreJava;

public class staticVar {
	
	String name;
	String address;
	static String city;//class variable
	static int i;
	
	static {
		
		city = "Mysore";//class variable
	     i=0;
	}
	
	staticVar(String name,String address)
	{
		this.name=name;
		this.address=address;
		
		i++;
		System.out.println(i);
	}
	
	public void getaddress()
	{
		System.out.println(address+" "+city);
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		staticVar obj =new staticVar("Swetha","Jantha");
		staticVar obj1=new staticVar("Shashi","Kumepunagar");
		staticVar obj3=new staticVar("Kashvi","Sara");
		staticVar obj4=new staticVar("Vilohit","Vijau");
		obj.getaddress();
		obj1.getaddress();
		obj4.getaddress();
		obj3.getaddress();
		staticVar.getCity();
	}

}
