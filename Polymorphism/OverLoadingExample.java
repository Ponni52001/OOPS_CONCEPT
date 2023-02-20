

class LoginPage
{

    public void login(String emailID,String password)
    {
        
        System.out.println("Login successful!");
        
    }
    public void login(long mobileNumber, String password)
    {
        
        System.out.println("Login successful!!");
        
    }
    
}



public class OverLoadingExample
{
    
    public static void main(String[] args) 
    {
      LoginPage user =  new LoginPage();
      user.login("ponni52001@gmail.com","Ponni5$");
      user.login(1234567894,"Ponni5$");
        
    }
    
}


