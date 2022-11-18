package generation.italy.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto camicia = new Prodotto(12345, "Camicia", "Levi's", 100, 21);
		Prodotto scarpa = new Prodotto(66226, "Scarpa", "Nike", 189, 21);
		
		System.out.println(camicia);
		System.out.println("--------------------");
		System.out.println(scarpa);
		
		System.out.println("--------------------");
		System.out.println("||||||||||||||||||||||");
		System.out.println("--------------------");
		
		Smartphone iPhone = new Smartphone(123654, "iPhone 14 Pro", "Apple", 1499, 20, "ASD654", 256);
		System.out.println(iPhone);
		
		System.out.println("--------------------");
		System.out.println("||||||||||||||||||||||");
		System.out.println("--------------------");
		
		Televisore tv = new Televisore(99999, "Samsung TV", "Samsung", 1250, 20, 50, 180, true);
		System.out.println(tv);
		
		System.out.println("--------------------");
		System.out.println("||||||||||||||||||||||");
		System.out.println("--------------------");
		
		Cuffie beats = new Cuffie(77777, "Beats Audio Pro", "Beats", 499, 20, "bianco", true);
		System.out.println(beats);
	}
}
