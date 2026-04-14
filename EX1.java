    import java.lang.Math;
    class Point {
    double x, y, distance;

    public Point() {
        this.x = 1;
        this.y = 2;
    }


    public Point(double X, double Y) {
        this.x = X;
        this.y = Y;
    }

    public void afficher() {
        System.out.println("L'abscisse: est " + x + " et  L'ordonnée: est " + y);
    }

    public void deplacement(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    
    public double calcul() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    
    public double diff(double x1,double y1 ,double x2,double y2) {
        return Math.sqrt(
            Math.pow(x1 - x2, 2) +
            Math.pow(y1 - y2, 2)
        );
    }}


public class EX1 {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3=new Point(4,5);
        // ici je vais faire l'appel using le point p1 construite sans argument 
        p1.afficher();
        //ces deux la avec argument
        p2.afficher();
        p3.afficher();
        // deplacement
        p1.deplacement(1,1);
        p2.deplacement(1,1);
        p3.deplacement(1,1);
        System.out.println("apres deplacement");
        p1.afficher();
        p2.afficher();
        p3.afficher();
        System.out.println("Distance a l'origine : ");
        System.out.println("*le point p1: "+p1.calcul());
        System.out.println("*le point p2: "+p2.calcul());
        System.out.println("*le point p3: "+p3.calcul());
        System.out.println("maintenent distance entre deux points : exemple le point 2 et 3");
        System.out.println("la distance est :" + p1.diff(p1.x,p1.y,p2.x,p2.y));
        

        
}}