package Question3TDD;

public class EmailPassword {

	 public String isValidUserName(String name,String password){
 
	        String userName1 = "Manish";
	        String pwd = "Manish@123";
         if(name.equals(userName1) || password.equals(pwd)){
	            return "true";
	        }
         else 
         {
        	  return "false";
         }
	       
	    }
}
