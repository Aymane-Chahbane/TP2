package exercice_9;

public class SommeDiagonale {
	public static int getDifference(int[][] mat) {

		int n = mat.length;
		int sumPrin = 0;
		int sumSecond = 0;

		for (int i = 0; i < n; i++) {
			sumPrin += mat[i][i];
			sumSecond += mat[i][n - 1 - i];
		}

		System.out.println("Somme principale = " + sumPrin);
		System.out.println("Somme secondaire = " + sumSecond);

		return Math.abs(sumPrin - sumSecond);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int result = getDifference(mat);
		System.out.println("Différence absolue = " + result);
	}

}
