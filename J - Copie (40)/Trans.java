class A
{	
    public A (int nn)
    {
        n =	nn;
    }

    public int getn ()
    {	
        return	n	;
    }

    public void setn	(int	nn)
    {	
        n	=	nn	;
    }

    private	int	n	;
}

class	Util
{	
    public	static	void	incre	(A	a,	int	p)
    {	
        a.setn	(a.getn()+p);
    }
    
    public	static	void	incre	(int	n,	int	p)
    {	
        n	+=	p	;
    }
}

public class	Trans
{	
    public	static	void	main	(String	args[])
    {	
        A	a	=	new	A(2)	;
        int	n	=	2	;
        System.out.println	("valeur	de	a	avant	:	"	+	a.getn())	;
        Util.incre	(a,	5)	;
        System.out.println	("valeur	de	a	apres	:	"	+	a.getn())	;
        System.out.println	("valeur	de	n	avant	:	"	+	n)	;
        Util.incre	(n,	5)	;
        System.out.println	("valeur	de	n	apres	:	"	+	n)	;
    }
}


    

// En	Java,	le	transfert	des	arguments	à	une	méthode	se	 fait	toujours	par	valeur.	Mais	la
// valeur	d’une	variable	de	type	objet	est	sa	référence.	D’où	les	résultats	: