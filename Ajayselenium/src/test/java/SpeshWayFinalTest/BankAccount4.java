package SpeshWayFinalTest;

public class BankAccount4 {
	String Accountno;
	double balance;
	String ownername;
	
	public String getAccountno() {
		return Accountno;
	}
	public void setAccountno(String Accountno) {
		this.Accountno = Accountno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>=0) {
			System.out.println("Balance cannot be Negative");
		}else {
		this.balance = balance;
	}
}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	
	}

public void displayaccountdetails() {
	System.out.println("Account Number:"+Accountno);
	System.out.println("Balance:"+balance);
	System.out.println("Name:"+ownername);

}

	public static void main(String[] args) {
		BankAccount4 Ac=new BankAccount4();
       Ac.setAccountno("9133882630");
       Ac.setBalance(5000);
       Ac.setOwnername("Ajay");
       
       Ac.displayaccountdetails();
       
       Ac.setBalance(-7000);
	}

}
