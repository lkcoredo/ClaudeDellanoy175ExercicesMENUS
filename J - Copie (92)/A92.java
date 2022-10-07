import	java.io.*;

class	Except	extends	Exception
{	
    public	Except	(int	n)	{	this.n	=	n	;	}
    public	int	n	;
}

public	class	A92
{	
    public	static	void	main	(String	args[])
    {	
        int	n	;
        System.out.print	 ("donnez	 un	 entier	 :	 ")	 ;	 n	 =
        Clavier.lireInt()	;
        try
        {	System.out.println	("debut	premier	bloc	try")	;
        if	(n!=0)	throw	new	Except	(n)	;
        System.out.println	("fin	premier	bloc	try")	;
        }
        catch	(Except	e)
        {	System.out.println	("catch	1	-	n	=	"	+	e.n)	;
        }
        System.out.println	("suite	du	programme")	;
        try
        {	System.out.println	("debut	second	bloc	try")	;
        if	(n!=1)	throw	new	Except	(n)	;
        System.out.println	("fin	second	bloc	try")	;
        }
        catch	(Except	e)
        {	 System.out.println	 ("catch	 2	 -	 n	 =	 "	 +	 e.n)	 ;
        System.exit(-1)	;
        }
        System.out.println	("fin	programme")	;
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