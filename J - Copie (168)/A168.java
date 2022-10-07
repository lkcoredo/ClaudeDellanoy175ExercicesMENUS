import	java.util.*	;
public	class	A168
{	
    public	static	void	main	(String	args[])
    {	
        Index	monIndex	=	new	Index	()	;	
        monIndex.ajouter	("Java",	25)	;
        monIndex.ajouter	("C++",	45)	;	
        monIndex.ajouter	("Java",	12)	;
        monIndex.ajouter	 ("objet",	 15)	 ;	 
        monIndex.ajouter("polymorphisme",	45)	;
        monIndex.ajouter	 ("objet",	 45)	 ;	 
        monIndex.ajouter	 ("langage", 25)	;
        monIndex.creationIndexPage	()	;
        monIndex.listeIndexPage	()	;
    }
}

class	Index
{	
    public	Index	()	
    {	//	comme	precedemment
        index	=	new	TreeMap	<String,	TreeSet	<Integer>	>	()	;		
    }

    public	 void	 ajouter	 (String	 entree,	 int	 numero)	 
    {	//	comme	precedemment
        //	si	entree	n'existe	pas	dans	l'index,	on	l'ajoute,	associe	au numero
        //	sinon,	on	ajoute	le	numero	de	page	a	l'ensemble	des	numeros
        //	deja	associes	a	entree
        TreeSet	<Integer>	numerosExistants	=	index.get(entree)	;

        if	(numerosExistants	==	null)
        {	
            TreeSet	<Integer>	numeroNouveauNom	=	new	TreeSet	<Integer>	()	;
            numeroNouveauNom.add	(numero)	;
            index.put	(entree,	numeroNouveauNom)	;
        }
        else
        {	
            numerosExistants.add	(numero)	;
            index.put(entree,	 numerosExistants)	 ;	 	 //	 remplace	 l'entree precedente
        }
    }

    public	void	liste	()	
    {	//	comme	precedemment
        Set	<Map.Entry	<String,	TreeSet	<Integer>	>	>
        elementsIndex	=	index.entrySet	()	;
        
        for	 (Map.Entry	 <String,	 TreeSet	 <Integer>	 >	 elementCourant	 : elementsIndex)
        {	
            String	entreeCourante	=	elementCourant.getKey	()	;
            TreeSet	<Integer>	numeros	=	elementCourant.getValue	()	;
            System.out.print	(entreeCourante	+	"	:	")	;
            
            for	(int	num	:	numeros)	System.out.print	(num	+	"	")	;
            System.out.println	()	;
        }
    }

    public	void	creationIndexPage	()
    {	
        indexPage	=	new	TreeMap	<Integer,	TreeSet	<String>	>	()	;
        Set	<Map.Entry	<String,	TreeSet	<Integer>	>	>
            elementsIndex	=	index.entrySet	()	;
        
        for	 (Map.Entry	 <String,	 TreeSet	 <Integer>	 >	 elementCourant	 : elementsIndex)
        {	
            String	entreeCourante	=	elementCourant.getKey	()	;
            TreeSet	<Integer>	pagesCourantes	=	elementCourant.getValue	()	;
        
            for	(Integer	numero	:	pagesCourantes)
            {	
                TreeSet	<String>	entreesExistantes	=	indexPage.get(numero)	;

                if	(entreesExistantes	==	null)
                {	 
                    TreeSet	 <String>	 entreeNouveauNumero	 =	 new	 TreeSet	 <String>()	;
                    entreeNouveauNumero.add(entreeCourante)	;
                    indexPage.put(numero,	entreeNouveauNumero)	;
                }
                else
                {	
                    entreesExistantes.add(entreeCourante)	;
                    indexPage.put	(numero,	entreesExistantes)	;
                }
            }   
        }
    }

    public	void	listeIndexPage	()
    {	
        if	(indexPage	==	null)	return	;
        Set	<Map.Entry	<Integer,	TreeSet	<String>	>	>
        elementsIndexPage	=	indexPage.entrySet	()	;
        
        for	 (Map.Entry	 <Integer,	 TreeSet	 <String>	 >	 numero	 : elementsIndexPage)
        {	
            Integer	numeroCourant	=	numero.getKey	()	;
            TreeSet	<String>	entrees	=	numero.getValue	()	;
            System.out.print	(numeroCourant	+	"	:	")	;
            for	(String	entree	:	entrees)	System.out.print	(entree	+	"	")	;
            System.out.println	()	;
        }
    }

    private	TreeMap	<String,	TreeSet	<Integer>	>	index	;
    private	TreeMap	<Integer,	TreeSet	<String>	>	indexPage	;
}