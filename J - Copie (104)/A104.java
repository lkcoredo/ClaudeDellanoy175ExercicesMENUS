import	javax.swing.*	;
import	java.awt.*	;
import	java.awt.event.*	;
import	java.io.*;

class	FenBoutons	extends	JFrame	implements	ActionListener
{	
    public	FenBoutons	(int	nBout)
    {	
        this.nBout	=	nBout	;
        setTitle	("BOUTONS")	;
        setSize	(200,	150)	;
        Container	contenu	=	getContentPane()	;
        contenu.setLayout	(new	FlowLayout())	;
        boutons	=	new	JButton	[nBout]	;
        for	(int	i=0	;	i<nBout	;	i++)
        {	
            boutons[i]	=	new	JButton	("BOUTON"+(i+1))	;
            contenu.add(boutons[i])	;
            boutons[i].addActionListener	(this)	;
        }
    }

    public	void	actionPerformed	(ActionEvent	e)
    {	
        Object	source	=	e.getSource()	;
        for	(int	i=0	;	i<nBout	;	i++)
        if	(source	==	boutons[i])
        System.out.println	("Action	sur	bouton	"	+	(i+1))	;
    }
    private	int	nBout	;
    private	JButton[]	boutons	;
}

public	class	A104
{	
    public	static	void	main	(String	args[])
    {	
        System.out.print	("Combien	de	boutons	?	")	;
        int	nBoutons	=	Clavier.lireInt()	;
        FenBoutons	fen	=	new	FenBoutons(nBoutons)	;
        fen.setVisible(true)	;
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