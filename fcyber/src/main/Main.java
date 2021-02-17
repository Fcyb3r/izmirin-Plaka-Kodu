package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner giris = new Scanner(System.in)) {
			// Bizim yazdığımız
			int izmirPlakaKodu = 35;
			int girilenPlakaKodu;

			// soruyu yazdıralım
			System.out.println("Izmirin plaka kodu ne?");
			girilenPlakaKodu = giris.nextInt();
			if (girilenPlakaKodu == izmirPlakaKodu) {
				System.out.println("|plaka doğru|");

			} else {

				System.out.println("|plaka yanlış|");

			}
		}

	}

}
