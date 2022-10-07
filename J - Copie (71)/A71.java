abstract	class	Figure
{	
    abstract	public	void	affiche()	;
    abstract	public	void	homothetie	(double	coef)	;
    abstract	public	void	rotation	(double	angle)	;
    
    public	void	HomoRot	(double	coef,	double	angle)
    {	
        homothetie	(coef)	;	rotation	(angle)	;
    }

    public	static	void	afficheFigures	(Figure	[]	f)
    {	
        for	(int	i=0	;	i<f.length	;	i++)	f[i].affiche()	;
    }

    public	static	void	homothetieFigures	(double	coef,	Figure[]	f)
    {	
        for	(int	i=0	;	i<f.length	;	i++)	f[i].homothetie(coef)	;
    }

    public	static	void	rotationFigures	(double	angle,	Figure[]	f)
    {	
        for	(int	i=0	;	i<f.length	;	i++)	f[i].rotation(angle)	;
    }
}

public	class	A71
{	
    public	static	void	main	(String	args[])
    {	
    }
}