package IMS;

import java.io.Serializable;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1668154356173532795L;
	private int id;
	private String name;
	private String category;
	private int sn;
	private double cost;
	private double sp;
	private int noi;
	
	Product(int id1, String name1, String cat1, int sn1, double cost1, double sp1, int noi1) {
		this.id = id1;
		this.name = name1;
		this.category = cat1;
		this.sn = sn1;
		this.cost = cost1;
		this.sp = sp1;
		this.noi = noi1;
	}
	
	// Getters
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public int getSN() {
		return sn;
	}
	
	public double getCost() {
		return cost;
	}
	
	public double getSP() {
		return sp;
	}
	
	public int getNOI() {
		return noi;
	}
	
	// Setters
	
	public void setName(String name1) {
		name = name1;
	}
	
	public void setCategory(String cat) {
		category = cat;
	}
	
	public void setSN(int sn1) {
		sn = sn1;
	}
	
	public void setCost(double cost1) {
		cost = cost1;
	}
	
	public void setSP(double sp1) {
		sp = sp1;
	}
	
	public void setNOI(int noi1) {
		noi = noi1;
	}

}
