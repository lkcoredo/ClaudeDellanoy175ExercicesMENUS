class	A
{	
    static	int	f	(int	n)
    {
        return n;	
        //q	=	n	; // Cannot make a static reference to the non-static field q
    }

    void	g	(int	n)
    {	
        q	=	n	;
        //p	=	n	; // p est final et doit donc être initialisé au plus tard avec le constructeur
    }

    static	private	final	int	p	=	20	;
    private	int	q	;


    }

public	class	A29
{	
        public	static	void	main	(String	args[])
    {	
        A	a	=	new	A()	;	int	n	=	5	;
        a.g(n)	;
        A.f(n)	; //The static method f(int) from the type A should be accessed in a static way (a.f(n))
         // f(n) Quant	 à	l’appel	f(n)	 il	 est	 incorrect
        // puisqu’il	n’existe	pas	de	méthode	f	dans	la	classe	EssaiA1
        //.	 Il	est	probable	que	l’on	a
        //voulu	écrire	A.f(n).
    }
}
