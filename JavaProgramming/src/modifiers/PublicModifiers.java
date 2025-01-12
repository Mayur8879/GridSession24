package modifiers;

public class PublicModifiers {

	
	//Public Variables
	
	 public static String username = "Mayur Mandaliya";
     public static String password = "MAYUR@112233";
     
     
     //Public Methods
     
     public static void loginToApplication() {
    	 
    	 System.out.println("Logged into the Application using username:"+username+" and password:"+password);
     }


    public static void main(String[] args) {
    	loginToApplication();
    	
    }
}
