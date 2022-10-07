public class A169ssc {
   public static void main(String[] args) {
        int [] tab = {2, 5, 0, -4, -2, -11};
        System.out.println("positif");
        affichage_selectif(tab, ee -> ee > 0);
        System.out.println("negatif");
        affichage_selectif(tab, ee -> ee < 0);
        System.out.println("paires");
        affichage_selectif(tab, ee -> 2	*	(ee/2)	==	ee);
   }

    private static void affichage_selectif(int[] t, Filtrage f) {
        for (int val : t) {
            if (f.filtre (val)) {
                System.out.println(val + " * ");
            }
        }
    }
}

interface Filtrage {
    public Boolean filtre(int n);
}


