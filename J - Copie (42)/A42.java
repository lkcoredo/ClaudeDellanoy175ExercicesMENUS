class	Point
{	
    public	Point	(double	x,	double	y)	{	this.x	=	x	;	this.y	=	y	;	}
    public	void	deplace	(double	dx,	double	dy)	{	x	+=	dx	;	y	+=	dy	;	}
    public	double	abscisse	()	{	return	x	;	}
    public	double	ordonnee	()	{	return	y	;	}
    public	void	homothetie	(double	coef)	{	x	*=	coef	;	y	*=	coef	;	}

    public	void	rotation	(double	th)
    {	
        double	r	=	Math.sqrt	(x*x	+	y*y)	;
        double	t	=	Math.atan2(y,	x)	;
        t	+=	th	;
        x	=	r	*	Math.cos(t)	;
        y	=	r	=	Math.sin(t)	;
    }

    public	double	rho()	{	return	Math.sqrt	(x*x	+	y*y)	;	}
    public	double	theta	()	{	return	Math.atan2(y,	x)	;	}

    public	void	afficheCart	()
    {	 
        System.out.println	 ("Coordonnees	 cartesiennes	 =	 "	 +	 x	 +	 "	 "	 +	 y)	;
    }

    public	void	affichePol	()
    {	System.out.println	("Coordonnees	polaires	=	"	+	Math.sqrt	(x*x	+
    y*y)
        +	"	"	+	Math.atan2	(y,	x)	)	;
    }
    private	double	x	;					//	abscisse
    private	double	y	;					//	ordonnee
}

public	class	A42
{	
    public	static	void	main	(String	args[])
    {	
        Point	a	;
        a	=	new	Point(1,	1)	;	a.afficheCart()	;	a.affichePol()	;
        a.deplace(-1,	-1)	;	a.afficheCart()	;	a.affichePol()	;
        Point	b	=	new	Point(1,	0)	;	b.afficheCart()	;	b.affichePol()	;
        b.homothetie	(2)	;	b.afficheCart()	;	b.affichePol()	;
        b.rotation	(Math.PI)	;	b.afficheCart()	;	b.affichePol()	;
    }
}
