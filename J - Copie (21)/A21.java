import	java.io.*;

public class A21 {
    public	static	void	main	(String[]	args)
    {
        int	nLignes	;															//	nombre	total	de	lignes
        int	numLigne	;														//	compteur	de	ligne
        int	 nEspaces	 ;	 	 	 	 	 	 	 	 	 	 	 	 	 	 //	 nombre	 d'espaces	 precedent	 une etoile
        final	 char	 cRempli	 =	 '*'	 ;	 	 //	 caractere	 de	 remplissage	 (ici etoile)
        int	j	;

        System.out.print	("combien	de	lignes	?	")	;
        nLignes	=	Clavier.lireInt	()	;

        for	(numLigne=0	;	numLigne<nLignes	;	numLigne++)
        {	
            nEspaces	=	nLignes	-	numLigne	-	1	;
            for	(j=0	;	j<nEspaces	;	j++)	System.out.print	(' ')	;
            for	(j=0	;	j<2*numLigne+1	;	j++)	System.out.print	(cRempli)	;
            System.out.println	()	;
        }
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
