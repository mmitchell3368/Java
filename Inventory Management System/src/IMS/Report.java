package IMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Report {

	public void quantityOnHand() {
		for (Product p : Items.items.values()) {
			System.out.println("ID: " + p.getID() + " | " + "Name: " + p.getName() + " | " + "Quantity on hand: " + p.getNOI());
		}
		
	}

	public void valueOfInventory() {
		double totalCost = 0.00;
		double totalSP = 0.00;
		double value = 0.00;
		for (Product p : Items.items.values()) {
			totalCost = totalCost + (p.getCost() * p.getNOI());
			totalSP = totalSP + (p.getSP() * p.getNOI());
		}
		value = totalSP - totalCost;
		System.out.println(String.format("Total inventory value: $%.2f", value));
		
	}

	public void lowStockItems() {
		List<Product> productList = new ArrayList<>(Items.items.values());
		Collections.sort(productList, new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return Integer.compare(p1.getNOI(), p2.getNOI());
			}
		});
		for (Product p : productList) {
			System.out.println("ID: " + p.getID() + " | " + "Name: " + p.getName() + " | " + "Category: " + p.getCategory() + " | " + "Serial Number: " + p.getSN() + " | " + "Cost: " + p.getCost() + " | " + "Selling Price: " + p.getSP() + " | " + "Number of Items: " + p.getNOI());
		}
		
	}

}
