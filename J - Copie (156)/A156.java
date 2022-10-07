public	class	A156
{	
    static	<T>	T	hasard	(T	[]	valeurs)
	{	
        if	(valeurs	==	null)	return	null	;
        int	n	=	valeurs.length	;
        if	(n	==	0)	return	null	;
        int	i	=	(int)	(n	*	Math.random()	)	;
        return	valeurs[i]	;
	}

	public	static	void	main(String	args[])
	{	
        Integer[]	tabi	=	{	1,	7,	8,	4,	9}	;		//	ici	boxing	automatique
        System.out.println	("hasard	sur	tabi	=	"	+	hasard	(tabi)	)	;
        String[]	tabs	=	{"Java",	"C",	"C++",	"C#",	"Visual	Basic"}	;
        System.out.println	("hasard	sur	tabs	=	"	+	hasard	(tabs)	)	;
	}
}