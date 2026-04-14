class Etudiant {
    int[] cne;
    double note;

    public Etudiant(int[] cne, double note) {
        this.cne = cne;
        this.note = note;
    }

    public boolean estAdmis() {
        return note >= 12;
    }

    public String toString() {
        String cneStr = "";
        for (int i = 0; i < cne.length; i++) {
            cneStr += cne[i];
        }
        return "CNE: " + cneStr + " Note: " + note + " Admis: " + estAdmis();
    }
}

public class EX3 {
    public static void main(String[] args) {
        int[] cne = {1, 2, 3, 4, 5};
        Etudiant e = new Etudiant(cne, 13.5);

        System.out.println(e.toString());
    }
}