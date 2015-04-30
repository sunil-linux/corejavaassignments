package module2.ass1;

public class HardwareProduct extends Product {

	//to store width,height dimension
	private short[] dimensions = new short[2];
	//no of hours
	private int batteryBackup;
	private Brand brand;
	
	public HardwareProduct() {
		super();
	
	}
	public HardwareProduct(int prodId, String prodName, int serialNo,short[] dimensions, int batteryBackup, Brand brand) {
		super(prodId, prodName, serialNo);
		this.dimensions = dimensions;
		this.batteryBackup = batteryBackup;
		this.brand = brand;
		
	}
	
	@Override
	public String toString() {
		
		System.out.print(super.toString());
		
		StringBuilder sb = new StringBuilder();
		sb.append(",Battery :" + batteryBackup+"H");
		sb.append(", Brand :" + brand.toString());
		sb.append(", Dimensions(w,h) : {" + dimensions[0]+","+dimensions[1]+"}]");
		return sb.toString();
	}
	
}
