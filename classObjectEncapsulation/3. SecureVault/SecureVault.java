package classObjectEncapsulation;

public class SecureVault {
	
	private String vaultId;
	private String password;
	private double balance;
	
	public SecureVault(String vaultId, String password, double balance) {
		super();
		this.vaultId = vaultId;
		this.password = password;
		this.balance = balance;
	}

	public String getVaultId() {
		return vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setPassword(String oldPassword, String newPassword) {
		if(this.password.equals(oldPassword)) {
			password = newPassword;
			System.out.println("Password updated successfully.");
		}
		else
			System.out.println("Old Password is incorrect");
	}
	
	public void deposit(double amount, String password) {
		if(this.password.equals(password)) {
			this.balance = this.balance + amount;
			 System.out.println("Deposit successful. New balance: " + this.balance);
		}
		else
			System.out.println("Old Password is incorrect");
	}
	
	public void  withdraw(double amount, String password) {
		if(this.password.equals(password)){
			if(this.balance >= amount) {
				this.balance = this.balance - amount;
				System.out.println("Withdrawal successful. New balance: " + this.balance);
			}
			else {
				System.out.println("Your Balance is insufficient");
			}
		}
		else 
			System.out.println("Old Password is incorrect");
	}
}
