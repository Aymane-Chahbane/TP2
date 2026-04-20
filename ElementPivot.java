package exercice_2;

public class ElementPivot {

	public static int getElementPivot(int[] tab) {
		int res = -1, check = 0;
		boolean isPivotGauch = true;
		if (tab.length == 0)// verifier vide tab
			return res;
		for (int i = 1; i < tab.length; i++) {
			isPivotGauch = true;
			// partie gauche verification
			for (int j = i; j < i; j--) {
				if (j < 0)
					break;

				if (tab[j] <= tab[i] && j != i) {
					res = tab[i];
				} else if (tab[j] > tab[i]) {
					isPivotGauch = false;
					break;
				}
			}
			// partie droit verification
			int lst = tab.length - i;

			if (isPivotGauch)
				for (int j = i; j < tab.length; j++) {

					if (tab[j] >= tab[i] && j != i) {
						res = tab[i];
					}

				}

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 2, 4, 3, 5, 6 };
		int res = getElementPivot(data);
		System.out.println(res);
	}

}
