import java.util.ArrayList;

class produit {
    int id;
    String nom;
    String description;
    double prix;
    int quantite;

    public produit(int id, String nom, String description, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }
}

class gestionProduit {
    ArrayList<produit> liste = new ArrayList<>();

    public void ajouterProd(produit p) {
        liste.add(p);
    }

    public void modifierProd(int id, String nom, String description, double prix, int quantite) {
        for (produit p : liste) {
            if (p.id == id) {
                p.nom = nom;
                p.description = description;
                p.prix = prix;
                p.quantite = quantite;
            }
        }
    }

    public void supprimerProd(int id) {
        liste.removeIf(p -> p.id == id);
    }

    public produit getProduitByID(int id) {
        for (produit p : liste) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }
}

public class EX7 {
    public static void main(String[] args) {
        gestionProduit gp = new gestionProduit();

        produit p1 = new produit(1, "Or", "rare", 1000, 5);
        produit p2 = new produit(2, "Zinc", "metal", 200, 10);

        gp.ajouterProd(p1);
        gp.ajouterProd(p2);

        gp.modifierProd(1, "Or", "pur", 1500, 3);

        produit p = gp.getProduitByID(1);
        if (p != null) {
            System.out.println(p.nom + " " + p.prix);
        }

        gp.supprimerProd(2);
    }
}