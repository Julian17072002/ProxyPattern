import java.util.Scanner;

public class ProxyAccount implements AccountInterface {

	private Account acc;
	private String password;
	Scanner sc = new Scanner(System.in);
	
	public ProxyAccount(String user, int accID, double Kontostand, String passwort) {
		this.acc = new Account(user, accID, Kontostand);
		this.password = passwort;
	}
	
	private boolean checkPassword() {
		System.out.println("Enter Passwort: ");
		String passwortInput = sc.next();
		
		if(this.password.equals(passwortInput)) {
			System.out.println("Passwort OK");
			System.out.println("-----------");

		}
		else {
			System.out.println("Wrong Passwort");
			System.out.println();
		}
		return true;
	}
	
	public void printAccount() {
		if (checkPassword()) {
			acc.printAccount();
		}
	}
	
	public void addMoney(double money) {
		if (checkPassword()) {
			acc.addMoney(money);
		}
	}
	
	public void reduceMoney(double money) {
		if (checkPassword()) {
			acc.reduceMoney(money);
		}
	}

	public double getKontostand() {
		if (checkPassword()) {
			acc.getKontostand();
		}
		return 0;
	}


	public String getUser() {
		return acc.getUser();
	}


	public void setUser(String user) {
		acc.setUser(user);
	}


	public int getAccID() {
		return acc.getAccID();
	}

	public void setAccID(int accID) {
		acc.setAccID(accID);
		
	}

	public void setKontostand(int kontostand) {
		acc.setKontostand(kontostand);
	}

	public double getKontostand(double money) {
		return acc.getKontostand();
	}
}
