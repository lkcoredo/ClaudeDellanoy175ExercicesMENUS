import	javax.swing.*	;						//	pour	JFrame
import	java.awt.event.*	;			//	pour	MouseEvent	et	MouseListener

class	MaFenetre	extends	JFrame	implements	MouseListener
{	
    public	MaFenetre	()
    {	
        nbFen++	;
        num	=	nbFen	;
        setTitle	("Fenetre	numero	"	+	num)	;
        setBounds	(10,	20,	300,	200)	;
        addMouseListener	(this)	;
    }

    public	void	mousePressed	(MouseEvent	ev)
    {	
        System.out.println	("appui	dans	fen	num	"	+	num
        +	"	en	"	+	ev.getX()	+	"	"	+	ev.getY())	;
    }

    public	void	mouseReleased(MouseEvent	ev)
    {	
        System.out.println	("relachement	dans	fen	num	"	+	num
        +	"	en	"	+	ev.getX()	+	"	"	+	ev.getY())	;
    }

    public	void	mouseClicked(MouseEvent	ev)	{}
    public	void	mouseEntered	(MouseEvent	ev)	{}
    public	void	mouseExited	(MouseEvent	ev)	{}
    private	static	int	nbFen=0	;
    private	int	num	;
}

public	class	A101
{	
    public	static	void	main	(String	args[])
    {	
        final	int	nFen	=	3	;
        for	(int	i=0	;	i<nFen	;	i++)
        {	
            MaFenetre	fen	=	new	MaFenetre()	;
            fen.setVisible(true)	;
        }
    }
}