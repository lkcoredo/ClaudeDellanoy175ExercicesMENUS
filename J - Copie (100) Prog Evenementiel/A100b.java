import	javax.swing.*	;						//	pour	JFrame
import	java.awt.event.*	;			//	pour	MouseEvent	et	MouseListener
class	MaFenetre	extends	JFrame
{	
    public	MaFenetre	()				//	constructeur
    {	
        setTitle	("Gestion	de	clics")	;
        setBounds	(10,	20,	300,	200)	;
        addMouseListener	 (new	 Ecout())	 ;	 	 //	 on	 ecoute	 avec	 un	 objet	 de type	Ecout
    }
}

class	Ecout	extends	MouseAdapter
{	
    public	void	mousePressed	(MouseEvent	ev)
    {	
        System.out.println	("appui	en	"	+	ev.getX()	+	"	"	+	ev.getY())	;
    }

    public	void	mouseReleased(MouseEvent	ev)
    {	 
        System.out.println	 ("relachement	 en	 "	 +	 ev.getX()	 +	 "	 "	 +
        ev.getY())	;
    }
    }
    
public	class	A100b
{	
    public	static	void	main	(String	args[])
    {	
        MaFenetre	fen	=	new	MaFenetre()	;
        fen.setVisible(true)	;
    }
}