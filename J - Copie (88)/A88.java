enum	Mois2
{	
    janvier	(31,	"jan",	"january"),	fevrier	(28,	"fev",	"february"),
    mars	(31,	"mar",	"march"),	avril	(30,	"avr",	"april"),
    mai	(31,	"mai",	"may"),	juin	(30,	"jun",	"june"),
    juillet	(31,	"jul",	"july"),	aout	(31,	"aou",	"august"),
    septembre	(30,	"sep",	"september"),	octobre	(31,	"oct",	"october"),
    novembre	 (30,	 "nov",	 "november"),	 decembre	 (31,	 "dec", "december")	;
    
    private	Mois2	(int	n,	String	abrev,	String	na)
    {	
        nj	=	n	;
        abrege	=	abrev	;
        anglais	=	na	;
    }

    public	int	nbJours	()	{	return	nj	;	}

    public	String	abreviation	()
    {	
        return	abrege	;
    }

    public	String	nomAnglais	()
    {	
        return	anglais	;
    }
    private	int	nj	;
    private	String	abrege	;
    private	String	anglais	;
}

public	class	A88
{	
        public	static	void	main	(String	args[])
        {	
            for	(Mois2	m	:	Mois2.values()	)
            System.out.println	(	m.abreviation()	+	"	=	"	+	m	+	"	=	" +m.nomAnglais()	+	"	-	"	+	m.nbJours()	+	"	jours")	;
        }
}