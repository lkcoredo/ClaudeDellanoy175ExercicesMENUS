import	java.awt.*	;
import	java.awt.event.*	;
import	javax.swing.*	;
import	java.io.*	;

class	 MaFenetre	 extends	 JFrame	 implements	 ActionListener, FocusListener
{	
    private	static	final	int	LG_NOM	=	20,	LG_PRENOM	=	20	;
    private	 static	 final	 int	 TAILLE_ENREG	 =	 2*LG_NOM	 +	 2*LG_PRENOM	 + 4	;
    private	 static	 final	 String	 titreFenetre	 =	 "Consultationrepertoire"	;

    public	MaFenetre	()
    {	
        nom	=	new	char[LG_NOM]	;
        prenom	=	new	char[LG_PRENOM]	;
        setTitle	(titreFenetre)	;
        setSize	(400,	200)	;
        Container	contenu	=	getContentPane()	;
        contenu.setLayout	(new	GridLayout(5,	2)	)	;
        labNomFichier	=	new	JLabel	(etiqNomFichier)	;
        contenu.add(labNomFichier)	;
        txtNomFichier	=	new	JTextField	(20)	;
        contenu.add(txtNomFichier)	;
        txtNomFichier.addActionListener	(this)	;
        txtNomFichier.addFocusListener	(this)	;
        labNumEnreg	=	new	JLabel	(etiqNumEnreg)	;
        contenu.add	(labNumEnreg)	;
        txtNumEnreg	=	new	JTextField	(20)	;
        contenu.add	(txtNumEnreg)	;
        txtNumEnreg.addActionListener	(this)	;
        txtNumEnreg.addFocusListener	(this)	;
        labNom	=	new	JLabel	(etiqNom)	;
        contenu.add	(labNom)	;
        txtNom	=	new	JTextField	(20)	;	txtNom.setEditable	(false)	;
        contenu.add	(txtNom)	;
        labPrenom	=	new	JLabel	(etiqPrenom)	;
        contenu.add	(labPrenom)	;
        txtPrenom	=	new	JTextField	(20)	;	txtPrenom.setEditable	(false)	;
        contenu.add	(txtPrenom)	;
        labAnnee	=	new	JLabel	(etiqAnnee)	;
        contenu.add	(labAnnee)	;
        txtAnnee	=	new	JTextField	(20)	;	txtAnnee.setEditable	(false)	;
        contenu.add	(txtAnnee)	;
    }

    public	void	actionPerformed	(ActionEvent	e)
    {	
        Object	source	=	e.getSource()	;
        if	(source	==	txtNomFichier)	nouveauFichier()	;
        if	(source	==	txtNumEnreg)	nouvelEnreg()	;
    }

    public	void	focusGained	(FocusEvent	e)
    {}
    
    public	void	focusLost	(FocusEvent	e)
    {	
        Object	source	=	e.getSource()	;
        if	(source	==	txtNomFichier)	nouveauFichier()	;
        if	(source	==	txtNumEnreg)	nouvelEnreg()	;
    }

    private	void	nouveauFichier()
    {	
        try
        {	
            if	(fichierOuvert)
            {	
                fichier.close()	;
                fichierOuvert	=	false	;
                setTitle	(titreFenetre)	;
            }
            nomFichier	=	txtNomFichier.getText	()	;
            fichier	=	new	RandomAccessFile	(nomFichier,	"r")	;
        }
        catch	(IOException	e)	//	erreur	ouverture
        {	
            JOptionPane.showMessageDialog	(null,	"FICHIER	INEXISTANT")	;
            txtNomFichier.setText	("")	;
            return	;
        }
        fichierOuvert	=	true	;
        setTitle	(titreFenetre	+	"	"	+	nomFichier)	;

        try
        {	
            tailleFichierOctets	=	fichier.length()	;
            tailleFichierEnreg	=	tailleFichierOctets/TAILLE_ENREG	;
        }
        catch	(IOException	e)	{}

        txtNumEnreg.setText("")	;	txtNom.setText("")	;
        txtPrenom.setText("")	;	txtAnnee.setText("")	;
    }

    private	void	nouvelEnreg()
    {	
        if	(!fichierOuvert)
        {	
            JOptionPane.showMessageDialog	(null,	"Pas	de	fichier	ouvert")	;
            txtNumEnreg.setText	("")	;
            return	;
        }
        /*	lecture	numero	enregistrement	et	controles	validite	*/

        String	chNumEnreg	=	txtNumEnreg.getText	()	;
        boolean	converti	=	false	;

        try
        {	
            num	=	Integer.parseInt	(chNumEnreg)	;
            converti	=	true	;
        }
        catch	(NumberFormatException	e)	{}
        if	(!converti	||	(num<=0)	||	(num>tailleFichierEnreg))
        {	
            JOptionPane.showMessageDialog	(null,	"Numero	enreg	incorrect")	;
            txtNumEnreg.setText	("")	;	txtNom.setText("")	;
            txtPrenom.setText("")	;	txtAnnee.setText("")	;
            return	;
        }
        /*	numero	correct	-	lecture	de	l'enregistrement	correspondant	*/
        try
        {	
            numEnreg	=	num	;
            fichier.seek	(TAILLE_ENREG*(numEnreg-1))	;
            for	(int	i=0	;	i<LG_NOM	;	i++)	nom[i]	=	fichier.readChar()	;
            for	 (int	 i=0	 ;	 i<LG_PRENOM	 ;	 i++)	 prenom[i]	 =
            fichier.readChar()	;
            annee	=	fichier.readInt	()	;
            /*	conversion	des	informations	en	chaine	et	affichage	*/
            String	chNom	=	new	String	(nom)	;
            String	chPrenom	=	new	String	(prenom)	;
            String	chAnnee	=	String.valueOf	(annee)	;
            txtNom.setText	(chNom)	;
            txtPrenom.setText	(chPrenom)	;
            txtAnnee.setText	(chAnnee)	;
        }
        catch	(IOException	e)	{}
    }

    private	boolean	fichierOuvert	=	false	;
    private	String	nomFichier	;
    private	RandomAccessFile	fichier	;
    private	long	tailleFichierEnreg,	tailleFichierOctets	;
    private	int	numEnreg,	num	;
    private	char[]	nom,	prenom	;
    private	int	annee	;
    private	 JLabel	 labNomFichier,	 labNumEnreg,	 labNom,	 labPrenom,
    labAnnee	;

    private	 JTextField	 txtNomFichier,	 txtNumEnreg,	 txtNom,	 txtPrenom,
    txtAnnee	;
    static	 private	 String	 etiqNomFichier	 =	 "Nomfichier	:													",
    etiqNumEnreg	=	"Numero	enregistrement	:			",
    etiqNom	=	"Nom	:																										",
    etiqPrenom	=	"Prenom	:																				",
    etiqAnnee	=	"Annee	naissance	:			" ;
}

public	class	A149
{	
    public	static	void	main	(String	args[])
    {	
        MaFenetre	fen	=	new	MaFenetre()	;
        fen.setVisible(true)	;
    }
}

//classe symétrique : 
/*
 * Une association un à un symétrique est une association entre deux objets de la même classe dans laquelle les deux objets jouent le même rôle.

Prenons par exemple la représentation d'un tournoi d'échec. Chaque partie d'échec peut être vue comme une association [1-1] entre deux personnes. En faisant abstraction de la couleur des pièces, chaque joueur joue le même rôle dans cette association. Il s'agit donc d'une association symétrique.
// http://cours.thirion.free.fr/Cours/Java-ProgObjet2/Asso-Reflex.php
 */