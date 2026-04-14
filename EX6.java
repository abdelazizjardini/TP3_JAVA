class voiture {
    String marque;
    int vitesse;

    public voiture(String m, int v) {
        this.marque = m;
        this.vitesse = v;
    }

    void accelerer(int value) {
        if ((vitesse + value) > 240) {
            System.out.println("vous avez depasser la vitesse maximale");
            vitesse = 240;
        } else {
            vitesse += value;
            System.out.println("votre vitesse actuelle est : " + vitesse);
        }
    }

    void freiner(int value) {
        if ((vitesse - value) < 0) {
            vitesse = 0;
        } else {
            vitesse -= value;
        }
        System.out.println("votre vitesse actuelle est : " + vitesse);
    }
}

public class EX6 {
    public static void main(String[] args) {
        voiture v1 = new voiture("BMW", 100);

        v1.accelerer(50);
        v1.freiner(30);
        v1.freiner(150);
    }
}