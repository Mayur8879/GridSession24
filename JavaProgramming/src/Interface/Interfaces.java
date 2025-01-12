package Interface;

public class Interfaces {

	public static void main(String[] args) {
		
		HDFC h = new HDFC();
		
		h.viewAccountBalance();
		h.fundTransfer();
		h.openFixedDeposit();
		
		System.out.println(Bank.ACCOUNTTYPEONE);
		System.out.println(Bank.ACCOUNTTYPETWO);
	}

}
