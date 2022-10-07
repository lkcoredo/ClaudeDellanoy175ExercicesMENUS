class	SexDec
{	
    public	SexDec	(double	dec)
    {	
        h	=	(int)dec	;
        int	minDec	=	(int)(60*(dec-h))	;
        mn	=	(int)minDec	;
        s	=	(int)(60*(minDec-mn))	;
    }

    public	SexDec	(int	h,	int	mn,	int	s)
    {	
        this.h	=	h	;	this.mn	=	mn	;	this.s	=	s	;
    }
    
    public	double	getDec()
    {	
        return	(3600*h+60*mn+s)/3600.	;
    }
    
    public	int	getH()
    {	
        return	h	;
    }
    
    public	int	getM()
    {	
        return	mn	;
    }
    
    public	int	getS()
    {	
        return	s	;
    }
    private	int	h,	mn,	s	;
}

public	class	A45b
{	
    public	static	void	main	(String	args[])
    {	
        SexDec	h1	=	new	SexDec(4.51)	;
        System.out.println	("h1	-	decimal	=	"	+	h1.getDec()
        +"	Sexa	=	"	+	h1.getH()	+	"	"	+	h1.getM()	+	"	"	+	h1.getS())	;
        SexDec	h2	=	new	SexDec	(2,	32,	15)	;
        System.out.println	("h2	-	decimal	=	"	+	h2.getDec()
        +"	Sexa	=	"	+	h2.getH()	+	"	"	+	h2.getM()	+	"	"	+	h2.getS())	;
    }
}