import	java.io.*	;
public	class	A150
{	
    public	static	void	main	(String	args[])	throws	IOException
    {	 
        final	 int	 longNumLigne	 =	 4	 ;	 	 //	 nombre	 de	 caracteres	 utilises pour
        //	afficher	le	numero	de	ligne
        final	int	nbCarParLigne	=	60	;
        String	nomfich	;
        String	ligne	;							//	ligne	courante	du	fichier	texte
        char	 charNumLigne[]	 =	 new	 char[longNumLigne]	 ;	 	 //	 pour	 les caracteres
        //	du	numero	de	ligne
        System.out.print	("Donnez	le	nom	du	fichier	texte	a	lister	:	")	;
        nomfich	=	Clavier.lireString()	;
        BufferedReader	 entree	 =	 new	 BufferedReader	 (new	 FileReader (nomfich))	;
        int	numLigne	=	0	;

        do
        {	/*	lecture	d'une	ligne	du	fichier	*/
            ligne	=	entree.readLine()	;
            if	(ligne	==	null)	break	; numLigne++	;
            /*	 determination	 des	 caracteres	 correspondant	 au	 numero	 de
            ligne	*/
            String	ch	=	String.valueOf	(numLigne)	;
            int	i,	j	;		//	pour	parcourir	le	numero	de	ligne
            for	(i=0	;	i<longNumLigne-ch.length()	;	i++)	charNumLigne[i]	=	'0'	;
            for	 (j=0	 ;	 i<longNumLigne	 ;	 i++,	 j++)	 charNumLigne[i]	 = ch.charAt(j)	;
            /*	affichage	numero	de	ligne	suivi	d'un	espace*/
            for	 (i=0	 ;	 i<longNumLigne	 ;	 i++)	 System.out.print (charNumLigne[i])	;
            System.out.print	('	')	;
            /*	affichage	ligne	courante	*/
            int	n=0	;		//	pour	parcourir	la	ligne	courante
            
            while	(n	<	ligne.length())
            {	
                if	((n	!=	0)	&&	(n%nbCarParLigne	==	0))	/*	on	change	de	ligne */
                {	
                    System.out.println	()	;
                    for	(int	k=0	;	k<longNumLigne+1	;	k++)
                    System.out.print	('	')	;
                }
                System.out.print	(ligne.charAt(n))	;
                n++	;
            }
            System.out.println	()	;
        }

        while	(ligne	!=	null)	;
        entree.close	()	;
        System.out.println	("***	fin	liste	fichier	***");
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
