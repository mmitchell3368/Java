package IMS;

import java.util.HashMap;

public class Items {
	static HashMapSerialization hms1 = new HashMapSerialization(); 
	static HashMap<Integer, Product> items = hms1.importProductHashMapFromFile("src/items.txt");

	public void add(int id, String name, String category, int sn, double cost, double sp, int noi) {
		Product p = new Product(id, name, category, sn, cost, sp, noi);
		items.put(id, p);
		System.out.println("Item added successfully!");
	}

	public void delete(int del) {
		boolean wasRemoved = false;
		if (items.containsKey(del)) {
			Product p = items.get(del);
			wasRemoved = items.remove(del, p);
			if (wasRemoved == true) {
				System.out.println("Item was successfully removed!");
			}
			else {
				System.out.println("Item was not successfully removed!");
				System.exit(1);
			}
		}
	}

}
