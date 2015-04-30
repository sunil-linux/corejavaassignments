package module2.ass1;

public abstract class Product {

	private int prodId;
	private String prodName;
	private int serialNo;

	public Product() {
		super();
	}

	public Product(int prodId, String prodName, int serialNo) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.serialNo = serialNo;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Product : [pid :" + prodId);
		sb.append(", prodName :" + prodName);
		sb.append(", serialNo : " + serialNo);
		return sb.toString();
	}

}
