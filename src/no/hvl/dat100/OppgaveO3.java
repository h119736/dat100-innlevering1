package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {

		String heltall = showInputDialog(" Angi et heltall større enn 0 ");

		// konverter fra string til int

		int tall = java.lang.Integer.parseInt(heltall);
		Fakultet(tall);
	}

	// Utfør beregning og send informasjonen ut til bruker.

	private static void Fakultet(int tall) {
		int i = 1;
		int sum = 1;
		do {
			sum = sum * i;
			i++;
		} while (i <= tall);
		System.out.println("Fakultet av gitt tall er " + sum);

	}

}
