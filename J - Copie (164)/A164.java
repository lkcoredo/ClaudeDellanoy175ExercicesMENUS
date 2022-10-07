import	java.util.*	;
public	class	A164
{	
    public	static	void	main	(String	args[])
    {	
        ArrayList	<Cercle>	liste	=	new	ArrayList	<Cercle>	()	;
        Cercle	c1	=	new	Cercle	(5,	3,	5.0)	;
        Cercle	c2	=	new	Cercle	(1,	9,	3.5)	;
        Cercle	c3	=	new	Cercle	(2,	9,	2.5)	;
        liste.add	(c1)	;	liste.add	(c2)	;	liste.add	(c3)	;
        //	tri	suivant	le	rayon	du	cercle
        Collections.sort	(liste,	new	Comparateur1	()	)	;
        System.out.println	("--	Cercles	tries	par	rayon	croissant")	;

        for	(Cercle	c	:	liste)	c.affiche	()	;
        //	tri	suivant	l'abcisse	du	cercle
        Collections.sort	(liste,	new	Comparator	<Cercle>	()
        {	
            public	int	compare	(Cercle	c1,	Cercle	c2)
            {	
                double	x1	=	c1.getX	()	;	double	x2	=	c2.getX	()	;
                if	(x1	<	x2)	return	-1	;
                else	if	(x1	==	x2)	return	0	;
                else	return	1	;
            }
        });
        System.out.println	("--	Cercles	tries	par	abscisse	croissante")	;
        for	(Cercle	c	:	liste)	c.affiche	()	;
    }
}

class	Comparateur1	implements	Comparator	<Cercle>
{	
    public	int	compare	(Cercle	c1,	Cercle	c2)
    {	
        double	r1	=	c1.getRayon	()	;
        double	r2	=	c2.getRayon	()	;
        if	(r1	<	r2	)	return	-1	;
        else	if	(	r1	==	r2)	return	0	;
        else	return	1	;
    }
}

class	Cercle
{	
    public	Cercle	(int	x,	int	y,	double	rayon)
    {	
        this.x	=	x	;	this.y	=	y	;	this.rayon	=	rayon	;	
    }

    public	void	affiche	()
    {	
        System.out.println	("Coordonnees	:	"	+	x	+	",	"	+	y
        +	"	;	rayon	:	"	+	rayon)	;
    }
    public	double	getRayon	()	{	return	rayon	;	}
    public	int	getX	()	{	return	x	;	}
    private	int	x,	y	;
    double	rayon	;
}

/*
 * Notez	 que	 l’écriture	 de	 la	 classe	 anonyme	 dans	 l’appel	 de	Collections.sort	 pourrait
également	utiliser	la	méthode	compareTo	de	la	classe	Integer,	moyennant	l’emploi	de
conversions	de	int	en	Integer	:
Collections.sort	(liste,	new	Comparator	<Cercle>	()
{	public	int	compare	(Cercle	c1,	Cercle	c2)
{	 return	 ((Integer)(c1.getX())).compareTo((Integer)
(c2.getX()))	;
}
}	)	;
Il	en	va	de	même	pour	la	méthode	compare	de	la	classe	Comparateur1	:
public	int	compare	(Cercle	c1,	Cercle	c2)
{	 return	 ((Double)(c1.getRayon())).compareTo((Double)
(c2.getRayon()))	;
}
 */