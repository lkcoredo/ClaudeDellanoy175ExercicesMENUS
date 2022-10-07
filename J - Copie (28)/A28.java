class	A
{	
    void	f	(int	n,	float	x)	{	System.out.println("f");	}
    void	g	(byte	b)	{	System.out.println("g");	}
}

public	class	A28
{	
    A	a	;	int	n	;	byte	b	;	float	x	;	double	y	;


    //a.f	(n,	x)	;
    //a.f	(b+3,	x)	;
    //a.f	(b,	x)	;
    //a.f	(n,	y)	;
    //a.f	(n,	(float)y)	;
    //a.f	(n,	2*x)	;
    //a.f	(n+5,	x+0.5)	;
    //a.g	(b)	;
    //a.g	(b+1)	;
    //a.g	(b++)	;
    //a.g	(3)	;
}
