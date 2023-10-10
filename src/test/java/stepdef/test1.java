package stepdef;

import org.testng.annotations.Test;

public class test1 {


    @Test
    public void login() {
        System.out.println("Logging In");
        System.out.println("You are logged in!");
    }


    @Test
    public void logout() {
        System.out.println("Logging out");
        System.out.println("Good Bye");
    }
}
