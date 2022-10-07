import	java.io.*;
class	Positif
{	
    public	Positif	(int	n)	throws	ErrConst
    {	
        if	(n<=0)	throw	new	ErrConst()	;
    }
}

class	ErrConst	extends	Exception
{}

public	class	A94
{	
    public	static	void	main	(String	args[])
    {	
        System.out.println	("debut	main")	;
        boolean	ok	=	false	;
        while	(!ok)
        {	
            try
            {	System.out.print	("donnez	un	entier	positif	:	")	;
            int	n	=	Clavier.lireInt()	;
            Positif	ep	=	new	Positif	(n)	;
            System.out.println(ep);
            ok	=	true	;
            }
            catch	(ErrConst	e)
            {	
                System.out.println	("***	erreur	construction	***")	;
            }
        }
        System.out.println	("fin	main")	;
    }
}


class	Clavier
    {	
        public	static	String	lireString	()			//	lecture	d’une	chaine
        {	
            String	ligne_lue	=	null	;

            try
            {	
                InputStreamReader	lecteur	=	new	InputStreamReader	(System.in)	;
                BufferedReader	entree	=	new	BufferedReader	(lecteur)	;
                ligne_lue	=	entree.readLine()	;
            }
            catch	(IOException	err)
            {	
                System.exit(0)	;
            }

            return	ligne_lue	;
        }

        public	static	float	lireFloat	()			//	lecture	d’un	float
        {	
            float	x=0	;			//	valeur	a	lire

            try
            {	
                String	ligne_lue	=	lireString()	;
                x	=	Float.parseFloat(ligne_lue)	;
            }
            catch	(NumberFormatException	err)
            {	
                System.out.println	("***	Erreur	de	donnee	***")	;
                System.exit(0)	;
            }

            return	x	;
        }

        public	static	double	lireDouble	()			//	lecture	d’un	double
        {	
            double	x=0	;			//	valeur	a	lire
            
            try
            {	
                String	ligne_lue	=	lireString()	;
                x	=	Double.parseDouble(ligne_lue)	;
            }
            catch	(NumberFormatException	err)
            {	
                System.out.println	("***	Erreur	de	donnee	***")	;
                System.exit(0)	;
            }

            return	x	;
        }
        
        public	static	int	lireInt	()									//	lecture	d’un	int
        {	
            int	n=0	;			//	valeur	a	lire
            
            try
            {	
                String	ligne_lue	=	lireString()	;
                n	=	Integer.parseInt(ligne_lue)	;
            }
            catch	(NumberFormatException	err)
            {	
                System.out.println	("***	Erreur	de	donnee	***")	;
                System.exit(0)	;
            }

            return	n	;
        }

        //	programme	de	test	de	la	classe	Clavier
        public	static	void	main	(String[]	args)
        {	
            System.out.println	("donnez	un	flottant")	;
            float	x	;
            x	=	Clavier.lireFloat()	;
            System.out.println	("merci	pour	"	+	x)	;
            System.out.println	("donnez	un	entier")	;
            int	n	;
            n	=	Clavier.lireInt()	;
            System.out.println	("merci	pour	"	+	n)	;
        }
}

/*
 * En	général,	il	n’est	pas	conseillé	d’employer	le	mécanisme	de	gestion	des	exceptions
pour	contrôler	le	déroulement	d’une	boucle	comme	nous	le	faisons	ici.	Cependant,	cette
démarche	pourra	s’avérer	utile	dans	quelques	rares	circonstances,	notamment	pour	lire
un	fichier	séquentiel	;	dans	ce	cas,	on	se	basera	sur	l’exception	EOFException.
 */