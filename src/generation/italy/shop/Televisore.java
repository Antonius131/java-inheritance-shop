package generation.italy.shop;

public class Televisore extends Prodotto{

	private int length;
	private int height;
	private boolean isSmart;
	
	public Televisore(int code, String name, String brand, int price, int iva,int length, int height, boolean isSmart) {
		
		super(code, name, brand, price, iva);
		this.length = length;
		this.height = height;
		this.isSmart = isSmart;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
				+ "\nLunghezza: " + length + "cm"
				+ "\nAltezza: " + height + "cm"
				+ "\nSmart: " + isSmart;
	}
}
