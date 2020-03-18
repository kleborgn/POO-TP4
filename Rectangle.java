/**
 * Rectangle
 */
public class Rectangle extends FormeGeometrique implements Dessinable, Comparable<Rectangle> {

    private double largeur;
    private double hauteur;

    public Rectangle(double x, double y, double largeur, double hauteur) {
        super(x, y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double perimetre() {
        return this.hauteur*2 + this.largeur*2;
    }

    public double surface() {
        return this.hauteur*this.largeur;
    }

    public void dessiner(String couleur) {
        System.out.println("Rectangle, " + couleur);
    }

    @Override
    public int compareTo(Rectangle r) {
        return (int) (this.surface() - r.surface());
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "; " + this.getY() + "), " + this.largeur + " x " + this.hauteur;
    }
}