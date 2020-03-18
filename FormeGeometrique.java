/**
 * FormeGeometrique
 */
abstract class FormeGeometrique {

    private double x;
    private double y;

    public FormeGeometrique(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void deplacer(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void afficherPosition() {
        System.out.println("(" + this.x + "; " + this.y + ")");
    }

    abstract double perimetre();
    abstract double surface();

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }
}