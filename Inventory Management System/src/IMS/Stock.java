package IMS;

public class Stock {

	public void viewAll() {
		for (Product p : Items.items.values()) {
			System.out.println("ID: " + p.getID() + " | " + "Name: " + p.getName() + " | " + "Category: " + p.getCategory() + " | " + "Serial Number: " + p.getSN() + " | " + "Cost: " + p.getCost() + " | " + "Selling Price: " + p.getSP() + " | " + "Number of Items: " + p.getNOI());
		}
		
	}

	public void searchByID(int searchID) {
		for (Product p : Items.items.values()) {
			if (p.getID() == searchID) {
				System.out.println("ID: " + p.getID() + " | " + "Name: " + p.getName() + " | " + "Category: " + p.getCategory() + " | " + "Serial Number: " + p.getSN() + " | " + "Cost: " + p.getCost() + " | " + "Selling Price: " + p.getSP() + " | " + "Number of Items: " + p.getNOI());
			}
			else {
				System.out.println("No products match ID.");
			}
		}
		
	}

	public void searchByName(String searchName) {
		for (Product p : Items.items.values()) {
			if (p.getName().equalsIgnoreCase(searchName)) {
				System.out.println("ID: " + p.getID() + " | " + "Name: " + p.getName() + " | " + "Category: " + p.getCategory() + " | " + "Serial Number: " + p.getSN() + " | " + "Cost: " + p.getCost() + " | " + "Selling Price: " + p.getSP() + " | " + "Number of Items: " + p.getNOI());
			}
			else {
				System.out.println("No products match name.");
			}
		}
		
	}

	public void searchByCat(String searchCat) {
		for (Product p : Items.items.values()) {
			if (p.getCategory().equalsIgnoreCase(searchCat)) {
				System.out.println("ID: " + p.getID() + " | " + "Name: " + p.getName() + " | " + "Category: " + p.getCategory() + " | " + "Serial Number: " + p.getSN() + " | " + "Cost: " + p.getCost() + " | " + "Selling Price: " + p.getSP() + " | " + "Number of Items: " + p.getNOI());
			}
			else {
				System.out.println("No products match category.");
			}
		}
		
	}

	public void searchBySN(int searchSN) {
		for (Product p : Items.items.values()) {
			if (p.getSN() == searchSN) {
				System.out.println("ID: " + p.getID() + " | " + "Name: " + p.getName() + " | " + "Category: " + p.getCategory() + " | " + "Serial Number: " + p.getSN() + " | " + "Cost: " + p.getCost() + " | " + "Selling Price: " + p.getSP() + " | " + "Number of Items: " + p.getNOI());
			}
			else {
				System.out.println("No products match serial number.");
			}
		}
		
	}

	public void searchByCost(double searchCost) {
		for (Product p : Items.items.values()) {
			if (p.getCost() == searchCost) {
				System.out.println("ID: " + p.getID() + " | " + "Name: " + p.getName() + " | " + "Category: " + p.getCategory() + " | " + "Serial Number: " + p.getSN() + " | " + "Cost: " + p.getCost() + " | " + "Selling Price: " + p.getSP() + " | " + "Number of Items: " + p.getNOI());
			}
			else {
				System.out.println("No products match cost.");
			}
		}
		
	}

	public void searchBySP(double searchSP) {
		for (Product p : Items.items.values()) {
			if (p.getSP() == searchSP) {
				System.out.println("ID: " + p.getID() + " | " + "Name: " + p.getName() + " | " + "Category: " + p.getCategory() + " | " + "Serial Number: " + p.getSN() + " | " + "Cost: " + p.getCost() + " | " + "Selling Price: " + p.getSP() + " | " + "Number of Items: " + p.getNOI());
			}
			else {
				System.out.println("No products match selling price.");
			}
		}
		
	}

	public void searchByNOI(int searchNOI) {
		for (Product p : Items.items.values()) {
			if (p.getNOI() == searchNOI) {
				System.out.println("ID: " + p.getID() + " | " + "Name: " + p.getName() + " | " + "Category: " + p.getCategory() + " | " + "Serial Number: " + p.getSN() + " | " + "Cost: " + p.getCost() + " | " + "Selling Price: " + p.getSP() + " | " + "Number of Items: " + p.getNOI());
			}
			else {
				System.out.println("No products match number of items.");
			}
 		}
		
	}
	

}
