class	PointN
{	
    public	PointN	(int	x,	int	y,	String	nom)
    {	
        this.x=x	;	this.y=y	;	this.nom	=nom	;
    }
    public	void	affiche()
    {	
        System.out.println	("Point	nomme	"	+	nom +	"	et	de	coordonnees	"	+	x	+	"	"	+	y)	;
    }

    public	String	toString()
    {	
        String	ch	=	"Je	suis	un	point	nomme	"	+	nom +	"	et	de	coordonnees	"	+	x	+	"	"	+	y	;
        return	ch	;
    }
    private	int	x,	y	;
    private	String	nom	;
}
