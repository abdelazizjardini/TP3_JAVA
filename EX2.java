
class Rectangle{
    double largeur,hauteur;
    public Rectangle(double l,double h){
        this.largeur=l;
        this.hauteur=h;
    }
    public double surface(){
        
        return  largeur*hauteur;
    }
    public double perimetre(){
    
        return (largeur+hauteur)*2;
    }


    }
    public class EX2{
        public static void main(String[]args){
            

            Rectangle r=new Rectangle(11,2);
            System.out.println("la surface est : " + r.surface());
            System.out.println("le perimetre est : "+ r.perimetre());



        }
    }
