/**
 * Cercle
 */
public class Cercle extends FormeGeometrique implements Dessinable {

    private double rayon;
    
    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public double perimetre() {
        return Math.PI*2*this.rayon;
    }

    public double surface() {
        return Math.PI*Math.pow(this.rayon, 2);
    }

    public void dessiner(String couleur) {
        System.out.println("Rectangle, " + couleur);
    }
}