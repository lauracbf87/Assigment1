package com.nagarro.freshers.laura.assigment.one;

public class ItemInformation {
	
	private String name;
	private double price;
	private int quantity;
	private char type;
	
		public ItemInformation(String name, double price, int quantity, char type) {
			
			this.setName(name);
			this.setPrice(price);
			this.setQuantity(quantity);
			this.setType(type);
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public char getType() {
			return type;
		}

		public void setType(char type) {
			this.type = type;
		}
	
	
	

}
