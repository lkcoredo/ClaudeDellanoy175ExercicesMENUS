class	A
{	 
    public	 void	 f(double	 x)	 {	 System.out.print	 ("A.f(double="	 +	 x+")	")	;	}
}

class	B	extends	A	{}

class	C	extends	A
{	
    public	void	f(long	q)	{	System.out.print	("C.f(long="	+	q	+	")")	;	}
}

class	D	extends	C
{	 
    public	 void	 f(int	 n)	 {	 System.out.print	 ("D.f(int="	 +	 n	 +	 ")")	;	}
}

class	E	extends	B	{}

class	F	extends	C
{	 
    public	 void	 f(float	 x)	 {	 System.out.print	 ("F.f(float="	 +	 x	 +")	")	;}
    public	 void	 f(int	 n)	 {	 System.out.print	 ("F.f(int="	 +	 n	 +	 ")")	;	}
}

public	class	A66
{	
    public	static	void	main	(String	arg[])
    {	
        byte	bb=1	;	short	p=2	;	int	n=3	;	long	q=4	;
        float	x=5.f	;	double	y=6.	;
        A	a	=	new	A()	;	a.f(bb)	;	a.f(x)	;	System.out.println()	;
        B	b	=	new	B()	;	b.f(bb)	;	a.f(x)	;	System.out.println()	;
        C	 c	 =	 new	 C()	 ;	 c.f(bb)	 ;	 c.f(q)	 ;	 c.f(x)	 ;
        System.out.println()	;
        D	 d	 =	 new	 D()	 ;	 d.f(bb)	 ;	 c.f(q)	 ;	 c.f(y)	 ;
        System.out.println()	;
        E	 e	 =	 new	 E()	 ;	 e.f(bb)	 ;	 e.f(q)	 ;	 e.f(y)	 ;
        System.out.println()	;
        F	f	=	new	F()	;	f.f(bb)	;	f.f(n)	;	f.f(x)	;	f.f(y)	;	f.f(p)	;
    }
}
