package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO1 {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			String tallTxt = showInputDialog("Angi sum for karakterer :");

			int poengsum = parseInt(tallTxt);
			int poengsumdivisjon = poengsum / 10;
			{

				if (poengsum > 100 || poengsum < 0) {
					System.out.println("Angi gyldig verdi!");
					i--;
				}
					else {

					switch (poengsumdivisjon) {
					case 10:
					case 9:
						System.out.println("A");
						break;
					case 8:
						System.out.println("B");
						break;
					case 7:
					case 6:
						System.out.println("C");
						break;
					case 5:
						System.out.println("D");
						break;
					case 4:
						System.out.println("E");
						break;
					case 3:
						System.out.println("F");
						break;
					case 2:
						System.out.println("F");
						break;
					case 1:
						System.out.println("F");
						break;
					case 0:
						System.out.println("F");
						break;

					default:
						System.out.println("Ugyldig verdi!");
						break;

					}

				}
			}

		}
	}

	}

