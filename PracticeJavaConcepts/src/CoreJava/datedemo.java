package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("MM/d/yyyy");
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sd = new SimpleDateFormat("MM/d/yyyy hh:mm:ss");
			System.out.println(sd.format(d));

	}

}
