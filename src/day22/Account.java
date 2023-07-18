package day22;

public class Account {
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	// 提款
	public void withdraw(int amount) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 開始提款 $%d\n", tName, amount);
		// 取得最新帳戶餘額
		int currentBalance = balance;
		if(currentBalance >= amount) {
			// 將餘額減去提款金額
			balance = balance - amount;
			// 印出交易結果
			System.out.printf("%s 提款 $%d 成功, 帳戶餘額 $%d\n", tName, amount, balance);
		} else {
			// 印出交易結果
			System.out.printf("%s 提款 $%d 失敗, 帳戶餘額 $%d\n", tName, amount, balance);
		}
		System.out.printf("%s 提款完成\n", tName);
	}
	
	
}
