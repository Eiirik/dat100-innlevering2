package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        for (int rad[] : matrise){
            for (int verdi : rad){
                System.out.print(verdi + " ");
            }
            System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
        String tekst = "";
        for (int rad[] : matrise){
            for (int verdi : rad){
                tekst += verdi + " ";
            }
            tekst += "\n";
        }
		return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int[][] nyMatrise = new int[matrise.length][];

        for (int i=0; i<nyMatrise.length; i++){
            nyMatrise[i] = new int[matrise[i].length];

            for (int j=0; j<nyMatrise[i].length; j++){
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
