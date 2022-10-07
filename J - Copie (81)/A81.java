import	java.io.*;
public	class	A81
{
    public	static	void	main	(String	args[])
    {	//	lecture	des	donnees
        System.out.print	("Combien	de	mots	?	")	;
        int	nMots	=	Clavier.lireInt()	;
        String	[]	mots	=	new	String[nMots]	;
        System.out.println	("donnez	vos	mots")	;
        for	(int	i=0	;	i<nMots	;	i++)
        mots[i]	=	Clavier.lireString()	;
        //	conversion	de	chaque	mot	en	minuscules
        String	[]	motsMin	=	new	String[nMots]	;
        for	(int	i=0	;	i<nMots	;	i++)
        motsMin[i]	=	mots[i].toLowerCase()	;
        //	 tri	 par	 reorganisation	 des	 references	 (mots	 d'origine	 et	 en minuscules)
        //	(on	compare	chaque	mot	(minuscule)	a	tous	ses	suivants)
        String	temp	;
        for	(int	i=0	;	i<nMots-1	;	i++)
        for	(int	j=i+1	;	j<nMots	;	j++)
        if	(motsMin[i].compareTo(motsMin[j])	>=	0)
        {	 
            temp	 =	 motsMin[i]	 ;	 motsMin[i]	 =	 motsMin[j]	 ;	 motsMin[j]	 = temp	;
            temp	=	mots[i]	;	mots[i]	=	mots[j]	;	mots[j]	=	temp	;
        }
        //	affichage	des	chaines	triees
        System.out.println	("Liste	par	ordre	alphabetique	:")	;
        for	(int	i=0	;	i<nMots	;	i++)								//	ou	(depuis	JDK	5.0)	:
        System.out.println	(mots[i])	;					//	for	(String	mot	:	mots)
    }	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 //	 System.out.println
    //(mot)	;
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