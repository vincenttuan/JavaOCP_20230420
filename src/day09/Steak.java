package day09;

public class Steak extends Food {
	private String doneness;
	
	public Steak() {
		
	}

	public Steak(String name, String doneness) {
		// 請自行實作建立一個商業方法讓不同的 name 會有自己的 price(Home work)
	}
	
	public Steak(String name, int price, String doneness) {
		super(name, price);
		this.doneness = doneness;
	}
	
	public String getDoneness() {
		return doneness;
	}

	public void setDoneness(String doneness) {
		this.doneness = doneness;
	}

	@Override
	public String toString() {
		return "Steak [doneness=" + doneness + ", " + super.toString() + "]";
	}
	
	
	
}
