package IMS;

import java.util.HashMap;

public class Login {
	
	static HashMapSerialization hms = new HashMapSerialization();
	
	static HashMap<String, String> map = hms.importStringHashMapFromFile("src/login.txt");

	public boolean login(String username, String password) {
		if (map.containsKey(username)) {
			String pass = map.get(username);
			if (pass.equals(password)) {
				System.out.println("Login successful!");
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
		
	}

	public void newuser(String username2, String password2) {
		map.put(username2, password2);
		System.out.println("New user was added!");
	}

}
