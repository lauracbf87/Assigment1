package com.nagarro.freshers.laura.assigment.one;

public class ObtainPrice {
	
	private double tax;
	private double total;

	public ObtainPrice(double salesTax, double total) {		
		this.setTax(salesTax);
		this.setTotal(total);

	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	

}
