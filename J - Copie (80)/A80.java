import	java.io.*;
public	class	A80
{	
    public	static	void	main	(String	args[])
    {	
        final	String	sujets[]	= {	"je",	"tu",	"il/elle",	"nous",	"vous",	"ils/elles"}	;
        final	String	terminaisons	[]	= {	"e",	"es",	"e",	"ons",	"ez",	"ent"	}	;
        String	verbe	;
        int	nbLettres	;
        System.out.print	 ("donnez	 un	 verbe	 regulier	 du	 premier	 groupe	 :")	;

        while	(true)
        {	
            verbe	=	Clavier.lireString()	;
            nbLettres	=	verbe.length()	;
            String	fin	=	verbe.substring	(nbLettres-2,	nbLettres)	;
            if	(fin.equals("er"))	break	;
            System.out.print("***	 il	 ne	 se	 termine	 pas	 par	 er	 -	 donnez-en	 un	 autre	 :")	;
        }

        String	rad	=	verbe.substring(0,	nbLettres-2)	;
        int	n	=	terminaisons.length	;
        for	(int	i=0	;	i<n	;	i++) System.out.println	(sujets[i]	+	"	"	+	rad	+	terminaisons[i])	;
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