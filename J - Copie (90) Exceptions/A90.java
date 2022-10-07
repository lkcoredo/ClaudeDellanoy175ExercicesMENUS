class	EntNat
{	
    public	EntNat	(int	n)	throws	ErrConst
    {	
        if	(n<0)	throw	new	ErrConst()	;
        this.n	=	n	;
    }
    public	int	getN	()	{	return	n	;	}
    private	int	n	;
}

class	ErrConst	extends	Exception
{}

public	class	A90
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
            System.out.println	("***	erreur	construction	***")	;
            System.exit	(-1)	;
        }
    }
}
