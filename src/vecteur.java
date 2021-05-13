public class vecteur {

    private int x_a;
    private int x_b;
    private int y_a;
    private int y_b;

    public vecteur (int x_a2, int y_a2, int x_b2, int y_b2){
        this.x_a=x_a2;
        this.x_b=x_b2;
        this.y_a=y_a2;
        this.y_b = y_b2;
    }

    public int getXA(){
        return this.x_a;
    }

    public void setXA(int new_value){
        this.x_a = new_value;
    }

    public String toString(){
        return "x_a = " + this.x_a;
    }

    public static void main(String[] args){
        vecteur v1 = new vecteur(1,2,3,4);
        vecteur v2 = new vecteur(5,6,7,8);
        v1 = v2;
        System.out.println(v1.x_a);
        System.out.println(v2.x_a);
        v1.x_a = 20;
        System.out.println(v1.x_a);
        System.out.println(v2.x_a);
        v2.x_a = 40;
        System.out.println(v1.x_a);
        System.out.println(v2.x_a);
    }
}
