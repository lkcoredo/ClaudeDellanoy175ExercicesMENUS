public class A46 {
    public	static	void	main	(String	args[])
    {	
        int	n=10	;
        final	int	p=5	;
        int	t1[]	=	{1,	3,	5}	;
        int	t2[]	=	{n-1,	n,	n+1}	;
        int	t3[]	=	{p-1,	p,	p+1}	;
        int	t4[]	=	{0};
        //t4	=	{1,	3, 5}	;
        float	x1[]	=	{1,	2,	p,	p+1}	;
        //float	x2[]	=	{1.25,	2.5,	5}	;
        double	x3[]	=	{1,	2.5,	5.25,	2*p}	;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(x1);
        System.out.println(x3);
        System.out.println(t4);
    }
}
