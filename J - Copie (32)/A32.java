import	java.io.*;

class	Ident
{	
    public	Ident	()
    {	
        numCour++	;
        num	=	numCour	;
    }

    public	int	getIdent()
    {	
        return	num	;
    }

    public	static	int	getIdentMax()
    {	
        return	numCour-1	;
    }

    private	static	int	numCour	;			//	prochain	numero	a	attribuer
    private	int	num	;	//	numero	de	l'objet

    static
    {	
        System.out.print	("donnez	le	premier	identificateur	:	")	;
        do	numCour	=	Clavier.lireInt()	;	while	(numCour	<=	0)	;
    }														//	numero	de	l'objet
}

public	class	A32
{	
    public	static	void	main	(String	args[])
    {	
        Ident	a	=	new	Ident(),	b	=	new	Ident()	;
        System.out.println	("numero	de	a	:	"	+	a.getIdent())	;
        System.out.println	("numero	de	b	:	"	+	b.getIdent())	;
        System.out.println	("dernier	numero	"	+	Ident.getIdentMax())	;
        Ident	c	=	new	Ident()	;
        System.out.println	("dernier	numero	"	+	Ident.getIdentMax())	;
        System.out.println(c);
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