class	C	<T>
{	
    T	x	;
    T[]	t1	;
    T[]	t2	;
    //public	static	T	inf	; //  //	 champ	 statique	 d'un	 type	 générique interdit
    
    public	static	int	compte	;

    void	f	()
    {	
        //x	=	new	T	()	;  //	 instanciation	 d'un	 type	 générique impossible
        t2	=	t1	;
        //t2	=	new	T	[5]	; //  //	 instanciation	 d'un	 tableau	 d'un	 type générique impossible
    }
}

/*
 * Rappelons	que,	lors	de	la	compilation,	la	technique	dite	«	de	l’effacement	»,	consiste	à
remplacer	un	type	générique	par	un	«	type	brut	».	En	l’absence	d’indications	contraires
(limitations	des	paramètres	de	type),	ce	type	brut	est	tout	simplement	Object.	Dans	ces
conditions,	un	certain	nombre	d’opérations	sont	impossibles,	notamment	:
•	définition	d’un	champ	statique	d’un	type	générique,
•	instanciation	d’un	type	générique	ou,	a	fortiori,	d’un	tableau	d’un	type	générique.
s
 */