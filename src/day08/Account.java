package day08;

public class Account {
	
	private String name; // 戶名
	private int balance; // 餘額
	
	void setName(String name) { // 設定戶名
		this.name = name;
	}
	
	void deposit(int amount) { // 存款
		if(amount > 0) {
			this.balance += amount;
			System.out.printf("存款 $%d 成功\n", amount);
		} else {
			System.out.printf("存款 $%d 失敗\n", amount);
		}
	}
	
	void withdraw(int amount) { // 提款
		if(amount > 0 && this.balance >= amount) {
			this.balance -= amount;
			System.out.printf("提款 $%d 成功\n", amount);
		} else {
			System.out.printf("提款 $%d 失敗\n", amount);
		}
	}
	
	void print() { // 列印目前餘額資料
		System.out.printf("%s 餘額: $%d\n", 
						  this.name, this.balance);
	}
	
}
