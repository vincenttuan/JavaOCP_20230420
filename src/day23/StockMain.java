package day23;


class Callback {
	void printPrice(int price) {
		System.out.println("股價:" + price);
	}
}

public class StockMain {
	
	public static void main(String[] args) {
		Callback cb = new Callback();
		for(int i=1;i<=10;i++) {
			new Thread(new Stock(cb)).start();
		}

	}

}
