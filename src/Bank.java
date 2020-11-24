
public class Bank {
	
	
	public static void main(String[] args) {
		AccountInterface acc = new ProxyAccount("Sparkasse", 18934, 100000.00, "Passwort");
		
		try {
			acc.printAccount();
			acc.addMoney(4800);
			acc.reduceMoney(2500);
			acc.reduceMoney(1000);
		}
		catch(Exception e) {
			System.out.println("Sytax Error");
		}		
	}
}
