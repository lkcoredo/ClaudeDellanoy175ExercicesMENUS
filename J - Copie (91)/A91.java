class	EntNat
{	
    public	EntNat	(int	n)	throws	ErrConst
    {	
        if	(n<0)	throw	new	ErrConst(n)	;
        this.n	=	n	;
    }
    public	int	getN	()	{	return	n	;	}
    private	int	n	;
}

class	ErrConst	extends	Exception
{	
    public	ErrConst	(int	valeur)	{	this.valeur	=	valeur	;	}
    public	int	getValeur()	{	return	valeur	;	}
    private	int	valeur	;
}

public	class	A91
{	
    public	static	void	main	(String	args[])
    {	
        try
        {	
            EntNat	n1	=	new	EntNat(20)	;
            System.out.println	("n1	=	"	+	n1.getN())	;
            EntNat	n2	=	new	EntNat(-12)	;
            System.out.println	("n2	=	"	+	n2.getN())	;
        }
        catch	(ErrConst	e)
        {	
            System.out.println	("***	tentative	construction	naturel	avec	"
            +	e.getValeur()	+	"	***")	;
            System.exit	(-1)	;
        }
    }
}

/* 
 * En	pratique,	on	se	permettra	souvent	de	ne	pas	appliquer	le	principe	d’encapsulation	à
des	 champs	tels	 que	 valeur.	Ainsi,	en	le	 déclarant	public,	 on	 pourra	 se	 passer	 de	la
méthode	getValeur	et	écrire	directement	dans	le	gestionnaire	:
System.out.println	("***	tentative	construction	naturel	avec	"
+	e.valeur	+	"	***")	;

*/
