class Point23 {
    public	Point23	(char	c,	double	x)			//	constructeur
    {	
        nom	=	c	;
        abs	=	x	;
    }

    public	void	affiche	()
    {	 
        System.out.println	 ("Point	 de	 nom	 "	 +	 nom	 +	 "	 d'abscisse	 "	 + abs)	;
    }

    public	void	translate	(double	dx)
    {	
        abs	+=	dx	;
    }
    private	char	nom	;					//	nom	du	point
    private	double	abs	;			//	abscisse	du	point
}

public class	TstPtAxe23
{	
    public	static	void	main	(String	args[])
    {	
        Point23	a	=	new	Point23	('C',	2.5)	;
        a.affiche()	;
        Point23	b	=	new	Point23	('D',	5.25)	;
        b.affiche()	;
        b.translate(2.25)	;
        b.affiche()	;
    }
}
