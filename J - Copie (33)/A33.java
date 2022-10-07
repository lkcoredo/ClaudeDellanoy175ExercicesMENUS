public class A33 {
    public	void	f	(int	n)											{		}
    //public	int	f	(int	p)												{		}
    //Les	deux	méthodes	f	ont	des	arguments	de	même	type	(la	valeur	de	retour	n’intervenant
    //pas	dans	la	surdéfinition	des	fonctions).	Il	y	a	donc	une	ambiguïté	qui	sera	détectée	dès
    //la	compilation	de	la	classe,	indépendamment	d’une	quelconque	utilisation.
    public	void	g	(float	x)									{		}
    public	void	g	(final	double	y)		{		}
    public	void	h	(long	n)										{		}
    //public	int	h	(final	long	p)						}
    //Enfin,	les	deux	méthodes	h	ont	des	arguments	de	même	type	(long),	le	qualificatif	final
    //n’intervenant	pas	ici.	La	compilation	signalera	également	une	ambiguïté	à	ce	niveau
}
