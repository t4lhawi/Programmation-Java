// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.*;

public class EX1 {
    static int[][] moyenneur4(int[][] I){
        int h = I.length;
        int l = I[0].length;
        
        int[][] R = new int[h][l];

        for (int a = 0; a < h; a++) {
            for (int b = 0; b < l; b++) {
                int somme = I[a][b];
                int n = 1;

                if (a > 0) { 
                    somme += I[a-1][b]; 
                    n++; 
                }
                if (a < h-1) { 
                    somme += I[a+1][b]; 
                    n++; 
                }
                if (b > 0) { 
                    somme += I[a][b-1]; 
                    n++; 
                }
                if (b < l-1) { 
                    somme += I[a][b+1]; 
                    n++; 
                }

                R[a][b] = somme / n;
            }
        }
        return R;
    }
    
    static int[][] moyenneur8(int[][] I) {
        int h = I.length, l = I[0].length;
        int[][] R = new int[h][l];

        for (int a = 0; a < h; a++) {
            for (int b = 0; b < l; b++) {

                int somme = 0;
                int n = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int x = a + i;
                        int y = b + j;
                        if (x >= 0 && x < h && y >= 0 && y < l) {
                            somme += I[x][y];
                            n++;
                        }
                    }
                }
                R[a][b] = somme / n;
            }
        }
        return R;
    }
    
    static void afficher(int[][] M) {
        for (int[] row : M) {
            for (int v : row) System.out.print(v + " ");
                System.out.println();
            }
        }
    
    
    public static void main(String[] args) {

    int[][] I = {
        {10, 20, 30},
        {40, 50, 60},
        {70, 80, 90}
    };

    int[][] F4 = moyenneur4(I);
    System.out.println("Filtre Connexion 4 :");
    afficher(F4);
    
    
    int[][] F8 = moyenneur8(I);
    System.out.println("Filtre Connexion 8 :");
    afficher(F8);
    }
}