package InterfaceConcept;

public class Devloping implements BankingClient,DomainClient{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Devloping d =new Devloping();
		d.payCreditCard();
		d.transferbalance();
		d.login();
		BankingClient dr=new Devloping();//Run time polymorphism
		DomainClient ds = new Devloping();
		ds.investment();
	}

	@Override
	public void payCreditCard() {
		// TODO Auto-generated method stub
		System.out.println("paycredit card implements");
		
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transfer balance implements");
		
	}

	@Override
	public void checkBalcnce() {
		// TODO Auto-generated method stub
		System.out.println("checkBalcnce implements");
		
	}
	
	public void login() {
	}
	


public void logout() {
}

@Override
public void investment() {
	// TODO Auto-generated method stub
	System.out.println("investment");
	
}
}

