//Priorités	des	opérateurs
//arithmétiques	et	parenthèses

class	A8
{	
    /**
     * @param args
     */
    public	static	void	main(String[]	args)
    {	
        int	i,	j,	n	;
        i	=	0	;	n	=	i++	;
        System.out.println	("A	:	i	=	"	+	i	+	"	n	=	"	+	n	)	;
        System.out.println	("A	:	i	=	"	+	i	+	"	n	=	"	+	n	)	;
        i	=	10	;	n	=	++	i	;
        System.out.println	("B	:	i	=	"	+	i	+	"	n	=	"	+	n	)	;
        i	=	20	;	j	=	5	;	n	=	i++	*	++	j	;
        System.out.println	("C	:	i	=	"	+	i	+	"	j	=	"	+	j	+	"	n	=	"	+	n
        )	;
        i	=	15	;	n	=	i	+=	3	;
        System.out.println	("D	:	i	=	"	+	i	+	"	n	=	"	+	n)	;
        i	=	3	;	j	=	5	;	n	=	i	*=	--j	;
        System.out.println	("E	:	i	=	"	+	i	+	"	j	=	"	+	j	+	"	n	=	"	+
        n)	;
    }

}


    

// En	Java,	le	transfert	des	arguments	à	une	méthode	se	 fait	toujours	par	valeur.	Mais	la
// valeur	d’une	variable	de	type	objet	est	sa	référence.	D’où	les	résultats	: