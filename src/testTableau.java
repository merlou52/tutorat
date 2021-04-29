public class testTableau {
    public static void main(String[] args){
        int[][] t1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] t2;
        affiche(t1);
        t2 = t1;
        affiche(t2);
        int[][] t3 = new int[3][];

    }

    public static void affiche(int[][] tab){
        for(int i=0; i< tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
