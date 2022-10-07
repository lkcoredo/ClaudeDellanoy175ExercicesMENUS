//Priorités	des	opérateurs
//arithmétiques	et	parenthèses

class	A9
{	
    public	static	void	main	(String	args[])
    {	
        byte	b=1;	short	p	=1;	char	c	=1;	int	n	=1;	float	x	=1;
        //c	=	c	+	1;					// cannot convert int into char
        int v = c++;
        c	+=	3;								//	
        b	+=	c;								//	
        p	+=	b;								//	
        //p	=	p	+	b	;				// Type mismatch: cannot convert from int to short
        n	+=	x	;							//	
        //n	=	n	+	x	;				//	Type mismatch: cannot convert from float to int
        x++	;									//	
        System.out.println(p);
        System.out.println(v);
        System.out.println(n);
        System.out.println(c);
        System.out.println(p);
        System.out.println(b);

        

        // raccourci :
        // -> alt + up/down (déplace ligne)
        // -> shift + alt + up/down (copie ligne du haut ou bas)
        // -> control + alt + up/down (plusieurs entrées simultanées)
        
    }

}


    

// En	Java,	le	transfert	des	arguments	à	une	méthode	se	 fait	toujours	par	valeur.	Mais	la
// valeur	d’une	variable	de	type	objet	est	sa	référence.	D’où	les	résultats	: