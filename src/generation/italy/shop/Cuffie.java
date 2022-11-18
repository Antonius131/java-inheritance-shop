package generation.italy.shop;

public class Cuffie extends Prodotto{

	private String color;
	private boolean isWireless;
	
	public Cuffie(int code, String name, String brand, int price, int iva, String color, boolean isWireless) {
		
		super(code, name, brand, price, iva);
		this.color = color;
		this.isWireless = isWireless;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}


	@Override
	public String toString() {
		
		return super.toString()
				+ "\nColore: " + color
				+ "\nWireless: " + isWireless;
	}
}
