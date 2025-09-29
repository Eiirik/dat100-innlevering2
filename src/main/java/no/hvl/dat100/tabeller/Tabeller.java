package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
        for (int i=0; i<tabell.length; i++){
            System.out.print(i + " ");
        }
	}

	// b)
	public static String tilStreng(int[] tabell) {
        String tekst = "[";
        for (int j=0; j<tabell.length; j++){
            if (j < tabell.length - 1){
                tekst += tabell[j] + ",";
            }
            else {
                tekst += tabell[j];
            }
        }
        tekst += "]";
		return tekst;
	}

	// c)
	public static int summer(int[] tabell) {
        int sum = 0;
        for (int k=0; k<tabell.length; k++){
            sum += tabell[k];
        }
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        for (int verdi : tabell){
            if (verdi == tall){
                return true;
            }
        }
        return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

        for (int i=0; i<tabell.length; i++){
            if (tabell[i] == tall){
                return i;
            }
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
        int[] nyTab = new int[tabell.length];
        for (int i = nyTab.length - 1; i>=0; i--){
            nyTab[i] = tabell[tabell.length - 1 - i];
        }
        return nyTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) {
                return false;
            }
        }
        return true;

    }

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] nyTab = new int[tabell1.length + tabell2.length];

        for (int i=0; i<tabell1.length; i++){
            nyTab[i] = tabell1[i];
        }
        for (int j=0; j<tabell2.length; j++){
            nyTab[tabell1.length + j] = tabell2[j];
        }
        return nyTab;
	}
}
