public class Point4 {
    public static void main(String[] args) {
        char	c	=	60,	ce	=	'e',	cg	=	'g'	;
        byte	b	=	10	;
        System.out.println("c : " + c);
        System.out.println("b : " + b);
        System.out.println("ce : " + ce);
        System.out.println("cg : " + cg);
        int v = 0;
        System.out.println("v : " + v + " type : " + type(v));
        v = c	+	1;
        System.out.println("v : " + v + " type : " + type(v));
        v = 2	*	c;
        System.out.println("v : " + v + " type : " + type(v));
        v = cg	-	ce;
        System.out.println("v : " + v + " type : " + type(v));
        v = b	*	c;
        System.out.println("v : " + v + " type : " + type(v));
    }

    public static String type(Object value) {
        if (value.getClass() == Integer.class) {
            System.out.println("This is an Integer");
        }else if(value.getClass() == String.class){
            System.out.println("This is a String");
        }else if(value.getClass() == Float.class){
            System.out.println("This is a Float");
        }
        return "";
    }

}

