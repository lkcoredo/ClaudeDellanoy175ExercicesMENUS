import	java.io.*;

public class	A89
{	
    public	static	void	main	(String	args[])
    {	 
        String	 noms[]	 =	 {	 "Dutronc",	 "Dunoyer",	 "Lechene",	 "Dubois", "Frenet"	}	;
        //	creation	du	tableau	d'eleves
        int	nel	=	noms.length	;
        Eleve	eleves	[]	=	new	Eleve	[nel]	;
        for	(int	i=0	;	i<nel	;	i++)
            eleves	[i]	=	new	Eleve	(noms[i])	;
        //	lecture	des	notes	et	détermination	du	résultat	de	chaque	élève
        for	(Eleve	el	:	eleves)
        {	
            double	moy	=	moyenne	(el.getNom())	;
            el.setResul	((resul(moy)))	;
        }
        //	affichage	résultats
        System.out.println	("Resultats	:	")	;
        for	(Eleve	el	:	eleves) System.out.println	 (el.getNom()	 +	 "	 -	 "	 + el.getResul().details())	;
    }
        //	méthode	qui	demande	au	clavier	trois	notes	pour	un	nom	donne
        //	et	qui	fournit	en	retour	la	moyenne	correspondante

    static	public	double	moyenne	(String	n)
    {	
        System.out.println	("donnez	les	trois	notes	de	l'eleve	"	+	n)	;
        double	som	=	0.	;
        for	(int	i=0	;	i<3	;	i++)
        {	double	note	=	Clavier.lireDouble()	;
        som	+=	note	;
        }
        double	moyenne	=	som	/	3.	;
        return	moyenne	;
    }
            //	méthode	qui	définit	la	mention	en	fonction	de	la	moyenne
    static	public	Mention	resul	(double	m)
    {	
        if	(	m<10.	)	return	Mention.NA	;
        if	(	m<12.0)	return	Mention.P	;
        if	(	m<14.0)	return	Mention.AB	;
        if	(	m<16.0)	return	Mention.B	;
        return	Mention.TB	;
    }
}

class	Eleve
{	
    public	Eleve	(String	n)
    {	
        nom	=	n	;
        resul	=	Mention.NC	;			//	valeur	par	défaut
    }
    public	void	setResul	(Mention	r)
    {	
        resul	=	r	;
    }
    public	Mention	getResul()
    {	
        return	resul	;
    }
    public	String	getNom()
    {	
        return	nom	;
    }
    private	String	nom	;
    private	Mention	resul	;
}

enum	Mention
{	
    NA	("Non	admis"),	P	("Passable"),	AB	("Assez	bien"),
    B	("Bien"),	TB	("Tres	bien"),	NC	("Non	connu")	;

    private	Mention	(String	d)
    {	
        mentionDetaillee	=	d	;
    }
    public	String	details	()
    {	
        return	mentionDetaillee	;
    }
    private	String	mentionDetaillee	;
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