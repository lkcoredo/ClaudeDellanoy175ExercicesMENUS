abstract	class	Figure
{	
    abstract	public	void	affiche()	;
    abstract	public	void	homothetie	(double	coef)	;
    abstract	public	void	rotation	(double	angle)	;
}

class	Point	extends	Figure
{	
    public	void	affiche()	{		}
    public	void	homothetie	(double	coef)	{		}
    public	void	rotation	(double	angle)	{		}
}

public	class	A70
{	
    public	static	void	main	(String	args[])
    {	
        Point	pn1	=	new	Point	()	;
        Point	pn2	=	new	Point	()	;
        System.out.println(pn1);
        System.out.println(pn2);
    }
}