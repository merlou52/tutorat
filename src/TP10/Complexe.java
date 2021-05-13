package TP10;

public class Complexe {

    private double re;
    private double im;
    private double rho;
    private double theta;

    public Complexe(double re, double im) {
        this.re = re;
        this.im = im;
        this.rho = 0;
        this.theta = 0;
        majPolaire(); //on calcule à l'initialisation du nb complexe ses coord polaires
    }

    public Complexe(){ //surchage si aucun argument (voir sujet)
        this.re = 0;
        this.im = 0;
        this.rho = 0;
        this.theta = 0;
    }

    public Complexe(double re){ //surcharge si un seul arg (voir sujet)
        this.re = re;
        this.im = 10 * Math.random();
        majPolaire();
    }

    public Complexe(double arg1, double arg2, boolean estPolaire){
        if(estPolaire){
            this.rho = arg1;
            this.theta = arg2;
            this.re = 0;
            this.im = 0;
            majCartesien();
        }else{
            this.re = arg1;
            this.im = arg2;
            this.rho = 0;
            this.theta = 0;
            majPolaire();
        }
    }

    public boolean estDansCadrant(int numCadrant) {
//        if ((this.re > 0) && (this.im > 0)) { //cas du début
//            return true;
//        } else {
//            return false;
//        }
        switch (numCadrant){
            case 1:
                return (this.re > 0) && (this.im > 0);

            case 2:
                return (this.re < 0) && (this.im > 0);

            case 3:
                return (this.re < 0) && (this.im < 0);

            case 4:
                return (this.re > 0) && (this.im < 0);
        }
        return false; //on retourne faux si le gars a saisi un numéro de cadrant erroné
    }

    public double getRho() {
        return this.rho;
    }

    public double getTheta() {
        return this.theta;
    }

    public String toString() {
        if (this.im < 0) {
            return this.re + " - i*" + Math.abs(this.im); //on prend la valeur absolue car le moins est déjà affiché
        } else {
            return this.re + " + i*" + this.im;
        }
    }

    public double getRe() {
        return this.re;
    }

    public double getIm() {
        return this.im;
    }

    private void majPolaire() {
        this.rho = Math.sqrt(Math.pow(this.re, 2) + Math.pow(this.im, 2));
        this.theta = Math.atan2(this.im, this.re);
    }

    private void majCartesien() {
        this.re = this.rho * Math.cos(this.theta);
        this.im = this.rho * Math.sin(this.theta);
    }

    public void setRe(double new_re){
        this.re = new_re;
        majPolaire(); //on recalcule les coord polaires du coup
    }

    public void setIm(double new_im){
        this.im = new_im;
        majPolaire();
    }

    public void setRho(double new_rho){
        this.rho = new_rho;
        majCartesien();
    }

    public  void setTheta(double new_theta){
        this.theta = new_theta;
        majCartesien();
    }

    public void sommeV1(Complexe z2){
        this.re += z2.getRe();
        this.im += z2.getIm();
        majPolaire();
    }

    public Complexe sommeV2(Complexe z2){
        Complexe res = new Complexe();

        res.setRe(this.re + z2.getRe());
        res.setIm(this.im + z2.getIm());
        res.majPolaire();

        return res;
    }

    public void multiplicationV1(Complexe z2){
        this.rho = this.rho * z2.getRho();
        this.theta = this.theta * z2.getTheta();
        majCartesien();
    }

    public Complexe multiplicationV2(Complexe z2){
        Complexe res = new Complexe();

        res.setTheta(this.theta * z2.getTheta());
        res.setRho(this.rho * z2.getRho());
        res.majCartesien();

        return res;
    }

    public boolean equals(Complexe z2){
        if((this.re == z2.getRe())&&(this.im == z2.getIm())){ //je pense pas qu'on ait besoin de tester rho et theta en plus
            return true;
        }else{
            return false;
        }
    }

}
