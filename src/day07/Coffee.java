package day07;

// 設計一個 Coffee 類
public class Coffee {
	String brand; // 咖啡品牌
	int temperature; // 咖啡溫度
	int price; // 咖啡價格
	
	boolean isHot() { // 判斷咖啡是否是熱的邏輯
		return temperature >= 50;
	}
	
	boolean isExpensive() { // 判斷咖啡是否是貴的邏輯
		return price >= 100;
	}
}
