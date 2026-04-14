class comptebancaire {
    int numero;
    double solde;

    public comptebancaire(int n, double s) {
        this.numero = n;
        this.solde = s;
    }

    public void deposer(double add_value) {
        solde += add_value;
    }

    public void retirer(double mins_value) {
        solde -= mins_value;
    }

    public void transferer(comptebancaire c, double montant) {
        this.solde -= montant;
        c.solde += montant;
    }

    public void afficher_solde() {
        System.out.println("Solde: " + solde);
    }
}

public class EX5 {
    public static void main(String[] args) {
        comptebancaire c1 = new comptebancaire(1234, 1000);
        comptebancaire c2 = new comptebancaire(4321, 500);

        c1.transferer(c2, 200);

        c1.afficher_solde();
        c2.afficher_solde();
    }
}