/**
 * TP4
 */
public class TP4 {

    static ListeRectangles liste = new ListeRectangles();

    public static void main(String[] args) {
        liste.ajouter(new Rectangle(0, 0, 4, 4));
        liste.ajouter(new Rectangle(4, 4, 6, 8));
        liste.ajouter(new Rectangle(-2, -1, 3, 2));

        liste.afficher();

        liste.trier();

        liste.afficher();

        System.out.println("Plus grand rectangle :");
        liste.obtenirIemeRectangle(0).dessiner("Jaune");
    }

}