//Priorités	des	opérateurs
//arithmétiques	et	parenthèses

class	A
{	
    /**
     * @param args
     */
    public	static	void	main	(String	args[])
    {	
        int a = 2;
        final int b = 6;
        int c = 3;
        int x = 4;
        int p = 4;
        int y = 48;
        final int z = 12;
        int n = 4;
        int d = (a	+	b)	-	(2	*	c);			//	expression	1
        d = (2	*	x)	/	(y	*	z);			//	expression	2
        d = (x	+	3)	*	(n%p);							//	expression	3
        d = (-a)	/	(-(b	+	c));					//	expression	4
        d = (x/y)%(-z);												//	expression	5
        d = x/(y%(-z));												//	expression	6
    }

}


    

// En	Java,	le	transfert	des	arguments	à	une	méthode	se	 fait	toujours	par	valeur.	Mais	la
// valeur	d’une	variable	de	type	objet	est	sa	référence.	D’où	les	résultats	: