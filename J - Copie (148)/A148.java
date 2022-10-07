import	java.io.*	;
public	class	A148
{
    public	static	void	main	(String	args[])	throws	IOException
    {	
        final	int	longMaxNom	=	20	;
        final	int	longMaxPrenom	=	20	;
        String	chNom,	chPrenom	;
        char[]	nom	=	new	char	[longMaxNom]	;
        char[]	prenom	=	new	char	[longMaxPrenom]	;
        int	annee	;
        int	i	;
        String	nomFichier	;
        System.out.println	("Nom	du	fichier	a	lister	:	")	;
        nomFichier	=	Clavier.lireString()	;
        DataInputStream	entree	=	new	DataInputStream
            (new	FileInputStream	(nomFichier))	;
        System.out.println	("****	Liste	du	fichier	****")	;
        boolean	 eof	 =	 false	 ;	 //	 sera	 mis	 a	 true	 par	 gestionnaire exception	EOFile
        
        while	(!eof)
        {	
            try
            {	/*	lecture	infos	*/
                for	(i=0	;	i<longMaxNom	;	i++)	nom[i]	=	entree.readChar	()	;
                for	 (i=0	 ;	 i<longMaxPrenom	 ;	 i++)	 prenom[i]	 =	 entree.readChar
                ()	;
                annee	=	entree.readInt	()	;
                /*	affichage	infos	*/
                for	(i=0	;	i<longMaxNom	;	i++)	System.out.print	(nom[i])	;
                System.out.print	("	")	;
                for	(i=0	;	i<longMaxPrenom	;	i++)	System.out.print	(prenom[i])	;
                System.out.print	("	")	;
                System.out.println	(annee)	;
            }
            catch	(EOFException	e)
            {	
                eof	=	true	;
            }
        }
        entree.close()	;
        System.out.println	("****	fin	liste	fichier	****")	;
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
 * À	titre	indicatif,	voici	l’allure	des	résultats	fournis	par	ce	programme	:
Nom	du	fichier	a	lister	:
e:\repert
****	Liste	du	fichier	****
Carre					Thibault							1997
407
Dubois				Louis										1975
Dutronc			Jean	Philippe		1958
Duchene			Alfred									1994
Mitenne			Thomas									2001
***	fin	liste	fichier	****
 */