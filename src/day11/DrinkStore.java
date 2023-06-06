package day11;

public class DrinkStore {

	public static void main(String[] args) {
		Drink coffee = new Coffee("Latte", 65);
		Drink blackTea = new Tea("紅茶", 15);
		Drink greenTea = new Tea("綠茶", 17);
		Drink orange = new Juice("柳橙汁", 70);
		Drink watermelon = new Juice("西瓜汁", 40);
		Drink espresso = new Espresso("Espresso", 75, 2);
		
		Drink[] drinks = {coffee, blackTea, greenTea, orange, watermelon, espresso};
		// 請問哪一種飲料最便宜, 最貴, 平均價格
		
	}

}
