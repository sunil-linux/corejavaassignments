package module1.ass2;

/**
 * 
 * @author sunil_patil
 */

public class ProductKeyFinder {

	
	public static void main(String[] args) {

		String[] productNames = initProductNames();
		
		boolean isProductPresent = isPresent(productNames, "Sho");
		
		System.out.println("Product Available Status: "+isProductPresent);
	}

	static String[] initProductNames() {
		String[] products = { "Lenovo Laptop", "Adidas Shoes", "Raymond Shirt",
				"Lazer Printer" };
		return products;

	}

	static boolean isPresent(String[] productNames, String keyword) {

		for (String product : productNames) {
			if (product.indexOf(keyword) > -1)
				return true;
		}
		return false;

	}

}
