package InterfaceConcept;

public class ClildEmrites extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClildEmrites c=new ClildEmrites();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
		

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
