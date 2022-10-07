import	java.util.*	;
class A163b {
    public static void main(String[] args) {
        /*L’affichage	dans	l’ordre	naturel	peut	se	faire	:
        •	en	utilisant	la	boucle	dite	for…	each	: */
        ArrayList	<Integer>	tab = new ArrayList<Integer>();	;
        //ArrayList	<Integer>	itp	;
        
        for	(int	elem	:	tab)	System.out.print	(elem	+	"	")	;
        //•	en	utilisant	le	recours	automatique	à	la	méthode	toString	de	ArrayList	:
        System.out.println	(tab)	;
        //•	en	recourant	à	la	méthode	get	pour	parcourir	les	différents	éléments	du	tableau	:
        
        for	(int	i=0	;	i<tab.size()	;	i++)	System.out.print	(tab.get(i)+	"")	;
        //•	en	utilisant	un	itérateur	:
        ListIterator	<Integer>	it	=	tab.listIterator()	;
        
        while	(it.hasNext())	System.out.print	(it.next()	+	"	")	;
        //L’affichage	 dans	 l’ordre	 inverse	 ne	 peut	 plus	 utiliser	 les	 deux	 premières	 démarches.-//Les	deux	dernières	restent	applicables	:
        
        for	(int	i=tab.size()-1	;	i>=0	;	i--)	System.out.print	(tab.get(i)+"	")	;
        ListIterator	 <Integer>	 itr	 =	 tab.listIterator(tab.size())	 ;	 //	 fin de	liste
        
        while	(itr.hasPrevious())	System.out.print(itr.previous()	+	"	")	;
        //447
        //Il	en	va	de	même	pour	l’affichage	des	éléments	de	rang	pair	:
        
        for	(int	i=0	;	i<tab.size()	;	i+=2)	System.out.print	(tab.get(i)+	"")	;
        System.out.println	("\nelements	de	rang	pair	-	methode	2")	;
        

        /*while	(itp.hasNext())
        {	
            System.out.print(itp.next()	+	"	")	;
            itp.next();
        }*/
        //La	mise	à	zéro	des	éléments	négatifs	ne	peut,	là	encore,	se	faire	qu’en	utilisant	soit	les
        //méthodes	get	et	set,	soit	un	itérateur	:
        for	(int	i=0	;	i<tab.size()	;	i++)	if	(tab.get(i)	<	0)	tab.set	(i,0)	;
        ListIterator	<Integer>	itz	=	tab.listIterator()	;
        while	(itz.hasNext())if	(itz.next()	<	0)	itz.set(0)	;
        //Notez	 bien	 que	 la	 boucle	 for…	 each	 ne	 permet	 que	 des	 consultations	 des	 éléments
        //d’une	 collection.	 Elle	 n’est	 donc	 pas	 utilisable	 ici.	 Bien	 que	 correcte	 sur	 un	 plan
        //syntaxique,	 l’instruction	 suivante	 se	 contenterait	 d’agir	 à	 plusieurs	 reprises	 sur	 la
        //valeur	de	elem	(la	mettant	à	zéro	lorsqu’elle	est	négative),	mais	laisserait	inchangée	la
        //valeur	correspondante	du	tableau	:
        for	(int	elem	:	tab)	if	(elem	<	0)	elem	=	0	;
        //Voici	 un	 exemple	 de	 programme	 complet	 reprenant	 ces	 diverses	 démarches,
        //accompagné	d’un	exemple	d’exécution.	Notez	que,	pour	tester	les	démarches	de	mise	à
        //zéro	des	éléments	négatifs,	nous	avons	dû	travailler	sur	une	copie	du	tableau	initial.
        //
    }
}



public	class	A163
{	
    public	static	void	main	(String	args[])
    {	
        int	t[]	=	{	3,	-5,	9,	2,	0,	-8,	12,	7,	3,	12	}	;
        ArrayList	<Integer>	tab	=	new	ArrayList<Integer>	()	;
        for	(int	elem	:	t)	tab.add	(elem)	;
        //	affichage	ordre	naturel
        System.out.println	("ordre	naturel	-	methode	1")	;
        for	(int	elem	:	tab)	System.out.print	(elem	+	"	")	;
        System.out.println	("\nordre	naturel	-	methode	2")	;
        System.out.println	(tab)	;
        System.out.println	("ordre	naturel	-	methode	3")	;
        for	(int	i=0	;	i<tab.size()	;	i++)	System.out.print	(tab.get(i)+	"")	;

        System.out.println	("\nordre	naturel	-	methode	4")	;
        ListIterator	<Integer>	it	=	tab.listIterator()	;
        while	(it.hasNext())	System.out.print(it.next()	+	"	")	;
        //	affichage	ordre	inverse
        System.out.println	("\nordre	inverse	-	methode	1")	;
        for	 (int	 i=tab.size()-1	 ;	 i>=0	 ;	 i--)	 System.out.print
        (tab.get(i)+	"	")	;
        System.out.println	("\nordre	inverse	-	methode	2")	;
        ListIterator	<Integer>	itr	=	tab.listIterator(tab.size())	;	//	fin de	liste
        while	(itr.hasPrevious())	System.out.print(itr.previous()	+	"	")	;
            //	affichage	éléments	de	rang	pair
        System.out.println	("\nelements	de	rang	pair	-	methode	1")	;
        for	(int	i=0	;	i<tab.size()	;	i+=2)	System.out.print	(tab.get(i)+
        "	")	;
        System.out.println	("\nelements	de	rang	pair	-	methode	2")	;
        ListIterator	<Integer>	itp	=	tab.listIterator()	;
        while	(itp.hasNext())
        {	System.out.print(itp.next()	+	"	")	;
        itp.next();
        }
            //	mise	a	zero	d'une	copie	de	tab
        ArrayList	<Integer>	tab1	=	new	ArrayList<Integer>	(tab)	;
        System.out.println	("\nmise	a	zero	-	methode	1")	;
        for	(int	i=0	;	i<tab1.size()	;	i++)	if	(tab1.get(i)	<	0)	tab1.set
        (i,	0)	;
        System.out.println	(tab1)	;
        tab1	=	new	ArrayList<Integer>	(tab)	;
        System.out.println	("mise	a	zero	-	methode	2")	;
        ListIterator	<Integer>	itz	=	tab1.listIterator()	;
        while	(itz.hasNext())if	(itz.next()	<	0)	itz.set(0)	;
        System.out.println	(tab1)	;
    }
}

        /* 
        ordre	naturel	-	methode	1
        3	-5	9	2	0	-8	12	7	3	12
        ordre	naturel	-	methode	2
        [3,	-5,	9,	2,	0,	-8,	12,	7,	3,	12]
        449
        ordre	naturel	-	methode	3
        3	-5	9	2	0	-8	12	7	3	12
        ordre	naturel	-	methode	4
        3	-5	9	2	0	-8	12	7	3	12
        ordre	inverse	-	methode	1
        12	3	7	12	-8	0	2	9	-5	3
        ordre	inverse	-	methode	2
        12	3	7	12	-8	0	2	9	-5	3
        elements	de	rang	pair	-	methode	1
        3	9	0	12	3
        elements	de	rang	pair	-	methode	2
        3	9	0	12	3
        mise	a	zero	-	methode	1
        [3,	0,	9,	2,	0,	0,	12,	7,	3,	12]
        mise	a	zero	-	methode	2
        [3,	0,	9,	2,	0,	0,	12,	7,	3,	12]*/