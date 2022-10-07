class	A
{	
    public	void	f(int	n,	float	x)
    {	
        System.out.println	("f(int	n,	float	x)	n	=	"	+	n	+	"	x	=	"	+x)	;
    }

    private	void	f(long	q,	double	y)
    {	
        System.out.println	("f(long	q,	double	y)	q	=	"	+	q	+	"	y	=	"+	y)	;
    }

    public	void	f(double	y1,	double	y2)
    {	
        System.out.println	("f(double	y1,	double	y2)	y1	=	"	+	y1	+	"y2	=	"	+	y2)	;
    }

    public	void	g()
    {	
        int	n=1	;	long	q=12	;	float	x=1.5f	;	double	y	=	2.5	;
        System.out.println	("---	dans	g	")	;
        f(n,	q)	;
        f(q,	n)	;
        f(n,	x)	;
        f(n,	y)	;
    }
}

public	class	A37
{	
    public	static	void	main	(String	args[])
    {	
        A	a	=	new	A()	;
        a.g()	;
        System.out.println	("---	dans	main")	;
        int	n=1	;	long	q=12	;	float	x=1.5f	;	double	y	=	2.5	;
        a.f(n,	q)	;
        a.f(q,	n)	;
        a.f(n,	x)	;
        a.f(n,	y)	;
    }
}
