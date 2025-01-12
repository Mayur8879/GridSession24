package modifiers;
public class privateModifiers {

	
	//Private variables
	
     private static String username = "Mayur Mandaliya";
     private static String password = "MAYUR@112233";
     
     
     //Private Methods
     private static void loginToApplication() {
    	 
    	 System.out.println("Logged into the Application using username:"+username+" and password:"+password);
     }


    public  static void main(String[] args) {
    	loginToApplication();
    	
    }
}
