package generation.italy.shop;

public class Smartphone extends Prodotto{

	private String imeiCode;
	private int memory;
	
	public Smartphone(int code, String name, String brand, int price, int iva, String imeiCode, int memory) {
		
		super(code, name, brand, price, iva);
		this.imeiCode = imeiCode;
		this.memory = memory;
	}
	
	public String getImeiCode() {
		
		return imeiCode;
	}
	
	public void setImeiCode(String imeiCode) {
		
		this.imeiCode = imeiCode;
	}
	
	public int getMemory() {
		
		return memory;
	}
	
	public void setMemory(int memory) {
		
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
				+ "\nimeiCode: " + imeiCode
				+ "\nMemoria: " + memory + "Gb";
	}
}
