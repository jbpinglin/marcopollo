package projet1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MarcoPollo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// variable a vide
		int marco = 0;
		int pollo = 0;
		char reponse = 'O';

		// tant que reponse = oui
		boolean reponseIsOui = true;
		boolean reponseIsNo = false;
		while (reponseIsOui == true) {
			try {
				// initialisation de marco
				System.out.println("Set a Number for Marco !");
				marco = sc.nextInt();

				// trouver Marco
				boolean isNumber = false;
				// activation de la boucle
				while (isNumber == false) {

					try {
						System.out.println("Find  Marco!");
						pollo = sc.nextInt();
						isNumber = true;
					} catch (InputMismatchException e) {
						System.out.println("!! Valeur invalide !!");
						sc.nextLine();
					}
				}
				while (pollo != marco) {

					if (pollo > marco) {
						System.out.println("Less !");
						pollo = sc.nextInt();
					} else {
						System.out.println("More !");
						pollo = sc.nextInt();
					}
				}
				System.out.println("!!! Pollo !!!");

				while (reponseIsNo == false) {
					try {
						System.out.println("souhaitez vous recommencer ? (O/N)");
						reponse = sc.nextLine().charAt(0);

						if (reponse == 'O' || reponse == 'N') {

							if (reponse == 'N') {
								reponseIsNo = true;
								reponseIsOui = false;
							}

							if (reponse == 'O') {
								reponseIsNo = true;
							}
						} else {
							reponseIsNo = false;
							System.out.println("Syntax Error 2");
							sc.nextLine();
						}
					} catch (StringIndexOutOfBoundsException a) {
						System.out.println("!! Syntax error !!");
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("!! Valeur invalide !!");
			}
			sc.nextLine();

		}
		reponseIsOui = false;
		System.out.println("Merci d'avoir jouer");
		sc.close();
	}
}
