/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login_registraction;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author kefil
 */
public class Login_Registraction {
 
    private Map<String, String> users = new HashMap<>();

    public boolean register(String username, String password) {
     
        if (username == null || username.isEmpty() || users.containsKey(username)) {
            return false;
        }
        if (password == null || password.isEmpty()) {
            return false;
        }
        users.put(username, password);
        return true;
    }

    public boolean login(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}

    
    
    
   
    

