class	Vecteur
{	
    public	Vecteur(int	n)
    {	
        this	(n,	0.)	;
    }

    public	Vecteur	(int	n,	double	x)
    {	
        vect	=	new	double[n]	;
        for	(int	i=0	;	i<n	;	i++)	vect[i]	=	x	;
    }

    public	Vecteur	(double	[]	v)
    {	
        int	n	=	v.length	;
        vect	=	new	double	[n]	;
        for	(int	i=0	;	i<n	;	i++)	vect[i]	=	v[i]	;
    }

    public	double	prodScal	(Vecteur	w)
    {	
        if	(vect.length	!=	w.vect.length)	return	0.	;
        double	ps	=	0.	;
        for	(int	i=0	;	i<vect.length	;	i++)
        ps	+=	vect[i]*w.vect[i]	;
        return	ps	;
    }

    public	static	Vecteur	somme	(Vecteur	v1,	Vecteur	v2)
    {	
        if	(v1.vect.length	!=	v2.vect.length)	return	null	;
        int	n	=	v1.vect.length	;
        Vecteur	res	=	new	Vecteur	(n)	;
        for	(int	i=0	;	i<n	;	i++)
            res.vect[i]	=	v1.vect[i]	+	v2.vect[i]	;
        return	res	;
    }

    public	void	affiche	()
    {	
        for	(int	i=0	;	i<vect.length	;	i++)
        System.out.print	(vect[i]	+	"	")	;
        System.out.println()	;
    }
    private	double[]	vect	;
}

public	class	A57
{	
    public	static	void	main	(String	args[])
    {	
        Vecteur	a	=	new	Vecteur	(5)	;	a.affiche();
        Vecteur	b	=	new	Vecteur	(5,	0.5)	;	b.affiche()	;
        System.out.println	("a.b	=	"	+	a.prodScal(b))	;
        double	[]	valeurs	=	{1.25,	2.5,	5.25,	3,	1}	;
        Vecteur	c	=	new	Vecteur	(valeurs)	;	c.affiche()	;
        System.out.println	("b.c	=	"	+	b.prodScal(c))	;
        a	=	Vecteur.somme	(b,	c)	;
        System.out.print	("b+c	=	")	;	a.affiche()	;
    }
}

/*
 * Dans	un	programme	réel,	on	serait	amené	à	prendre	plus	de	précautions,	notamment	:
–	s’assurer	dans	le	premier	constructeur	que	la	valeur	de	n	est	positive	ou	nulle	(une
valeur	 nulle	 conduisant	 simplement	 à	 un	 tableau	 de	 taille	 nulle,	 ce	 qui	 n’est	 pas
incorrect)	 ou	 traiter	 correctement	 l’exception	 NegativeArraySizeIndexException
correspondante	;
–	 vérifier	 dans	 les	 méthodes	 recevant	 un	 tableau	 en	 argument	 que	 les	 références
correspondantes	 ne	 sont	 pas	 nulles	 ou	 traiter	 l’exception	 NullPointerException
risquant	d’apparaître.
On	pourrait	également	déclencher	des	exceptions	créées	spécifiquement	pour	la	classe
Vecteur.
 */