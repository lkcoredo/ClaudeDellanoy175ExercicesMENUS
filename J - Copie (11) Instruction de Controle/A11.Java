class A11{
    public static void main(String[] args) {
        System.out.println("START");
        int a = 1;
        int b = 5;
        //	groupe	1
        if	(a	<	b)	{
            System.out.println	("ascendant");
        } else {
            System.out.println	("non	ascendant")	;
        }	

        
        //	groupe	2
        if	(a	<	b)	{	System.out.println	("ascendant")	;	int max	=	b;	}


        //	groupe	3
        int	n=(6),	p	;

        switch	(n)	{	
                case	2	:	System.out.println  ("petit")	;	break	;
                case	4	:	System.out.println  ("limite")	;	break	;
                case	6	:	System.out.println  ("grand")	;	break	;
        }

        //	groupe	4
        final	int	LIMITE	=	20	;
        n = 21;
        switch	 (n)	 {	 
            case	 LIMITE-1	 :	 System.out.println     ("un peu trop petit")	;	break	;
            case	LIMITE	:	System.out.println  ("OK")	;	break	;
            case	 LIMITE+1	 :	 System.out.println	    ("un peu trop grand")	;	break	;
        }
        
        System.out.println("END");
    }
}