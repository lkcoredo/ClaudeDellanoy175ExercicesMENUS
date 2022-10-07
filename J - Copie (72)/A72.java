interface	Affichable
{	
    abstract	public	void	affiche()	;
}

interface	Transformable
{	
    abstract	public	void	homothetie	(double	coef)	;
    abstract	public	void	rotation	(double	angle)	;
}

class	Point	implements	Affichable
{	
    public	void	affiche()	{		}
}

class	Rectangle	implements	Affichable,	Transformable
{	
    public	void	affiche()	{		}
    public	void	homothetie	(double	coef)	{	}
    public	void	rotation	(double	angle)	{	}
}

public class A72 {
    public static void main(String[] args) {
        int coef = 3;
        int angle = 90;
        Rectangle r = new Rectangle();
        Point p = new Point();
        r.homothetie(coef);
        r.rotation(angle);
        r.affiche();
        p.affiche();
        System.out.println();
    }
}