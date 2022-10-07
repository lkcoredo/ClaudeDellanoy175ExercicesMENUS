import	java.io.*	;

public	class	A147
{	
    public	static	void	main	(String	args[])	throws	IOException
    {	
        final	int	longMaxNom	=	20	;
        final	int	longMaxPrenom	=	20	;
        String	chNom,	chPrenom	;
        char[]	nom	=	new	char	[longMaxNom]	;
        char[]	prenom	=	new	char	[longMaxPrenom]	;
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
            /*	 transfert	 nom	 et	 prenom	 dans	 tab	 de	 char	 termines	 par	 des
            espaces	*/
            for	(i=0	;	i<longMaxNom	;	i++)	nom[i]	=	'	';
            for	(i=0	;	i<longMaxPrenom	;	i++)	prenom[i]	=	'	'	;
            for	(i	=	0	;	(i	<	chNom.length())&&(i<longMaxNom)	;	i++)
            nom[i]	=	chNom.charAt(i)	;
            for	(i	=	0	;	(i	<	chPrenom.length())&&(i<longMaxPrenom)	;	i++)
            prenom[i]	=	chPrenom.charAt(i)	;
            /*	ecriture	fichier	*/
            for	(i=0	;	i<longMaxNom	;	i++)	sortie.writeChar	(nom[i])	;
            for	(i=0	;	i<longMaxPrenom	;	i++)	sortie.writeChar	(prenom[i])	;
            sortie.writeInt(annee)	;
        }

        sortie.close()	;
        System.out.println	("****	fin	creation	fichier	****")	;
    }

}


/* 1.	La	clause	throws	IOException	figurant	dans	la	méthode	main	est	nécessaire,	dès
lors	 qu’on	 n’y	 traite	 pas	 les	 exceptions	 susceptibles	 d’être	 déclenchées	 par	 les
méthodes	de	la	classe	DataOutputstream.
2.	Plutôt	que	d’écrire	un	à	un	chacun	des	caractères	de	nom	et	de	prenom,	on	aurait
pu	espérer	appliquer	directement	à	chNom	et	chPrenom	la	méthode	writeChars	 qui
écrit	tous	les	caractères	d’une	chaîne.	Cependant,	cette	démarche	ne	correpond	pas	à
la	demande	de	l’énoncé	(informations	de	taille	fixe	dans	le	fichier)	;	de	plus,	elle	ne
permettrait	pas	de	relire	ultérieurement	le	fichier	(à	moins	de	connaître	par	ailleurs
les	longueurs	de	chacune	des	informations	y	figurant	!). */

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