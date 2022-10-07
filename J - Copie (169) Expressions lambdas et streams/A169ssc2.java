import java.util.function.IntPredicate;

public class A169ssc2 {

    public static void main(String[] args) {
        int [] tab = {2, 4, 5, 7, -5, -4, -3, 11};
        System.out.println("POSITIF");
        affichage_selectif(tab, A169ssc2::filtragePositifs);
        System.out.println("NEGATIF");
        affichage_selectif(tab, A169ssc2::filtrageNegatifs);
        System.out.println("PAIRES");
        affichage_selectif(tab, A169ssc2::filtragePaires);
    }

    private static void affichage_selectif(int[] t, IntPredicate f) {
        for(int val : t) if (f.test (val)) System.out.println(val);
    }

    public static Boolean filtragePositifs (int n) { 
        return n > 0;};
    public static Boolean filtrageNegatifs (int n) { 
        return n < 0;};
    public static Boolean filtragePaires (int n) { 
        return 2*(n/2) == n;};
    
}