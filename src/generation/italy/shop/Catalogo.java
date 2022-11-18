package generation.italy.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Prodotto[] catalog = new Prodotto[2];
		
		for (int i = 0; i<catalog.length; i++) {
			
			System.out.println("Crea un nuovo Prodotto: ");
			String createProduct = sc.nextLine().toLowerCase();
			
			System.out.println("Codice prodotto (5 cifre): ");
			int prdCode = sc.nextInt(); 
			
			System.out.println("Nome Prodotto: ");
			String prdName = sc.nextLine();
			
			System.out.println("Marca Prodotto: ");
			String prdBrand = sc.nextLine();
			
			System.out.println("Prezzo: ");
			int prdPrice = sc.nextInt();
			
			System.out.println("Iva: ");
			int prdIva = sc.nextInt();
		
			if (createProduct.equals("smartphone")) {
				
				System.out.println("Codice Imei: ");
				String prdImei = sc.nextLine();
				
				System.out.println("Memoria: ");
				int prdMemory = sc.nextInt();
				
				catalog[i] = new Smartphone(prdCode, prdName, prdBrand, prdPrice, prdIva, prdImei, prdMemory);
				
			} else if (createProduct.equals("televisore")) {
				
				System.out.println("Lunghezza: ");
				int prdLength = sc.nextInt();
				
				System.out.println("Altezza: ");
				int prdHeight = sc.nextInt();
				
				System.out.println("Smart: ");
				boolean isSmart = sc.nextBoolean();
				
				catalog[i] = new Televisore(prdCode, prdName, prdBrand, prdPrice, prdIva, prdLength, prdHeight, isSmart);
				
			} else if (createProduct.equals("cuffie")) {
				
				System.out.println("Colore: ");
				String prdColor= sc.nextLine();
				
				System.out.println("Wireless: ");
				boolean isWireless = sc.nextBoolean();
				
				catalog[i] = new Cuffie(prdCode, prdName, prdBrand, prdPrice, prdIva, prdColor, isWireless);
				
			} else {
				
				System.out.println("Non puoi inserire questo prodotto");
			}
		}
		
		sc.close();
		
		System.out.println(Arrays.toString(catalog));
		
	}
}
