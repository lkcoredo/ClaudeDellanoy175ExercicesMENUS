class	Ident
{	
    public	Ident	()
    {	
        numCour++	;
        num	=	numCour	;
    }

    public	int	getIdent()
    {	
        return	num	;
    }

    public	static	int	getIdentMax()
    {	
        return	numCour	;
    }
    private	static	int	numCour=0	;		//	dernier	numero	attribué
    private	int	num	;															//	numero	de	l'objet
}

public	class	A31
{	
    public	static	void	main	(String	args[])
    {	
        Ident	a	=	new	Ident(),	b	=	new	Ident()	;
        System.out.println	("numero	de	a	:	"	+	a.getIdent())	;
        System.out.println	("numero	de	b	:	"	+	b.getIdent())	;
        System.out.println	("dernier	numero	"	+	Ident.getIdentMax())	;
        Ident	c	=	new	Ident()	;
        System.out.println	("dernier	numero	"	+	Ident.getIdentMax())	;
        System.out.println(c);
    }
}