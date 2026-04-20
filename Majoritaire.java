package exercice_7;

public class Majoritaire {

	public static int getMaj(int[] n) {
		int res = -1;
		double getDemiSize = (double) n.length / 2;
		int count = 0;
		int maxCount = 0;
		int currentMax = 0;
		int current = 0;
		System.out.println(getDemiSize);
		for (int i = 0; i < n.length; i++) {
			current = n[i];
			count = 0;
			for (int j = 0; j < n.length; j++) {
				if (current == n[j]) {
					count++;

				}
			}
			if (count > maxCount) {
				maxCount = count;
				currentMax = current;
			}
		}
		System.out.println("maxCount  " + maxCount);
		if (maxCount > getDemiSize) {
			res = currentMax;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = new int[] { 1, 2, 3, 4 };
		int a = getMaj(tab);
		System.out.println(a);
	}

}
