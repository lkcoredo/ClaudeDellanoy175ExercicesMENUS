//Priorités	des	opérateurs
//arithmétiques	et	parenthèses

class	Point1
{	
    /**
     *
     */
    private static final int _100 = 100;

    /**
     * @param args
     */
    public static void main (String	args[])
    {	
        int a = 0;
        byte	b1	=	10,	b2	=	20	;
        short	p	=	200	;
        int	n	=	500	;
        long	q	=	_100	;
        float	x	=	2.5f	;
        double	y	=	5.25	;
        System.out.println(y);

        a = b1+b2;	
        System.out.println(a);										//	1
        a = p+b1;
        System.out.println(a);															//	2
        a = b1*b2;
        System.out.println(a);														//	3
        long m = q+p*(b1+b2);	
        System.out.println(m);						//	4
        float f = x+q*n;
        System.out.println(f);														//	5
        f = b1*q/x;	
        System.out.println(f);												//	6
        double d = b1*q*2./x;	
        System.out.println(d);									//	7
        f = b1*q*2.f/x;		
        System.out.println(f);							//	8												//	expression	6
    }
}


    

// En	Java,	le	transfert	des	arguments	à	une	méthode	se	 fait	toujours	par	valeur.	Mais	la
// valeur	d’une	variable	de	type	objet	est	sa	référence.	D’où	les	résultats	: