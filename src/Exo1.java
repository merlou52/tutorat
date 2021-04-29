public class Exo1 {
    public static void main(String[] args) {
        int n = 4;
        double[][] tab = new double[5][5];
        int[][] t1;
        int[][] t2;
        int[][] t3;
        t1 = tabNum1(n);
        affiche(t1);
        affiche2(t1);
        t2 = modif(t1);
        affiche(t2);
        t3 = t2;
        //affiche(t3);
        t1 = t2;
        if (t1 == t3) {
            System.out.println(" les   tableaux   sont   identiques ");
        } else {
            System.out.println(" les   tableaux   sont   differents ");
        }
        if (t1 == t2) {
            System.out.println(" les   tableaux   sont   identiques ");

        } else {
            System.out.println(" les   tableaux   sont   differents ");
        }

    }


    public static int[][] tabNum1(int n) {
        int[][] tab = new int[n][n];
        for (int j = 0; j < tab[0].length; j++) {
                for (int i = 0; i < tab.length; i++) {
                       tab[i][j] = 1 + n * i + j;

            }

        }
        return tab;

    }


    public static void affiche(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j] + "   ");

            }
            System.out.println();

        }
        System.out.println();

    }

    public static void affiche2(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if (j >= i) System.out.print(tab[i][j] + "   ");

            }

        }
        System.out.println();
        System.out.println();

    }

    public static int[][] modif(int[][] t) {
        int[][] tab = new int[t.length][t[0].length];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                tab[i][j] = t[i][j] % 10;

            }

        }
        return tab;

    }

}
