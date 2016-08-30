package cn.sxt.staticproxy;

public class Proxy implements Rent {
	
	private Landlord landlord;
	
	public void setLandlord(Landlord landlord) {
		this.landlord = landlord;
	}

	public Proxy(Landlord landlord) {
		super();
		this.landlord = landlord;
	}

	@Override
	public void rent() {
		inspect();
		landlord.rent();
		chargeFee();
	}
	
	// Inspect
	private void inspect() {
		System.out.println("Lead clients inspecting property");
	}
	
	// Charge client
	private void chargeFee() {
		System.out.println("Charging fee");
	}
}
