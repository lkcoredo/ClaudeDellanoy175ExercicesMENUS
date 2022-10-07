import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

// Lambda : nom_method(tab, ee -> ee > 0);

public class A171ssc {
    public static void main(String[] args) {

        Point	[]	tab_points	=	{	
            new	Point(2,	5),	new	Point(-3,	4),
            new	Point(2,	3),	new	Point(6,	-3),
            new	Point(5,	5),	new	Point(-3,	-4),
            new	Point(4,	3),	new	Point(-6,	-3)	
        };

        Integer [] tab_ints = {
            1, 3, 5, 9
        };

        ArrayList<Point> l = new ArrayList<Point>();
        ArrayList<Integer> ints = new ArrayList<Integer>();

        for (Point p : tab_points) {
            l.add(p);
        }

        for (int d : tab_ints) {
            ints.add(d);
        }

        traiteListe(l, ee -> ee.getX()>0, Comparator.comparing(Point::getX), Point::affiche);
    }

    public static void traiteListe
    (
        ArrayList<Point>	liste,
        Predicate<Point>	selec,
        Comparator<Point>	comp,
        Consumer<Point>	aff
    )
    {
        ArrayList<Point> liste2 = new ArrayList<Point>();
        System.out.println("//Méthode2 avec lambdas avant traitement");
        liste.forEach(ee -> ee.affiche());

        liste.forEach(ee -> {
            
            if (selec.test(ee)) {
                liste2.add(ee);
            }
        });
        
        System.out.println("//Méthode2 avec lambdas (non sorted)");
        liste2.forEach(ee -> ee.affiche()); 

        liste2.sort(comp);
        
        System.out.println("//Méthode1 (sorted)");
        for (Point point : liste2) point.affiche();

        System.out.println("//Méthode Consumer<Point> aff avec methode accept (sorted)");
        liste2.forEach(ee	->	aff.accept(ee))	;
        //ArrayList<Point>	liste2	=	new	ArrayList	<Point>()	;
        //liste.forEach	(ee	->	
        //{	if	(selec.test(ee))	liste2.add(ee)	;	})	;
        //liste2.sort(comp);
        //liste2.forEach(ee	->	aff.accept(ee))	;
    } 
}

class Point { 
    // Considérer POINT (Point) comme un type à part entière comme pourrait l'être int
    // Du coup on peut faire un tableau de Point comme on fait un tableau de int
    // int [] tab_de_ints
    // Point [] tab_de_points
    // Puis le mettre dans un générique ArrayList<Point> comme on pourrait avoir une liste générique de int ArrayList<Integer>

    public Point (int x, int y) {
        this.x = x; this.y = y;
    }

    public int getX() {return x ; }
    public int getY() {return y ; }

    public void affiche() {
        System.out.println(
            " [ " + x + ", " + y + "] ");
    }
    private int x, y;
}
