package day09;

public class MyHomeSteak {

	public static void main(String[] args) {
		Steak steak1 = new Steak("菲力牛排", 350, "Medium");
		Steak steak2 = new Steak("丁骨牛排", 550, "Medium Rare");
		Steak steak3 = new Steak("牛小排", 450, "Medium Well");
		
		System.out.println(steak1);
		System.out.println(steak2);
		System.out.println(steak3);
		
		System.out.println(steak1.getName() + ", " + steak1.getPrice() + ", " + steak1.getDoneness());
		System.out.println(steak2.getName() + ", " + steak2.getPrice() + ", " + steak2.getDoneness());
		System.out.println(steak3.getName() + ", " + steak3.getPrice() + ", " + steak3.getDoneness());
		
	}

}
