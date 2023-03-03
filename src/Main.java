public class Main {
    public  static int [] insertion_calcul (int tab []) {
        int a, j;         for (int i = 1; i < tab.length ; i++) {
            a = tab[i];
            j= i;
            while ( (j > 0) && (tab[j-1] > a)) {
                tab[j] = tab[j - 1];
                j--;
            }
            tab[j] = a;
        }         return tab;
    }      public  static  void aff(int tab[]) {
        for (int i = 0; i < tab.length; i++){
            System.out.print(""+tab[i]+ " - ");
        }
    }     public static void main(String[] args) {
        int test[] = {15,5,1,0,13,16,4,8,9,6,7, 18, -5, -4, 110, 104};
        test =  insertion_calcul(test);
        aff(test);
    }
}