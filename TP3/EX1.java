// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;
import java.util.Arrays;

public class EX1 {
    
    // 1
    static void sommeMatrice(int[][] M){
        int S = 0;
        for(int i=0; i < M.length; i++){
            for(int j=0; j < M[0].length; j++){
                S += M[i][j];
            }
        }
        System.out.println("La somme des elements de matrice est : " + S);
    }
    
    // 2
    static void sommeLignesMatrice(int[][] M){
        int lignes = M.length;
    
        for (int i = 0; i < lignes; i++) {
            int sommeLigne = 0;
            int colonnes = M[i].length;
        
            for (int j = 0; j < colonnes; j++) {
                sommeLigne += M[i][j];
            }
            
            System.out.println("La somme de la ligne " + i + " est : " + sommeLigne);
        }
    }
    
    // 3
    static void sommeDiagonaleMatrice(int[][] M){
        int S = 0;
        for(int i=0; i < M.length; i++){
            S += M[i][i];
        }
        System.out.println("La somme de diagonale est : " + S);
    }
    
    // 4
    static void produitMatrice(int[][] M){
        int P = 1;
        for(int i=0; i < M.length; i++){
            for(int j=0; j < M[i].length; j++){
                P *= M[i][j];
            }
        }
        System.out.println("Le produit des elements de matrice est : " + P);
    }
    
    
    static void produitMatriceVecteur(int[][] M, int V[][]){
        int lignes = M.length;
        
        int[][] P = new int[lignes][colonnes];
        
        for(int i=0; i < lignes; i++){
            int S = 0;
            for(int j=0; j < 1; j++){

                P[i][j] = V;
            }
        }
        
        for(int i=0; i < P.length; i++){
            System.out.print("|");
            for(int j=0; j < P[0].length; j++){
                System.out.print(P[i][j] + ", \t");
            }
            System.out.print("|\n");
        }
    }
    
    // 6
    static void produitMatriciel(int[][] M, int[][] N){
        int lignes = M.length;
        int colonnes = N[0].length;
        
        int[][] P = new int[lignes][colonnes];
        
        for(int i=0; i < lignes; i++){
            int V = 0;
            for(int j=0; j < colonnes; j++){
                for(int k=0; k < N.length; k++){
                    V += (M[i][j] * N[j][i]);
                }
                P[i][j] = V;
            }
        }
        
        for(int i=0; i < P.length; i++){
            System.out.print("|");
            for(int j=0; j < P[0].length; j++){
                System.out.print(P[i][j] + ", \t");
            }
            System.out.print("|\n");
        }
    }
    
    
    
    
    public static void main(String[] args) {
        // Matrice 5*5
        int[][] M = 
        {{1,    2,      3,	    4,	    5},
        {6,	    7,	    8,	    9,	    10},
        {11,	12,	    13,	    14,	    15},
        {16,	17,	    18,	    19,	    20},
        {21,	22,	    23,	    24,	    25},
        };
        
        int[][] N = 
        {{1,	2,	    3,	    4,	    5},
        {6,	    7,	    8,	    9,	    10},
        {11,	12,	    13,	    14,	    15},
        {16,	17,	    18,	    19,	    20},
        {21,	22,	    23,	    24,	    25},
        };
    }
}