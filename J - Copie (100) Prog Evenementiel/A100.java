import	javax.swing.*	;						//	pour	JFrame
import	java.awt.event.*	;			//	pour	MouseEvent	et	MouseListener

class	MaFenetre	extends	JFrame	implements	MouseListener
{	
    public	MaFenetre	()				//	constructeur
    {	
        setTitle	("Gestion	de	clics")	;
        setBounds	(10,	20,	300,	200)	;
        addMouseListener	(this)	;			//	la	fenetre	sera	son	propre	écouteur
        //	d'événements	souris
    }

    public	void	mousePressed	(MouseEvent	ev)
    {	
        System.out.println	("appui	en	"	+	ev.getX()	+	"	"	+	ev.getY())	;
    }

    public	void	mouseReleased(MouseEvent	ev)
    {	 
        System.out.println	 ("relachement	 en	 "	 +	 ev.getX()	 +	 "	 "	 + ev.getY())	;
    }

    public	void	mouseClicked(MouseEvent	ev)	{}
    public	void	mouseEntered	(MouseEvent	ev)	{}
    public	void	mouseExited	(MouseEvent	ev)	{}

}

public	class	A100
{	
    public	static	void	main	(String	args[])
    {	
        MaFenetre	fen	=	new	MaFenetre()	;
        fen.setVisible(true)	;
    }
}


