import	java.io.*;
public	class	A76
{	public	static	void	main	(String	args[])
    {	
        System.out.print	("donnez	un	nombre	entier	:	")	;
        int	n	=	Clavier.lireInt()	;
        String	ch	=	String.valueOf(n)	;
        for	(int	i=0	;	i<ch.length()	;	i++)					//	ou	(depuis	JDK	5.0)	:
        System.out.println	(ch.charAt(i))	;			//	for	(char	c	:	ch)
    }																																									//	System.out.println
    //(c)	;
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
 * Ici,	 nous	 avons	 utilisé	 la	 méthode	 valueOf	 pour	 convertir	 un	 entier	 en	 chaîne.	 Nous aurions	 pu	 également	 exploiter	la	 propriété	 de	l’opérateur	 +	 qui,	lorsque	l’un	 de	 ses
deux	opérandes	est	de	type	String,	convertit	l’autre	dans	ce	même	type.	C’est	ainsi	que
nous	 aurions	 pu	 écrire	 (un	 peu	 artificiellement)	 ch	 =	 ""	 +	 n.	 Notez	 cependant	 que
l’affectation	 directe	 ch	 =	 n	 ne	 serait	 pas	 correcte	 puisque	 le	 type	 int	 n’est	 pas
compatible	par	affectation	avec	le	type	String.

 */