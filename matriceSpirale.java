package exercice_3;

public class matriceSpirale {
	public static int[][] matrice(int n) {
		int[][] res = new int[n][n];
		int start = 1;
		int ligne1 = 0, ligne = 0,last=0;
		while (ligne1 < n) {
			ligne=0;
			 // gauche --> droit
			for (int i = 0; i < n; i++) {
				if (res[ligne1][i] == 0) {
					res[ligne1][i] = start;
					start++;

				}
			}
			// top --> bottom
			last=n-ligne1;
			for (int j = 0; j < last; j++) {
				if (res[ligne][last - 1] == 0) {
					res[ligne][last - 1] = start;
					start++;
					ligne++;
				} else
					ligne++;
			}
			// droit --> gauche
			for (int i = n - 1; i >= 0; i--) {
				if (res[ligne - 1][i] == 0) {
					res[ligne - 1][i] = start;
					start++;
				}
			}
			// bottom --> top
			for (int j = n - 1; j >= 0; j--) {
				if (res[j][0] == 0) {
					res[j][0] = start;
					start++;
					ligne++;
				} else
					ligne++;
			}
			ligne1++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[][] res = matrice(n);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
