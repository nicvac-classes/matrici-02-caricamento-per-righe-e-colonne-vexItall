
public class Esercizio {

    public static void riempiPerRighe(int[][] M, int righe, int colonne) {
        int c = 1;
        int i = 0;
        while(i < righe){
            int j = 0;
            while(j < colonne){
                M[i][j] = c;
                ++c;
                ++j;
            }
            ++i;
        }
    }

    public static void riempiPerColonne(int[][] M, int righe, int colonne) {
        int c = 1;
        int j = 0;
        while(j < colonne){
            int i = 0;
            while(i < righe){
                M[i][j] = c;
                ++c;
                ++i;
            }
            ++j;
        }
    }

    public static void main(String[] args) {
        
        int righe = 5;
        int colonne = 5;

        int[][] matricePerRighe = new int[righe][colonne];
        int[][] matricePerColonne = new int[righe][colonne];

        System.out.println("Per righe");
        riempiPerRighe(matricePerRighe, righe, colonne);
        UtilsMatrice.visualizza(matricePerRighe);

        System.out.println("Per colonne: ");
        riempiPerColonne(matricePerColonne, righe, colonne);
        UtilsMatrice.visualizza(matricePerColonne);
    }
}