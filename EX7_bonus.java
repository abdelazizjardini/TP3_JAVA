import java.util.Scanner;

class nb_secret {
    int secret;
    int tentatives = 0;

    public nb_secret() {
        this.secret = (int)(Math.random() * 11);
    }

    public void deviner() {
        Scanner sc = new Scanner(System.in);
        int x;

        do {
            System.out.print("Entrer un nombre : ");
            x = sc.nextInt();
            tentatives++;

            if (x < secret) {
                System.out.println("Plus grand");
            } else if (x > secret) {
                System.out.println("Plus petit");
            } else {
                System.out.println("Bravo !");
            }

        } while (x != secret);

        System.out.println("Score (tentatives) : " + tentatives);
    }
}

public class EX7_bonus {
    public static void main(String[] args) {
        nb_secret jeu = new nb_secret();
        jeu.deviner();
    }
}