package module2.ass1;

import java.util.Scanner;

public class ShopTest {

	public static void main(String[] args) {

		Product prod1 = new SoftwareProduct(1, "tally", 897845, "Windows", 300000, "hjsk5235snam");
		Product prod2 = new SoftwareProduct(2, "office", 6897845, "Linux", 400000, "iojsk7835snam");
		Product prod3 = new HardwareProduct(3, "laptop", 9036893, new short[]{14,14}, 4, Brand.SONY);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of products to be add:");
		int N = scanner.nextInt();
		
		Shop shop = new RetailShop(N);
		
		//1. Add Products
		shop.addProduct(prod1);
		shop.addProduct(prod2);
		shop.addProduct(prod3);
		
		
		
		//2. Get the product by name
		
		Product prod = shop.getProductInfo("tally");
		System.out.println(prod);
		
		
		System.out.println("\n\n********** All Products Information ***********\n");
		Product[] products = shop.getAllProducts();
		
		for(Product p : products)
			System.out.println(p);
		
		scanner.close();
		
		
	}

}
