import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.*	;
public class A172
{	
    public static void main (String	args[])
    {	
        int [] ints =
        {
            1, 6, 9, 19
        };

        Point [] points =
        {
            new Point(2, 5),
            new Point(1, 2),
            new Point(1, 2),
            new Point(1, 2)
        };

        System.out.println();
        System.out.println("Méthode #1");
        IntStream.of(ints).forEach(xx -> System.out.println(xx));
        
        System.out.println("Méthode #2");
        IntStream.of(ints).forEach(System.out::println);

        afficheListe(Point::affiche);
        //Référence à une méthode statique nomClasse::nomMethodeStatique String::valueOf

        //Référence à une méthode sur une instance objet::nomMethode personne::toString

        //Référence à une méthode d'un objet arbitraire d'un type donné nomClasse::nomMethode Object::toString

        //Référence à un constructeur nomClasse::new Personne::new

        int	[]	tab	=	{	3,	5,	-3,	8,	12,	4,	7,	4,	8,	3	}	;
        long	 nb	 =	 IntStream.of(tab).filter(xx->xx >0).count()	;
        System.out.println	("nb	=	"	+	nb)	;
        IntStream.of(tab).filter(xx	 ->	 xx	 >3).sorted().forEach(xx	->	System.out.print	(xx	+	"	"))	;
        System.out.println();
        IntStream.of(tab).filter(xx	 ->	 xx >3).sorted().distinct()	.forEach(xx	->	System.out.print	(xx	+	"	"))	;
        int	 s	 =IntStream.of(tab).map(xx	 ->
        Math.abs(xx)).map(xx	->	xx	*	xx).sum()	;
        System.out.println	("\nresultat	=	"	+	s)	;
        ArrayList<Point>	l	=	new	ArrayList<Point>()	;

        for(Point t : points) { l.add(t); }

        System.out.println("traitementListAvecStream : ");
        traitementListAvecStream(l, ee -> ee.getX() > 0, Comparator.comparing(Point::getX), Point::affiche);

        // REPERTOIRE

        Personne[]	tab_personne	=	{	new	Personne	("thibault",	"Rougier",	2001),
        new	Personne	("thomas",	"Niesseron",	1987),
        new	Personne	("thifaine",	"Mitenne",	1959),
        new	Personne	("maxime",	"Forest",	1995),
        new	Personne	("jules",	"Forest",	1995)	};

        System.out.println();
        System.out.println("traitementListPersonne : ");

        ArrayList<Personne> a = new ArrayList<Personne>();
        for(Personne p : tab_personne) { a.add(p);}
        traitementListPersonne(a, ee -> ee.getAnnee() > 1985, Comparator.comparing(Personne::getAnnee), Personne::affiche);
        System.out.println();
        traitementListPersonne(a, ee -> ee.getAnnee() < 2000, Comparator.comparing(Personne::getNom), Personne::affiche);
        //long nb = IntStream.of(a).filter(ee -> ee.getAnnee() < 2000).count();
        //long	 nb	 =	 IntStream.of(tab).filter(xx	 ->	 xx>0).count()	;


        Stream.of(tab_personne)
        .filter(pp	->	pp.getAnnee()	>	1985)
        .forEach(pp	->	System.out.print	(pp.getPrenom()	+	",	"))	;

        long	nombre	=	Stream.of(tab_personne)
        .filter(pp	->	pp.getAnnee()	<	2000)
        .sorted(Comparator.comparing(Personne::getNom))
        .peek(pp	->	System.out.print	(pp.getNom()	+	"	"))
        .count()	;

        System.out.println	("\n	Ils	sont	"+nombre)	;
        System.out.println	("---	Tous	tries	sur	nom	+	prenom	:	")	;

        Stream.of(tab_personne)
        .sorted(Comparator.comparing(pp	->	pp.getNom()	+	pp.getPrenom()))
        .forEach(pp	->	System.out.print	("("	+	pp.getNom()	+	",	" +	pp.getPrenom()	+")	"))	;

        List<Personne>	liste	=	Arrays.asList(tab_personne)	;

        //	 utilisation	 d'un	 Stream<Personne>	 transforme	 par	 map	 en IntStream
        OptionalInt	anneeJeune	=	liste.stream().mapToInt(pp	->	pp.getAnnee()).max()	;
        if	(anneeJeune.isPresent()) System.out.println	("---	Methode	1	-	Le	plus	jeune	est	ne	en	:"+	anneeJeune.getAsInt())	;
        else	System.out.println	("---	Liste	vide")	;

        //	recherche	de	min	sur	un	Stream<Personne>
        Optional<Personne>	personneJeune = liste.stream().max(Comparator.comparing(Personne::getAnnee))	;
        if	(personneJeune.isPresent())
        {	
            Personne	pj	=	personneJeune.get();
            System.out.println	("---	Methode	2	-	Le	plus	jeune	est	:	"
             +	 pj.getNom()	 +	 "	 "	 +	 pj.getPrenom()	 +	 "	 "	 + pj.getAnnee())	;
        }
        else	System.out.println	("---	Liste	vide")	;

        // REDUCE
    
        final	int	NVALEURS	=	200	;
        final	double	EPS	=	1e-2	;

        double	 produit1	 =	 DoubleStream.generate	 (() ->
        (
            Math.random()+0.5))
            .limit(NVALEURS)
            .peek(xx	->	{	if	(xx	>	1-EPS	&&	xx	<	1+EPS)
            System.out.print	(xx	+	"	");
        }).reduce(1,	(xx,	yy)	->	xx	*	yy	);

        System.out.println	("\nProduit	1	:	"	+	produit1);

        DoubleStream	produit2	=	DoubleStream.generate	(()	-> 
            2*Math.random())
            .filter	(xx	->	xx>0.5	&&	xx	<1.5)
            .limit(NVALEURS)
            .peek(xx	->	{	if	(xx	>	1-EPS	&&	xx	<	1+EPS)
            System.out.print	(xx	+	"	");
        }); // Trop grand nombre : java.util.stream.DoublePipeline$8@6d8a00e3

        System.out.println	("\nProduit	2	:	"	+	produit2.reduce(1, (xx,	yy)	->	xx	*	yy));
        

        // COLLECTOR

            Point[]	 tabPoints	 =	 
            {	 
                new	 Point(2,	 4),
                new	 Point(3,	 8),
                new Point(1,	3),
                new	Point(-2,	4),	
                new	Point(3,	8),	
                new	Point(1,3)
            }	;

            Set<Point>	ens	=	Stream.of(tabPoints).filter(xx	->	xx.getX()>0).collect(Collectors.toSet())	;
            
            System.out.print("Ensemble	:	")	;

            ens.forEach	(pp	->	System.out.print	("["+pp.getX()+",	"
                +	pp.getY()	+	"]	"))	;

            Integer	[]	tabTAB	=	{	2,	15,	-3,	2,	-5,	23,	-8,	12	}	;

            List<Point>	listeL	=	Stream.of(tabTAB).map(xx	->	new	Point	(xx,	2*xx))
            .collect(Collectors.toList())	;
            
            System.out.print("\nListe	:	")	;
            
            listeL.forEach	 (pp	 ->	 System.out.print	 ("["+pp.getX()+","+pp.getY()+"]	"))	;
            
            String	[]	mots	=	
            {
                "bonjour",	"hello",	"buongiorno",	"hi",	"chao",
            "bom	dia",	"guten	tag"	
            }	;

            String	 mots_longs	 = Stream.of(mots).collect(Collectors.joining("|"))	;

            System.out.println	("\nchaine	des	mots	longs	:	"+mots_longs)	;

            Map	<String,	List<String>>	map	=	Stream.of(mots)
                .filter(xx	->	xx.length()>4)
                .collect(Collectors.groupingBy(xx	->(xx.substring(0,1))))	;
                
            System.out.println	("MAP:	"+map)	;
    
    }

    private static void traitementListPersonne(ArrayList<Personne> tab_personne, Predicate<Personne> selec, Comparator<Personne> comp, Consumer<Personne> aff) {
        tab_personne.stream().filter(selec).sorted(comp).forEach(aff);
    }

    private static void afficheListe(Consumer<Point> object) {
        Point t = new Point(4, 2);
        object.accept(t);
        
    }

    private static void traitementListAvecStream
    (   ArrayList<Point> l, 
        Predicate<Point>	selec, 
        Comparator<Point>	comp,
        Consumer<Point>	aff)
    {
        l.stream().filter(selec).sorted(comp).forEach(aff);
    }


}

class Point {

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x ; }
    public int getY() {return y ; }

    public void affiche() {
        System.out.println(x);
        System.out.println(y);
    }

    private int x;
    private int y;

}

class	Personne
{	
        public	Personne	(String	prenom,	String	nom,	int	annee)
        {	 
            this.nom=nom;
            this.prenom=prenom;
            annee_naissance=annee;
        }

        public void affiche() {
            System.out.println(this.getNom());
            System.out.println(this.getPrenom());
            System.out.println(this.getAnnee());
        }

        public	String	getNom()	{	return	nom	;	}
        public	String	getPrenom()	{	return	prenom	;	}
        public	int	getAnnee()	{	return	annee_naissance	;	}
        private	String	nom,	prenom	;
        private	int	annee_naissance	;
}
