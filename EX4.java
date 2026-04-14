class complexe {
    int imaginaire;
    int reel;

    public complexe(int a, int b) {
        this.reel = a;
        this.imaginaire = b;
    }

    public complexe addition(complexe c) {
        return new complexe(this.reel + c.reel, this.imaginaire + c.imaginaire);
    }

    public complexe multiplication(complexe c) {
        int r = this.reel * c.reel - this.imaginaire * c.imaginaire;
        int i = this.reel * c.imaginaire + this.imaginaire * c.reel;
        return new complexe(r, i);
    }

    public void affichage() {
        System.out.println(this.reel + " + i" +this.imaginaire  );
    }
}

public class EX4 {
    public static void main(String[] args) {
        complexe c1 = new complexe(1, 2);
        complexe c2 = new complexe(3, 4);

        complexe somme = c1.addition(c2);
        complexe produit = c1.multiplication(c2);

        somme.affichage();
        produit.affichage();
    }
}