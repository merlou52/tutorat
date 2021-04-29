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
        int n = (int)Math.sqrt(tab[tab.length -1]);
        //on calcule la taille du tableau 2D en faisant la racine carrée du dernier élément du tableau (attention le dernier
        // élément ici c'est tab.length -1, car sinon on sort du tableau (1er élément =0 pas 1)

        int[][] res = new int[n][n];

        int compteur = 0; //j'utilise un compteur pour les indices du tab 1D ici mais ya certainement mieux

        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                res[i][j]=tab[compteur];
                compteur++; //on incrémente le compteur pour bouger l'indice du tab 1D
            }
        }
        return res;
    }

    public static boolean verifSommeLignes(int[][] tab){
        int somme = 0;
        int somme2 = 0;
        int compteur = 0;

        for (int i=0; i<tab.length; i++){
            for(int a=0; a<tab[i].length; a++){
                if(i==0){
                    somme += tab[0][a]; //somme première ligne
                }else{
                    somme2 += tab[i][a]; //somme des autres lignes
                }
            }
            if(somme==somme2){ //on compare puis incrémente un compteur si c'est égal
                compteur ++;
            }
            somme2=0;
        }

        if(compteur==tab.length-1){ //si compteur est égal au nombre de lignes -1 (car on a pas compté la 1ere ligne dans le process) alors c'est tout bon
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        int n=3;

        //1ere étape, créer un tableau 1D de longueur nxn pour ensuite pour faire notre matrice NxN
        int[] tab1d = creationTab1D(n*n);

        //2e étape on mélange le tableau 1D pour avoir le caractère 'aléatoire'
        melange(tab1d);

        //3e étape, on fait notre tableau 2D
        int[][] tab2d = creationTab2D(tab1d);

    }
}
