package day10Encapsulation;

public class AccountMain {

	public static void main(String[] args) {

      Account acc=new Account();
      
      
      acc.setAccount(101010);
      acc.setName("Ajay");
      acc.setAmount(56000);
      
      
      System.out.println(acc.getAccount());
      System.out.println(acc.getName());
      System.out.println(acc.getAmount());
      

	}

}
