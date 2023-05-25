package day08;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		account.setName("John");
		account.deposit(100);
		account.withdraw(70);
		account.print();
	}

}
