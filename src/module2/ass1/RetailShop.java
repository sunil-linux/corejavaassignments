package module2.ass1;

public class RetailShop implements Shop {

	static int prodCount = 0;

	private Product[] products;

	public RetailShop(int noOfProducts) {
		products = new Product[noOfProducts];
	}

	@Override
	public void addProduct(Product product) {
		products[prodCount++] = product;

	}

	@Override
	public Product getProductInfo(String pname) {
		
		for (Product prod : products) {
			if (prod.getProdName().equals(pname))
				return prod;
		}
		return null;
	}

	@Override
	public Product[] getAllProducts() {
		return products;
	}

}
