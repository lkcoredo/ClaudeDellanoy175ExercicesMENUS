
public class A159 {
    public static void main(String[] args) {
        C<Double> c = new C<Double>();
        D<Integer> d = new D<Integer>();
        E<String, Integer> e = new E<String, Integer>();
        F<Integer> f = new F<Integer>();
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}

class	C	<T>	{		}

class	D<T>	extends	C<T>	{		}	/*															définition	1
*/
//	C<Object>,	C<Double>,	D<Object>,	D<Double>
class	E<T,	U>	extends	C<T>	{		}	
/*													définition	2
*/
//	C<Double>,	D(Double,	Integer),	D(Double,	Double),
//	D(Integer,	Double)
class	F<T	extends	Number>	extends	C<T>	{		}	/*			définition
3	*/
//	D<Double>,	C<Double>,	D<String>,	C<String>
/*	class	G<T>	extends	X	{		}																			définition	4
*/
//	D<Double>,	X,	D<String>
// class	H<T>	extends	C<String>	 //{ }																				définition	5

//	D<String>,	D<Integer>,	C<String>,	C<Integer>


/*
 * 1.	D<Double>	dérive	de	C<Double>
D<Object>	dérive	de	C<Object>
En	 revanche,	il	 n’existe	aucune	 relation	 d’héritage	entre	D<Double>	et	D<Object>,
pas	plus	qu’entre	C<Double>	et	C<Object>.
2.	D<Double,	Integer>	dérive	de	C<Double>
D<Double,	Double>	dérive	de	C<Double>
En	 revanche,	D<Integer,	Double>	et	C<Double>	 ne	 sont	 pas	liés	 par	 une	 relation
437
d’héritage.
3.	 D<Double>	 dérive	 de	 C<Double>	 car	 Double	 implémente	 bien	 l’interface
Number.	 En	 revanche,	 D<String>	 ne	 dérive	 pas	 de	 C<String>	 puisque	 String
n’implémente	pas	Number.
4.	D<Double>	dérive	de	X
D<String>	dérive	de	X
5.	D<String>	dérive	de	C<String>
D<Integer>	dérive	e	C<String>
En	revanche,	D<Integer>	ne	possède	aucun	lien	d’héritage	avec	C<Integer>.
 */