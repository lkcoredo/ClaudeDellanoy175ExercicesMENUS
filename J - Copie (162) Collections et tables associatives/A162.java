import	java.util.*;
public	class	A162
{	
    public	static	void	main	(String	args[])
    {	
        LinkedList<Integer>	liste	=	new	LinkedList	<Integer>	()	;
        liste.add	(3)	;	
        liste.add	(5)	;	
        liste.add	(3)	;
        liste.add	(12)	;
        liste.add	(3)	;
        System.out.println	(liste)	;
        liste.remove	(3)	;	System.out.println	(liste)	;
        liste.remove	(new	Integer(3))	;	System.out.println	(liste)	;
        Iterator	<Integer>	it	=	liste.iterator	()	;
        
        while	(it.hasNext())
        if	(it.next()==3)	it.remove()	;
        System.out.println	(liste)	;
    }
}

/*Rappelons	 tout	 d’abord	 que,	 depuis	 Java	 5,	 les	 possibilités	 dites	 d’emballage	 et	 de
déballage	automatiques	 (autoboxing)	 permettent	le	 recours	automatique	à	 des	classes
enveloppes.	Ainsi,	l’appel	: liste.add	(3)	;
remplace	avantageusement	:
liste.add	(new	Integer(3))	;
Cependant,	cette	démarche	ne	s’applique	plus	dans	l’appel	:
liste.remove	(3)	;
En	effet,	il	existe	une	méthode	remove	(int)	qui,	compte	tenu	des	 règles	 relatives	à	la
surdéfinition,	se	trouvera	appelée	ici.	Elle	supprime	l’élément	de	rang	3	de	liste.
En	revanche	:
liste.remove	(new	Integer(3))	;
445
supprime	bien	le	premier	élément	de	la	liste	dont	la	valeur	est	égale	à	3.	Rappelons	que
l’égalité	se	fonde	sur	la	méthode	equals	laquelle,	dans	le	cas	des	classes	enveloppes,
considère	bien	la	valeur	des	objets.
Enfin,	la	boucle	:
while	(it.hasNext())if	(it.next()==3)	it.remove()	;
permet	de	supprimer	tous	les	éléments	(restants)	dont	la	valeur	est	égale	à	3.	Rappelons
que	 la	 méthode	 remove	 supprime	 l’élément	 courant	 (c’est-à-dire	 celui	 désigné	 par
l’itérateur).
Enfin,	dans	une	instruction	telle	que	:
System.out.println	(liste)	;
il	 y	 a	 appel	 de	 la	 méthode	 toString	 de	 l’objet	 liste.	 Celle-ci,	 comme	 pour	 toute
collection,	appelle	la	méthode	toString	de	chacun	de	ses	éléments.
 */

