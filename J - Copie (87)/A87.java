enum	Mois
{	
    janvier	(31),	fevrier	(28),	mars	(31),	avril	(30),
    mai	(31),	juin	(30),	juillet	(31),	aout	(31),
    septembre	(30),	octobre	(31),	novembre	(30),	decembre	(31)	;

    private	Mois	(int	n)	//	constructeur	(en	argument,	nombre	de	jours 200 du	mois)
    {	
        nj	=	n	;	;
    }
    
    public	int	nbJours	()	{	return	nj	;	}
    private	int	nj	;
}

/* 
Notez	les	particularités	de	la	syntaxe	:
•	présence	d’arguments	pour	le	constructeur,
•	 présence	 d’un	 point-virgule	 séparant	 l’énumération	 des	 valeurs	 du	 type	 des
déclarations	des	champs	et	méthodes.
Voici	un	petit	programme	fournissant	la	liste	voulue.*/

public	class	A87
{	
    public	static	void	main	(String	args[])
    {	
        for	(Mois	m	:	Mois.values()	)
        System.out.println	 (	 m	 +	 "	 comporte	 "	 +	 m.nbJours()	 +	 "jours")	;
    }
}