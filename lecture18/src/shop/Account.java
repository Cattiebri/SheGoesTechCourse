package shop;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name) {
		this(id, name, 0);
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getBalance() {
		return this.balance;
	}

	private int credit(int amount) {
		return this.balance + amount;
	}

	private int debit(int amount) {
		if (amount <= this.balance) {
			this.balance = this.balance - amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}

	public int transferTo(Account another, int amount) {
		if (amount <= this.balance) {
			this.debit(amount);
			another.credit(amount);
			
		} else {
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}

	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance
				+ "]";
	}

}
