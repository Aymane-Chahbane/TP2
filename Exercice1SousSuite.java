package exercice_1;

import java.util.Scanner;

public class Exercice1SousSuite {

	public static int SousSuit(int[] tab) {

	    int res = 0;
	    if (tab.length == 0)
	        return res;

	    int next =0;
	    for (int i = 0; i < tab.length; i++) {

	        if (next == 0) {
	            next = tab[i];  
	            res = 1;
	        } 
	        else if (tab[i] > next) {
	            next = tab[i];
	            res++;
	        } 
	        else if (tab[i] < next) {
	             
	            if (i + 1 < tab.length && tab[i] < tab[i + 1]) {
	                next = tab[i];
	            }
	        }
	    }

	    return res;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Combien de nombres ? ");
		int m = sc.nextInt();
		while (m>1000) {
			System.out.print("Vous douvez pas depasser 1000 nombre ");
			System.out.print("Veuillez donner un nombre inferieur ou egal 1000 !!!!");
			m = sc.nextInt();
		}
		int[] req = new int[m];
		for (int i = 0; i < m; i++) {
			System.out.print("Nombre " + (i + 1) + " : ");
			req[i] = sc.nextInt();
		}
		int res = SousSuit(req);
		System.out.print("Resultat : " + res);

	}

}
