import	java.io.*;

public	class	A59
{	
    public	static	void	main	(String[]	args)
    {	
        final	int	nParLigne	=	10	;
        boolean	raye	[]	;		
        int	nombre	;	
        int	nMax	;		
        int	i	;
    /*	preparation	du	crible	*/
        System.out.print("Donnez	le	plus	grand	nombre	entier	a	examiner	:")	;
        nMax	=	Clavier.lireInt()	;
        raye	=	new	boolean	[nMax+1]	;

        for	(i=1	;	i<=nMax	;	i++)	raye[i]	=	false	;
        /*	on	raye	le	nombre	1	*/

        raye[1]	=	false	;	nombre	=	1	;

        while	(nombre*nombre	<=	nMax)
        {	/*	recherche,	a	partir	de	nombre,	du	premier	nombre	non	raye	*/
            while	(	(raye[++nombre])	&&	(nombre<=nMax))	{}
            /*	on	raye	tous	ses	multiples	*/
            for	(i=2*nombre	;	i<=nMax	;	i+=nombre)	raye[i]	=	true	;
        }

        /*	affichage	des	resultats	*/
        System.out.println	("entre	1	et	"	+	nMax	+	"	les	nombres	premiers sont	:	")	;
        int	nAff	=	0	;		//	nombre	de	valeurs	affichees;

        for	(i=1	;	i<=nMax	;	i++)
        {	
            if	(!raye[i])	
            {	
                System.out.print	(i	+	"	")	;
                nAff++	;
                if	(nAff	==	nParLigne)	
                {	
                    nAff	=	0	;
                    System.out.println	()	;
                }
            }
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
