class	Erreur	extends	Exception
{	
    public	int	num	;
}

class	Erreur_d	extends	Erreur
{	
    public	int	code	;
}

class	A
{	
    public	A(int	n)	throws	Erreur_d
    {	 
        if	 (n==1)	 {	 
            Erreur_d	 e	 =	 new	 Erreur_d()	 ;	 e.num	 =	 999	 ;
            e.code	=	12	;
            throw	e	;
        }
    }
}

public	class	A93
{
    public	static	void	main	(String	args[])
    {	
        try
        {	
            A	a	=	new	A(1)	;
            System.out.println	("apres	creation	a(1)")	;
            System.out.println(a);
        }

        catch	(Erreur	e)
        {	
            System.out.println	("**	exception	Erreur	"	+	e.num)	;
        }
        System.out.println	("suite	main")	;

        try
        {	
            A	b	=	new	A(1)	;
            System.out.println	("apres	creation	b(1)")	;
            System.out.println(b);
        }

        catch	(Erreur_d	e)
        {	
            System.out.println	("**	exception	Erreur_d	"	+	e.num	+	"	"	+ e.code)	;
        }

        //catch	(Erreur	e)
        //{	
         //   System.out.println	("**	exception	Erreur	"	+	e.num)	;
        //}

    }
}