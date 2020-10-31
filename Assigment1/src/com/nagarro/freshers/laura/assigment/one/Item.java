package com.nagarro.freshers.laura.assigment.one;
import java.util.*;

public class Item {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter item details");
		
		// Name
		String itemName = "";
		System.out.print("Name: ");
		itemName = input.nextLine();
		
		// Price
		double itemPrice = 0;
		boolean wrongPrice = true;
		
			while (wrongPrice) {
				System.out.print("Price: ");
				try {
					itemPrice = input.nextDouble();
					if (itemPrice >= 1) {
						wrongPrice = false;
					}else {
						System.out.println("Invalid input: ");
						wrongPrice = true;
					}
					
				} catch (Exception e) {
					System.out.println("Enter only numerical characters: ");
					input.next();
				}
			}
			
			
		// Quantity
		int itemQuantity = 0;
		boolean wrongQuantity = true;
		
			while (wrongQuantity) {
				System.out.print("Quantity: ");
				try {
					itemQuantity = input.nextInt();
					if (itemQuantity >= 1) {
						wrongQuantity = false;
					}else {
						System.out.println("Invalid input: ");
						wrongQuantity = true;
					}
				} catch (Exception e) {
					System.out.println("Enter only numerical characters: ");
					input.next();
				}
			}
			
			
		// Type
		char itemType = 0;
		System.out.print("Type: ");
		itemType = input.next().toUpperCase().charAt(0);
		boolean wrongType = true;
			
			while (wrongType) {
				if (itemType == 'R' || itemType == 'M' || itemType == 'I' ) {
					wrongType = false;
				}else {
					System.out.println("Invalid type. Please enter RAW, MANUFACTURED or IMPORTED");
					System.out.print("Type: ");
					itemType = input.next().toUpperCase().charAt(0);
				}
			}
			
		ItemInformation item = new ItemInformation(itemName, itemPrice, itemQuantity, itemType); 
			
	// Calculate tax
		
		char type = item.getType();
		double price = item.getPrice();
		int quantity = item.getQuantity();
	
		
		
		double total = 0;
		double salesTax = 0;
		
		switch (type) {
		
		case 'R':
			salesTax = price * 0.125;
			total = (price * 1.125) * quantity;
			break;
			
		case 'M':
			final double twoPercent = (price * 1.125) * 0.02;
			salesTax = (price *0.125 ) + twoPercent;
			total = (price + salesTax) * quantity  ;
			break;
				
		case 'I':
			
			final double importDuty = price * 0.1;
			final double surchargeFivePercent = 0.05;
			double cost = price * 1.10;
			double surcharge = 0;
			
				if (cost <= 100 ) {
					surcharge = 5;
				}else if (cost > 100 && cost <= 200) {
					surcharge = 10;
				}else {
					surcharge = cost * surchargeFivePercent;
				}
				
				salesTax = importDuty + surcharge;
				total = (price +  salesTax ) * quantity;
			
			break;
	
		default:
			break;
		}
	
		ObtainPrice cost = new ObtainPrice(salesTax, total);

		System.out.println("Item: " + item.getName() + " Price: "+ item.getPrice() + " Tax: " + cost.getTax() + " Total: " + cost.getTotal());
		
	}
	
	
}
