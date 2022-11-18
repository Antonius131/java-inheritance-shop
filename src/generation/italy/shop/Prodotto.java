package generation.italy.shop;

public class Prodotto {

	private int code;
	private String name;
	private String brand;
	private int price;
	private int iva;
	
	public Prodotto(int code, String name, String brand, int price, int iva) {
		
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.iva = iva;
	}
	
	public int getCode() {

		return code;
	}
	
	public String getName() {
	
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getBrand() {
	
		return brand;
	}
	
	public void setBrand(String brand) {
		
		this.brand = brand;
	}
	
	public int getPrice() {
	
		return price;
	}
	
	public void setPrice(int price) {
		
		this.price = price;
	}
	
	public int getIva() {
	
		return iva;
	}
	
	public void setIva(int iva) {
		
		this.iva = iva;
	}
	
	public int getTotal(int price, int iva) {
		
		this.price = price + ((price * iva) / 100); 
				
		return this.price;
	}
	
	@Override
	public String toString() {
		
		return name
			+ "\nCodice: " + code
			+ "\nMarca: " + brand
			+ "\nPrezzo: " + price + "€"
			+ "\nIva: " + iva + "%"
			+ "\nPrezzo + Iva: " + getTotal(price, iva) + "€";
	}
}
