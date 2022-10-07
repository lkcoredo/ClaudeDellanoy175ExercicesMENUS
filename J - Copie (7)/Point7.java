public class Point7 {

    public static void main(String[] args) {
        byte	b	;	short	p	;	int	n	=1;	long	q	= 1;
        final	int	N=10	;
        float	x	=1;	double	y	;
        //b	=	n;						//	impossible : Type mismatch: cannot convert from int to byte
        System.out.println("n: " + n + " //  " + type(n));
        System.out.println();
        System.out.println();
        // D’une	manière	générale,	la	conversion	de	int	en	byte	n’est	pas	acceptée	par	affectation.
        // Mais	 une	 exception	 a	 lieu	 pour	 les	 expressions	 constantes	 (calculables	 à	 la
        // compilation),	à	condition	que	leur	valeur	soit	représentable	dans	le	type	d’arrivée,	ce
        // qui	est	manifestement	le	cas	ici
        System.out.println("x: " + x + " //  " + type(x));
        System.out.println();
        System.out.println();
        b	=	25;					//	
        System.out.println(b + " //  " + type(b));
        System.out.println();
        System.out.println();
        // b	=	500	;			//	impossible : Type mismatch: cannot convert from int to byte
        x	=	2*q	;			
        System.out.println("x: " + x + " // " + type(x));
        System.out.println();
        System.out.println();
        y	=	b*b	;			//	
        System.out.println(y + " //  " + type(y));
        System.out.println();
        System.out.println();
        //p	=	b*b	;			//	impossible Type mismatch: cannot convert from int to short
        //b	=	b+5	;			//	 impossible Type mismatch: cannot convert from int to byte
        p	=	5*N-3	;	//	
        System.out.println(p + " //  " + type(p));
        System.out.println();
        System.out.println();
    }

    public static String type(Object value) {
        if (value.getClass() == Integer.class) {
            System.out.println("This is an Integer");
        }else if(value.getClass() == String.class){
            System.out.println("This is a String");
        }else if(value.getClass() == Float.class){
            System.out.println("This is a Float");
        }else if(value.getClass() == Short.class){
            System.out.println("This is a Short");
        }else if(value.getClass() == Double.class){
            System.out.println("This is a Double");
        }else if(value.getClass() == Byte.class){
            System.out.println("This is a Byte");
        }else if(value.getClass() == Long.class){
            System.out.println("This is a Long");
        }
        return "";
    }
}


// Impossible :
// Int => Byte (avec exception*)
// Int => Short
// Int => Char
// Float => Int
// String => Chat
// Double => Float
