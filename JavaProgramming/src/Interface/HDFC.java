package Interface;

public class HDFC implements Bank {
	
	public void viewAccountBalance() {
		
		System.out.println("Viewing Account Balance");
	}

	public void fundTransfer() {
		System.out.println("Transfering the Fund");	
	}
	public void openFixedDeposit() {
		
		System.out.println("Opening Fixed Deposit Account");	
	}
}
