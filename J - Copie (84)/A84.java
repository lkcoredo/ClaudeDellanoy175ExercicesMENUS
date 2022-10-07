
public	class	A84
{	
    public	static	void	main	(String	args[])
    {	
        System.out.println(	"Liste	des	valeurs	du	type	Suite	:	"	)	;
        for	(Suite	s	:	Suite.values()	)
        System.out.println	(s)	;					//	appel	implicite	de	toString	()
    }
}
enum	Suite	{	ut,	re,	mi,	fa,	sol,	la,	si	}
