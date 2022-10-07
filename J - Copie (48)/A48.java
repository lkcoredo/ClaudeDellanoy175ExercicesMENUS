import	java.io.*;

public class A48 {
    public	static	void	main	(String	args[])
    {	
        final	int	N	=	5	;
        double	val	[]	=	new	double[N]	;
        int	i	;
        System.out.println	("donnez	"	+	N	+	"	valeurs	flottantes")	;
        for	 (i=0	 ;	 i<N	 ;	 i++)	 //	 for…	 each	 n’est	 pas applicable	ici
        val[i]	=	Clavier.lireDouble()	;
        double	valMax	=	val[0],	valMin	=	val[0],	somme=0	;
        for	 (i=0	 ;	 i<N	 ;	 i++)	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 //	 ou	 (depuis	 JDK 5.0)	:
        {	
            if	(val[i]	>	valMax)	valMax	=	val[i]	;	//	for	(double	v	:	val)
            if	 (val[i]	 <	 valMin)	 valMin	 =	 val[i]	 ;	 //	 {	 if	 (v>valMax)
            double v=0;
            valMax=v	;
            somme	 +=	 val[i]	 ;	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 	 //	 if	 (v<valMin)
            valMin=v	;
        }																																				//	som	+=	v	;
        //	}
        System.out.println	("valeur	maximale	=	"	+	valMax)	;
        System.out.println	("valeur	minimale	=	"	+	valMin)	;
        double	 vMoyenne	 =	 somme/N	 ;	 	 //	 on	 suppose	 que	 N	 est	 strictement positif
        System.out.println	("moyenne	"	+	vMoyenne)	;
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

