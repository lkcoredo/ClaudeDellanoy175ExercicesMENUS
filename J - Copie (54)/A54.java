class	UtilTab
{	
    public	static	int[]	genere	(int	n)
    {	
        int	[]	res	=	new	int[n]	;
        for	(int	i=0,	j=1	;	i<n	;	i++,	j+=2)	res[i]	=	j	;
        return	res	;
    }

    public	static	int[]	somme	(int	t1[],	int	t2[])
    {	
        int	n	=	t1.length	;
        if	(n	!=	t2.length)	return	null	;
        int	res[]	=	new	int[n]	;
        for	(int	i=0	;	i<n	;	i++)	res	[i]	=	t1[i]	+	t2[i]	;
        return	res	;
    }

    public	static	void	affiche	(int	[]	t)
    {	
        for	(int	i=0	;	i<t.length	;	i++)
        System.out.print	(t[i]	+	"	")	;
        System.out.println	()	;
    }
}

public	class	A54
{	
    public	static	void	main	(String	args[])
    {	
        int	ta[]	=	{1,	5,	9}	;
        System.out.print	("ta	=	")	;	UtilTab.affiche(ta)	;
        int	tb[]	=	UtilTab.genere	(3)	;
        System.out.print	("tb	=	")	;	UtilTab.affiche(tb)	;
        int	tc[]	=	UtilTab.somme	(ta,	tb)	;
        System.out.print	("tc	=	")	;	UtilTab.affiche(tc)	;
    }
}

/*
 * Il	ne	faut	pas	perdre	de	vue	qu’en	Java,	les	emplacements	alloués	à	des	objets	ou	à	des
tableaux	 ne	 sont	libérés	 que	lorsqu’ils	 ne	 sont	 plus	 référencés.	C’est	ce	 qui	 permet	à
une	méthode	 de	 renvoyer	la	 référence	à	 un	emplacement	 qu’elle	a	elle-même	créé.	 Il
n’en	 va	 pas	 de	même	 dans	 un	langage	comme	C++	 qui	 gère	 de	tels	emplacements	 de
manière	"automatique",	en	les	libérant	dès	la	sortie	de	la	méthode
 */
