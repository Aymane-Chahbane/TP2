package exercice_8;

import java.util.HashSet;
import java.util.Scanner;

public class NombresAbsent {

	public static HashSet<Integer> getAbsent(int[] tab, int taille) {
		int[] res;
		HashSet<Integer> present = new HashSet<>();
		HashSet<Integer> absent = new HashSet<>();
		for (int num : tab) {
			present.add(num);
		}
		System.out.print("Nombres absents : ");
		for (int i = 1; i <= taille; i++) {
			if (!present.contains(i)) {
				absent.add(i);
			}
		}

		return absent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Combien de nombres ? ");
		int m = sc.nextInt();
		System.out.print("donner le  ");
		int[] req = new int[m];
		for (int i = 0; i < m; i++) {
			System.out.print(" Nbr" + (i + 1) + " : ");
			req[i] = sc.nextInt();
		}
		System.out.println(getAbsent(req, m));
	}

}
