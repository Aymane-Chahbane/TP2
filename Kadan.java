package exercice_6;

public class Kadan {
	public static int sommeMax(int[] n) {
		int current = n[0];
		int max =  n[0];
		for (int i = 0; i < n.length; i++) {
			current = Math.max(n[i], current + n[i]);
			max = Math.max(current, max);
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { -1,-3, 2, 1,-5 };

		int res = sommeMax(n);

		System.out.println("Somme maximale = " + res);
	}

}
