package module2.ass1;

public class SoftwareProduct extends Product {

	private String os;
	private long memory;
	private String lieceneKey;
	
	
	public SoftwareProduct() {
		super();	
	}
	
	public SoftwareProduct(int prodId, String prodName, int serialNo,String os, long memory,String lieceneKey) {
		super(prodId, prodName, serialNo);
		this.os = os;
		this.memory = memory;
		this.lieceneKey = lieceneKey;
	}
	
	@Override
	public String toString() {
		
		System.out.print(super.toString());
		
		StringBuilder sb = new StringBuilder();
		sb.append(",os :" + os);
		sb.append(", memory :" + memory);
		sb.append(", lieceneKey : " + lieceneKey+"]");
		return sb.toString();
	}
	

}
