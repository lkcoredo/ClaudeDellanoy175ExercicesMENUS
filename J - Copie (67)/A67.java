class	A
{	
    public	void	affiche()	{	System.out.print	("Je	suis	un	A	")	;	}
}

class	B	extends	A	{}

class	C	extends	A
{	
    public	void	affiche()	{	System.out.print	("Je	suis	un	C	")	;	}
}

class	D	extends	C
{	
    public	void	affiche()	{	System.out.print	("Je	suis	un	D	")	;	}
}

class	E	extends	B	{}
class	F	extends	C	{}

public	class	A67
{	
    public	static	void	main	(String	arg[])
    {	
        A	a	=	new	A()	;	a.affiche()	;	System.out.println()	;
        B	b	=	new	B()	;	b.affiche()	;
        a	=	b	;									a.affiche()	;	System.out.println()	;
        C	c	=	new	C()	;	c.affiche()	;
        a	=	c	;									a.affiche()	;	System.out.println()	;
        D	d	=	new	D()	;	d.affiche()	;
        a	=	d	;									a.affiche()	;
        c	=	d	;									c.affiche()	;	System.out.println()	;
        E	e	=	new	E()	;	e.affiche()	;
        a	=	e	;									a.affiche()	;
        b	=	e	;									b.affiche()	;	System.out.println()	;
        F	f	=	new	F()	;	f.affiche()	;
        a	=	f	;									a.affiche()	;
        c	=	f	;									c.affiche()	;
    }
}

/*
 * En	 Java,	l’une	 des	 propriétés	 du	 "polymorphisme"	est	 que	l’appel	 d’une	méthode	est
déterminé	 au	 moment	 de	 l’exécution,	 suivant	 la	 nature	 de	 l’objet	 effectivement
référencé	(et	non	seulement	suivant	le	type	de	la	référence).	C’est	pourquoi	ici	tous	les
appels	de	affiche	concernant	un	même	objet	fournissent	le	même	message,	quel	que	soit
le	type	de	référence	utilisé	:
 */