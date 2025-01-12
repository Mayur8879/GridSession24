package Interface;

public interface Bank {

	String ACCOUNTTYPEONE = "savings account";  //By default Static & Final
	String ACCOUNTTYPETWO = "current account";  //By default Static & Final
	
	public void viewAccountBalance();           //By default Abstract methods     
	
	public void fundTransfer();
	
	public void openFixedDeposit();

}
