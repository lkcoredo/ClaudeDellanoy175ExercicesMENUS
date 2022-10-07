
public class A10 {
    public	static	void	main(String[]	args)
    {	
        int	n=10,p=5,q=10,w=20;
        n	=	p	=	q	=	5	;
        n	+=	p	+=	q	;
        System.out.println	("A	:	n	=	"	+	n	+	"	p	=	"	+	p	+	"	q	=	"	+q)	;
        q	=	n	<	p	?	n++	:	p++	;
        System.out.println	("B	:	n	=	"	+	n	+	"	p	=	"	+	p	+	"	q	=	"	+q)	;
        q	=	n	>	p	?	n++	:	p++	;
        System.out.println	("C	:	n	=	"	+	n	+	"	p	=	"	+	p	+	"	q	=	"	+q)	;
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("w : " + w);
        System.out.println("n : " + n);
        System.out.println("p : " + p);
        System.out.println("w = n > p ? n++ : p++; ");
        w = n > p ? n++ : p++;
        System.out.println("w : " + w);
        System.out.println("n : " + n);
        System.out.println("p : " + p);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("boolean yw = n > p ? true : false;");
        boolean yw = n > p ? true : false;
        System.out.println(yw);
        System.out.println();
        System.out.println();
        System.out.println();
        n = 2;
        p = 12;
        boolean cyw;
        System.out.println("boolean cyw = n > p ? true : false;");
        System.out.println(cyw = n > p ? true : false);
        System.out.println(cyw);
    }
}
