public class exo2_ds_2021 {
    public static int[] creationTab1D(int longueur){
        int[] resultat = new int[longueur];
        for(int i=0; i<resultat.length; i++){
            resultat[i]=i+1;
        }
        return resultat;
    }

    public static void echange(int pos1, int pos2, int[] tab){
        int temp = tab[pos1];
        tab[pos1]=tab[pos2];
        tab[pos2]=temp;
    }

    public static void melange(int[] tab){
        for(int n=0; n<tab.length; n++){
            int pos1 = (int)(Math.random()*tab.length);
            int pos2 = (int)(Math.random()*tab.length);
            echange(pos1,pos2,tab);
        }
    }

    public static int[][] creationTab2D(int[] tab){
        int[][] tab1 = new int[1][1]; //à finir

        return tab1;
    }

    public static boolean verifSommeLignes(int[][] tab){
        int somme = 0;
        int somme2 = 0;
        int compteur = 1;

        for (int i=0; i<tab.length; i++){
            for(int a=0; a<tab[i].length; a++){
                if(i==0){
                    somme += tab[0][a];
                }else{
                    somme2 += tab[i][a];
                }
            }
            if(somme==somme2){
                compteur ++;
            }
            somme2=0;
        }

        if(compteur==tab.length){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        int n=3;

    }
}
