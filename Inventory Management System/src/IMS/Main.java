package IMS;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Mike's Tech Shop - Inventory Management System");
	    Scanner sc = new Scanner(System.in);

	    boolean quit = false;

	    while (!quit) {
	        System.out.println("Enter 1 to quit");
	        System.out.println("Enter 2 to create new user.");
	        System.out.println("Enter 3 to login as existing user.");
	        System.out.println("Enter 4 to export to data to files.");

	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                quit = true;
	                break;
	            case 2:
	                Login l = new Login();
	                System.out.println("Please enter username: ");
	                String username = sc.next();
	                System.out.println("Please enter password: ");
	                String password = sc.next();
	                l.newuser(username, password);
	                break;
	            case 3:
	                Login l2 = new Login();
	                boolean loginSuccess = false;
	                System.out.println("Please enter username: ");
	                String existingUsername = sc.next();
	                System.out.println("Please enter password: ");
	                String existingPassword = sc.next();
	                loginSuccess = l2.login(existingUsername, existingPassword);
	                if (loginSuccess) {
	                	boolean r = false;
	                    while (!r) {
	                    	System.out.println("Enter 1 to return.");
	                    	System.out.println("Enter 2 to access items.");
	                    	System.out.println("Enter 3 to access stock.");
	                    	System.out.println("Enter 4 to access reports.");
	                    	
	                    	int nextChoice = sc.nextInt();
	                    	
	                    	switch (nextChoice) {
	                    	case 1:
	                    		r = true;
	                    		break;
	                    	case 2:
	                    		boolean r2 = false;
	                    		while (!r2) {
	                    			Items i = new Items();
		                    		System.out.println("Enter 1 to return.");
		                    		System.out.println("Enter 2 to add a item to inventory.");
		                    		System.out.println("Enter 3 to edit an item in inventory.");
		                    		System.out.println("Enter 4 to delete an item from inventory.");
		                    		
		                    		int choice3 = sc.nextInt();
		                    		
		                    		switch (choice3) {
		                    		case 1:
		                    			r2 = true;
		                    			break;
		                    		case 2:
		                    			UniqueRandomGenerator urq = new UniqueRandomGenerator();
		                    			int id = urq.generateUniqueRandom(1, 10000000);
		                    			System.out.println("New product ID is: " + id);
		                    			System.out.println("Enter item name (use hyphens for spaces): ");
		                    			String name = sc.next();
		                    			System.out.println("Enter number that matches item category: ");
		                    			System.out.println("Enter 1 for laptops");
		                    			System.out.println("Enter 2 for computers");
		                    			System.out.println("Enter 3 for monitors");
		                    			System.out.println("Enter 4 for phones");
		                    			System.out.println("Enter 5 for tablets");
		                    			System.out.println("Enter 6 for gaming consoles");
		                    			System.out.println("Enter 7 for software");
		                    			int cat = sc.nextInt();
		                    			String category = "";
		                    			switch (cat) {
		                    			case 1:
		                    				category = "laptop";
		                    				break;
		                    			case 2:
		                    				category = "computer";
		                    				break;
		                    			case 3:
		                    				category = "monitor";
		                    				break;
		                    			case 4:
		                    				category = "phone";
		                    				break;
		                    			case 5: 
		                    				category = "tablets";
		                    				break;
		                    			case 6:
		                    				category = "gaming console";
		                    				break;
		                    			case 7:
		                    				category = "software";
		                    				break;
		                    			}
		                    			System.out.println("Enter item serial number: ");
		                    			int sn = sc.nextInt();
		                    			
		                    			System.out.println("Enter item cost: ");
		                    			double cost = sc.nextDouble();
		                    			
		                    			System.out.println("Enter item sell price: ");
		                    			double sp = sc.nextDouble();
		                    			
		                    			System.out.println("Enter number of current item: ");
		                    			int noi = sc.nextInt();
		                    			
		                    			i.add(id, name, category, sn, cost, sp, noi);
		                    			break;
		                    		case 3: 
		                    			System.out.println("Enter id of item to edit: ");
		                    			int edit = sc.nextInt();
		                    			Product p = Items.items.get(edit);
		                    			
		                    			System.out.println("Product id: " + p.getID());
		                    			System.out.println("Product name: " + p.getName());
		                    			System.out.println("Product category: " + p.getCategory());
		                    			System.out.println("Product serial number: " + p.getSN());
		                    			System.out.println("Product cost: " + p.getCost());
		                    			System.out.println("Product sell price: " + p.getSP());
		                    			System.out.println("Product's number of items" + p.getNOI());
		                    			
		                    			System.out.println("Enter new name (use hyphens for spaces): ");
		                    			String newName = sc.next();
		                    			p.setName(newName);
		                    			
		                    			System.out.println("Enter number that matches new item category: ");
		                    			System.out.println("Enter 1 for laptops");
		                    			System.out.println("Enter 2 for computers");
		                    			System.out.println("Enter 3 for monitors");
		                    			System.out.println("Enter 4 for phones");
		                    			System.out.println("Enter 5 for tablets");
		                    			System.out.println("Enter 6 for gaming consoles");
		                    			System.out.println("Enter 7 for software");
		                    			int newCat = sc.nextInt();
		                    			String newCategory = "";
		                    			switch (newCat) {
		                    			case 1:
		                    				newCategory = "laptop";
		                    				break;
		                    			case 2:
		                    				newCategory = "computer";
		                    				break;
		                    			case 3:
		                    				newCategory = "monitor";
		                    				break;
		                    			case 4:
		                    				newCategory = "phone";
		                    				break;
		                    			case 5: 
		                    				newCategory = "tablets";
		                    				break;
		                    			case 6:
		                    				newCategory = "gaming console";
		                    				break;
		                    			case 7:
		                    				newCategory = "software";
		                    				break;
		                    			}
		                    			
		                    			p.setCategory(newCategory);
		                    			
		                    			System.out.println("Enter new serial number: ");
		                    			int newSN = sc.nextInt();
		                    			p.setSN(newSN);
		                    			
		                    			System.out.println("Enter new cost: ");
		                    			double newCost = sc.nextDouble();
		                    			p.setCost(newCost);
		                    			
		                    			System.out.println("Enter new sell price: ");
		                    			double newSP = sc.nextDouble();
		                    			p.setSP(newSP);
		                    			
		                    			System.out.println("Enter new number of items for this product: ");
		                    			int newNOI = sc.nextInt();
		                    			p.setNOI(newNOI);
		                    			break;
		                    			
		                    		case 4: 
		                    			System.out.println("Enter item id to delete item from inventory: ");
		                    			int del = sc.nextInt();
		                    			i.delete(del);
		                    			break;
		                    		}
	                    		}
	                    		break;
	                    	case 3:
	                    		boolean r3 = false;
	                    		while (!r3) {
	                    			Stock s = new Stock();
	                    			System.out.println("Enter 1 to return.");
	                    			System.out.println("Enter 2 to view all stock.");
	                    			System.out.println("Enter 3 to search stock.");
	                    			int choice4 = sc.nextInt();
	                    			
	                    			switch (choice4) {
	                    			case 1:
	                    				r3 = true;
	                    				break;
	                    			case 2:
	                    				s.viewAll();
	                    				break;
	                    			case 3: 
	                    				System.out.println("Enter 1 to search by ID.");
	                    				System.out.println("Enter 2 to search by name.");
	                    				System.out.println("Enter 3 to search by category.");
	                    				System.out.println("Enter 4 to search by serial number.");
	                    				System.out.println("Enter 5 to search by cost.");
	                    				System.out.println("Enter 6 to search by sell price.");
	                    				System.out.println("Enter 7 to search by number of items.");
	                    				
	                    				int search = sc.nextInt();
	                    				
	                    				switch (search) {
	                    				case 1:
	                    					System.out.println("Enter the ID to search by: ");
	                    					int searchID = sc.nextInt();
	                    					s.searchByID(searchID);
	                    					break;
	                    				case 2:
	                    					System.out.println("Enter the name to search by (use hyphens for spaces): ");
	                    					String searchName = sc.next();
	                    					s.searchByName(searchName);
	                    					break;
	                    				case 3:
	                    					System.out.println("Enter the category to search by: ");
	                    					String searchCat = sc.next();
	                    					s.searchByCat(searchCat);
	                    					break;
	                    				case 4: 
	                    					System.out.println("Enter the serial number to search by: ");
	                    					int searchSN = sc.nextInt();
	                    					s.searchBySN(searchSN);
	                    					break;
	                    				case 5:
	                    					System.out.println("Enter the cose to search by (Use decimal format - 0.00): ");
	                    					double searchCost = sc.nextDouble();
	                    					s.searchByCost(searchCost);
	                    					break;
	                    				case 6:
	                    					System.out.println("Enter the sell price to search by (Use decimal format - 0.00): ");
	                    					double searchSP = sc.nextDouble();
	                    					s.searchBySP(searchSP);
	                    					break;
	                    				case 7: 
	                    					System.out.println("Enter the number of items to search by: ");
	                    					int searchNOI = sc.nextInt();
	                    					s.searchByNOI(searchNOI);
	                    					break;
	                    				}
	                    				break;
	                    			}
	                    		}
	                    		break;
	                    	case 4:
	                    		boolean r4 = false;
	                    		while (!r4) {
	                    			Report re = new Report();
	                    			System.out.println("Enter 1 to return.");
	                    			System.out.println("Enter 2 to generate a report on an invertory status.");
	                    			System.out.println("Enter 3 to generate a report on low stock items.");
	                    			int choice5 = sc.nextInt();
	                    			
	                    			switch (choice5) {
	                    			case 1:
	                    				r4 = true;
	                    				break;
	                    			case 2:
	                    				boolean r5 = false;
	                    				while (!r5) {
	                    					System.out.println("Enter 1 to return.");
	                    					System.out.println("Enter 2 to get inventory status on quantity on hand.");
	                    					System.out.println("Enter 3 to get inventory status on value of inventory.");
	                    					int choice6 = sc.nextInt();
	                    					
	                    					switch (choice6) {
	                    					case 1:
	                    						r5 = true;
	                    						break;
	                    					case 2:
	                    						re.quantityOnHand();
	                    						break;
	                    					case 3:
	                    						re.valueOfInventory();
	                    						break;
	                    					}
	                    				}
	                    				break;
	                    			case 3:
	                    				re.lowStockItems();
	                    				break;
	                    			}
	                    		}
	                    	}
	                    }
	                    break;
	                } else {
	                    System.out.println("Username or password was incorrect.");
	                }
	                break;
	            case 4:
	            	HashMapSerialization hms = new HashMapSerialization();
	            	hms.exportStringHashMapToFile(Login.map, "src/login.txt");
	            	hms.exportProductHashMapToFile(Items.items, "src/items.txt");
	            	break;
	            default:
	                System.err.println("Input was not a 1, 2, 3 or 4. Try again.");
	                break;
	        }
	    }
	}
}
