package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO2 {

	public static void main(String[] args) {

		// Les inn bruttoinntekt

		String bruttoinntekt = JOptionPane.showInputDialog("Angi bruttoinntekt: ");

		// Bruk parseInt til å konvertere string til int

		int bruttoint = java.lang.Integer.parseInt(bruttoinntekt);
		int trinn0 = 208050;
		int trinn1 = 292850;
		int trinn2 = 670000;
		int trinn3 = 937900;
		int trinn4 = 1350000;
		int trinn5 = 1350001;

		/*
		 * Sjekk bruttoint opp mot trinnskatt hvis bruttoint > 208 050 kr. Bruke if-else
		 * 
		 */

		if (bruttoint <= trinn0) {
			System.out.print("Du skal ikke betale trinnskatt.");
		} else if (bruttoint <= trinn1) {
			double skatt1 = bruttoint - trinn0;
			double trinnSkatt1 = (0.017 * skatt1);
			int intSkatt1 = (int) trinnSkatt1; // typetvang til int.
			System.out.print("Du skal betale " + intSkatt1 + " kr i trinnskatt.");
		} else if (bruttoint <= trinn2) {
			double skatt2 = bruttoint - trinn1;
			double trinnskatt2 = (trinn1 * 0.017) + (0.04 * skatt2);
			int intSkatt2 = (int) trinnskatt2;
			System.out.print("Du skal betale " + intSkatt2 + " kr i trinnskatt.");
		} else if (bruttoint <= trinn3) {
			double skatt3 = bruttoint - trinn2;
			double trinnskatt3 = (trinn2 * 0.04) + (0.136 * skatt3);
			int intSkatt3 = (int) trinnskatt3;
			System.out.print("Du skal betale " + intSkatt3 + " kr i trinnskatt.");
		} else if (bruttoint <= trinn4) {
			double skatt4 = bruttoint - trinn3;
			double trinnskatt4 = (trinn3 * 0.136) + (0.166 * skatt4);
			int intSkatt4 = (int) trinnskatt4;
			System.out.print("Du skal betale " + intSkatt4 + " kr i trinnskatt.");
		} else if (bruttoint >= trinn5) {
			double skatt5 = bruttoint - trinn4;
			double trinnskatt5 = (trinn4 * 0.166) + (0.176 * skatt5);
			int intSkatt5 = (int) trinnskatt5;
			System.out.print("Du skal betale " + intSkatt5 + " kr i trinnskatt.");

		}
	}

}
