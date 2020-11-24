
public class Account {
	public String user;
	public int accID;
	public double kontostand;
	
	
	public Account(String user, int accID, double kontostand) {
		this.user = user;
		this.accID = accID;
		this.kontostand = kontostand;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getAccID() {
		return accID;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(int kontostand) {
		this.kontostand = kontostand;
	}


	public void printAccount() {
		System.out.println("Account ID:   "+this.getAccID());
		System.out.println("Name:         "+this.getUser());
		System.out.println("Kontostand:   "+this.getKontostand());
	}

	public void changeKontostand(double money) {
		this.kontostand = this.kontostand + money;
	}
	
	public void addMoney(double money) {
		if (money < 0) {
			System.err.println("Syntax Error");
			return;
		}
		else {
			System.out.println(+money+" € wurden den Kontostand hinzugefügt");

		}
	}
	public void reduceMoney(double money) {
		if (money < 0) {
			System.err.println("Syntax Error");
			return;
		}
		else {
			System.out.println(+money+" € wurden dem Konto entnommen");
	
		}
	}
	
	
	
}
