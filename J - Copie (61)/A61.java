class	Point
{	 
    public	 void	 setPoint	 (int	 x,	 int	 y)	 {	 this.x	 =	 x	 ;	 this.y	 = y	;	}
    public	void	deplace	(int	dx,	int	dy)	{	x	+=	dx	;	y	+=	dy	;	}
    public	void	affCoord	()
    {	
        System.out.println	("Coordonnees	:	"	+	x	+	"	"	+	y)	;
    }
    private	int	x,	y	;
}

class	PointNom	extends	Point
{	
    public	void	setPointNom	(int	x,	int	y,	char	nom)
    {	
        setPoint	(x,	y)	;
        this.nom	=	nom	;
    }

    public	void	setNom(char	nom)
    {	
        this.nom	=	nom	;
    }

    public	void	affCoordNom()
    {	
        System.out.print	("Point	de	nom	"	+	nom	+	"	")	;
        affCoord()	;
    }
    private	char	nom	;
}

public	class	A61
{	
    public	static	void	main	(String	args[])
    {	
        Point	p	=	new	Point	()	;
        p.setPoint	(2,	5)	;
        p.affCoord()	;
        PointNom	pn1	=	new	PointNom()	;
        pn1.setPointNom	(1,	7,	'A')	;						//	methode	de	PointNom
        pn1.affCoordNom()	;																//	methode	de	PointNom
        pn1.deplace	(9,	3)	;															//	methode	de	Point
        pn1.affCoordNom()	;																//	methode	de	PointNom
        PointNom	pn2	=	new	PointNom()	;
        pn2.setPoint	(4,	3)	;															//	methode	de	Point
        pn2.setNom	('B')	;																		//	methode	de	PointNom
        pn2.affCoordNom()	;																	//	methode	de	PointNom
        pn2.affCoord()	;																				//	methode	de	Point
    }
}

/*
 * 1.	Ici	encore,	comme	nos	classes	ne	disposent	pas	de	constructeur,	il	est	possible	de
créer	des	objets	sans	les	initialiser.	Dans	ce	cas,	leurs	champs	auront	simplement	une
valeur	"nulle",	c’est-à-dire	ici	la	valeur	entière	0	pour	les	coordonées	et	le	caractère
de	code	nul	pour	le	nom.
2.	Comme	la	classe	Point	ne	dispose	pas	de	méthodes	d’accès	aux	coordonnées,	on
voit	 que	la	méthode	affCoordNom	 n’a	 pas	 d’autre	 possibilité	 que	 de	 recourir	 à	la
méthode	affCoord	 de	Point,	 ce	 qui	impose	 des	 contraintes	 sur	la	 présentation	 des
résultats.	En	particulier,	il	serait	impossible	d’afficher	sur	une	même	ligne	le	nom	du
point	avant	les	coordonnées.
 */