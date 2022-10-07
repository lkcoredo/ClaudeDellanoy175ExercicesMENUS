class	Couple<T>
{	
    private	T	x,	y	;						//	les	deux	éléments	du	couple
    
    public	Couple	(T	premier,	T	second)
    {	
        x	=	premier	;	y	=	second	;
    }

    public	void	affiche	()
    {	
        System.out.println	("premiere	valeur	:	"	+	x
        +	"	-	deuxieme	valeur	:	"	+	y	)	;
    }
}

class	CoupleNomme	<T>	extends	Couple	<T>
{	
    private	String	nom	;

    public	CoupleNomme	(T	premier,	T	second,	String	nom)
    {	
        super	(premier,	second)	;
        this.nom	=	nom	;
    }

    public	void	affiche	()
    {	
        System.out.print	("nom	=	"	+	nom	+	"	-	"	)	;
        super.affiche()	;
    }
}

class	PointNomme	extends	Couple	<Integer>
{	
    private	String	nom	;

    public	PointNomme	(Integer	premier,	Integer	second,	String	nom)
    {	
        super	(premier,	second)	;
        this.nom	=	nom	;
    }

    public	void	affiche	()
    {	
        System.out.print	("nom	=	"	+	nom	+	"	-	"	)	;
        super.affiche()	;
    }
}

public	class	A158
{	
    public	static	void	main	(String	args[])
    {	
        Couple	<Double>	cd1	=	new	Couple	<Double>	(5.0,	2.5)	;
        cd1.affiche	()	;
        Couple	<Double>	cd2	=	new	Couple	<Double>	(5.0,	2.5)	;
        cd2.affiche	()	;
        CoupleNomme	<String>	cns
            =	new	CoupleNomme	<String>	("hello",	"bonjour",	"saluts")	;
        cns.affiche	()	;
        CoupleNomme	<Couple<Double>>	cnd
            =	new	CoupleNomme	<Couple<Double>>	(cd1,	cd2,	"cf1")	;
        cnd.affiche	()	;
        PointNomme	p1	=	new	PointNomme	(2,	5,	"Point1")	;
        p1.affiche()	;
	}
}