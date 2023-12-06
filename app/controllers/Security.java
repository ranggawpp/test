package controllers;
 
import models.*;
 
public class Security extends Secure.Security {
	
    static boolean authenticate(String username, String password) {
        boolean auth = false;
        if (User.connect(username, password) != null){
            auth = true;
        }
        return auth;
    }

    
}