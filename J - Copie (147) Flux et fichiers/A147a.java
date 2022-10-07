import	java.io.*	;
public	class	A147a
{	
    public	static	void	main	(String	args[])	throws	IOException
    {	
        String	chNom,	chPrenom	;
        int	annee	;
        String	nomFichier	;
        System.out.println	("Nom	du	fichier	a	creer	:	")	;
        nomFichier	=	Clavier.lireString()	;
        DataOutputStream	sortie	=	new	DataOutputStream(new	FileOutputStream	(nomFichier))	;
        int	i	;
        int	num	=	0	;				//	pour	compter	les	differents	enregistrements
        
        while	(true)					//	on	s'arretera	sur	nom	vide
        {	/*	lecture	infos	*/
            num++	;
            System.out.print	("nom	"	+	num	+	"	:	")	;
            chNom	=	Clavier.lireString()	;
            if	(chNom.length()	==	0)	break	;
            System.out.print	("Prenom	:	")	;
            chPrenom	=	Clavier.lireString()	;
            System.out.print	("annee	naissance	:	")	;
            annee	=	Clavier.lireInt()	;
            /*	ecriture	fichier	*/
            sortie.writeUTF	(chNom)	;
            sortie.writeUTF	(chPrenom)	;
            sortie.writeInt(annee)	;
        }
        sortie.close()	;
        System.out.println	("****	fin	creation	fichier	****")	;
    }
}

/*Cette	seconde	démarche	peut	paraître	plus	souple	que	la	première	puisqu’elle	n’impose
aucune	limite	à	la	taille	des	chaînes	fournies.	Néanmoins,	elle	présente	l’inconvénient
de	ne	plus	être	adaptée	à	l’exploitation	ultérieure	du	fichier	en	accès	direct. */

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