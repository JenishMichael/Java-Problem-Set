package classObjectEncapsulation;

public class SecureVaultMain {

	public static void main(String[] args) {
		SecureVault secureVault1 = new SecureVault("1", "1231", 500);
		
		
		secureVault1.setPassword("1231", "1");
		secureVault1.deposit(50, "1");
		secureVault1.withdraw(600, "1");
	}

}
