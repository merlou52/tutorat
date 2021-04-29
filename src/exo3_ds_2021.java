public class Portefeuille {
    double[] argent;
    String[] devises;

    public Portefeuille(double[] t, String[] d){
        this.argent = t;
        this.devises = d;
    }
    public void afficher(){
        System.out.print("Le portefeuille contient ");
        for(int i=0; i< this.argent.length; i++){
            System.out.print(this.argent[i]+" "+this.devises[i]+", ");
        }
        System.out.println();
    }

    public Portefeuille fusionnePortefeuille(Portefeuille p){
        double[] arg = new double[this.argent.length];
        String[] dev = new String[this.argent.length];

        for(int i=0; i<p.argent.length; i++){
            arg[i] = this.argent[i]+p.argent[i];
            dev[i] = this.devises[i];
        }

        Portefeuille resultat = new Portefeuille(arg, dev);

        return resultat;
    }

    public void echanger(double[][] taux, int monnaieVendue, int monnaieAchetee, double quantiteMonnaieAchetee){
        double taux_change = taux[monnaieAchetee][monnaieVendue];
        double prix_achat = quantiteMonnaieAchetee*taux_change;

        if(this.argent[monnaieVendue]>= prix_achat) {
            this.argent[monnaieVendue] -= prix_achat;
        }

        this.argent[monnaieAchetee] += quantiteMonnaieAchetee;
    }

    public void equivalent(double[][] taux, int dev){
        for(int i=0; i<this.argent.length; i++){
            if(i!=dev) {
                double taux_change = taux[dev][i];
                this.argent[dev] += taux_change * this.argent[i];
                this.argent[i] = 0;
            }
        }
        afficher();
    }

    public void argentFacile(double[][] taux, int monnaieDepart, int monnaieArrivee){
        double taux_change = taux[monnaieArrivee][monnaieDepart];
        double taux_change_inverse = taux[monnaieDepart][monnaieArrivee];

        if(taux_change*taux_change_inverse > 1){
            System.out.println("c'est interessant d'échanger "+this.devises[monnaieDepart]+" et des "+this.devises[monnaieArrivee]);
        }else{
            System.out.println("c'est pas interessant");
        }
    }

    public static void main(String[] args){
        double[][] taux = {{1, 0.8, 0.75},{1.2,1,0.9},{1.34,1.05,1}};
    }

}
