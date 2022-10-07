/*class	Point
{	
    private	int	x,	y	;

    Point	(int	x,	int	y)
    {	
        this.x	=	x	;	this.y	=	y	;
    }

    public	void	affiche()
    {	
        System.out.println	("coordonnees	:	"	+	x	+	"	"	+	y	)	;
    }
}*/

class	Point	implements	Comparable	<Point>
{	
    private	int	x,	y	;
    
    Point	(int	x,	int	y)
    {	
        this.x	=	x	;	this.y	=	y	;
    }

    public	void	affiche()
    {	
        System.out.println	("coordonnees	:	"	+	x	+	"	"	+	y	)	;
    }

    public	int	compareTo	(Point	p)
    {	
        int	norme1	=	x	*	x	+	y	*	y	;
        int	norme2	=	p.x	*	p.x	+	p.y	*	p.y	;
        if	(norme1	==	norme2)	return	0	;
        if	(norme1	>	norme2)	return	1	;
        else	return	-1	;
    }
}

public	class	A161
{	
    public	static	void	main	(String	args[])
    {	
        Point	p1	=	new	Point	(0,	5)	;
        Point	p2	=	new	Point	(3,	1)	;
        Point	p3	=	new	Point	(0,	12)	;
        Point	p4	=	new	Point	(3,	5)	;
        Point	[]	tp	=	{p1,	p2,	p3,	p4}	;
        Point	maxp	=	max	(tp)	;
        System.out.println	("Point	maxi	:	")	;
        maxp.affiche()	;
    }

    static	<T	extends	Comparable	<T>	>	T	max	(T[]	valeurs)
    {	
        if	(valeurs	==	null)	return	null	;
        if	(valeurs.length	==	0)	return	null	;
        T	maxi	=	valeurs[0]	;
        for	(T	v	:	valeurs)	if	(v.compareTo(maxi)	>	0)	maxi	=	v	;
        return	maxi	;
    }
}