package CoreJava;

public class acessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Default Modifier
	void abc() {
		// can be access inside the package and not outside of it
	}

	// Public Modifier
	public static void abcd() {
		// can be access inside the package and outside of it
	}

	// private Modifier
	private static void abcde() {
		// can be access method or variable only to this class and outside this class
	}

	// protected Modifier
	protected static void abcdef() {
		// can be access only the child class(subclass only)
	}

}
