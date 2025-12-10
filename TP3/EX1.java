// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.*;

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
    
    // 5
    static void produitMatriceVecteur(int[][] M, int[] V){
        int lignes = M.length;
        int colonnes = M[0].length;

        int[] R = new int[lignes];

        for (int i = 0; i < lignes; i++) {
            int S = 0;
            for (int j = 0; j < colonnes; j++) {
                S += M[i][j] * V[j];
            }
            R[i] = S;
        }
        
        for(int i=0; i < lignes; i++){
            System.out.print("|");
            System.out.print(R[i] + "\t");
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
                    V += (M[i][k] * N[k][i]);
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
    
    // 7
    static void MatriceCarreSysmetrie(int[][] M){
        int lignes = M.length;
        int colonnes = M[0].length;
        int Sym = 1;
        
        if(lignes == colonnes){
            for(int i=0; i<lignes; i++){
                for(int j=i+1; j<colonnes; j++){
                    if(M[i][j] == M[j][i]){
                        Sym++;
                    }
                }
            }
            
            if(Sym == lignes){
                System.out.println("Cette Matrice Carrée est Symétrique !");
            } else {
                System.out.println("Cette Matrice Carrée n'est pas Symétrique !");
            }

        } else {
            System.out.println("Cette Matrice Ni Carrée Ni Symétrique.");
        }
    }
    
    // 8
    static void tableMultiplication(){
        System.out.print("X*Y\t");
        for (int y = 0; y <= 10; y++) {
            System.out.print(y + "\t");
        }
        
        System.out.println("\n-------------------------------------------------------------------------------------");

        for (int x = 0; x <= 10; x++) {
            System.out.print(x + "\t");
            for (int y = 0; y <= 10; y++) {
                System.out.print(x * y + "\t");
            }
            System.out.println();
        }   
    
    }
    
    // 9
    static int plusGrandElement(int[][] M){
        int max = M[0][0];
        for(int i=0; i < M.length; i++){
            for(int j=0; j < M[0].length; j++){
                if(max < M[i][j]){
                    max = M[i][j];
                }
            }
        }
        return max;
    }
    
    // 10
    static void trianglePascal(int N){
        int[][] T = new int[N][N];
        
        for(int i=0; i < N; i++){
            for(int j=0; j <= i; j++){
                if( j == 0 || j == i){
                    T[i][j] = 1;
                } else{
                    T[i][j] = T[i-1][j-1] + T[i-1][j];
                }
                System.out.print(T[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    // 11
    static void carreMagique(int[][] C){        
        if(C.length == C[0].length){
            int N = C.length;
            int sommeDiag = 0;
            int sommeColonnes = 0;
            int egaux = 0;
            
            for(int i=0; i<N; i++){
                sommeDiag += C[i][i];
            }
            
            for(int i=0; i< N; i++){
                for(int j=0; j<N; j++){
                    sommeColonnes += C[j][i];
                }
                if(sommeColonnes == sommeDiag){
                    egaux++;
                    sommeColonnes = 0;
                }
            }
            
            if(egaux == N){
                System.out.println("YES");
            } else {
                System.out.println("NON");
            }
        } else {
            System.out.println("Pas Matrice Carre");
        }
    }
    
    public static void main(String[] args) {
        int[][] M = {
        {4, 9, 2},
        {3, 5, 7},
        {8, 1, 6}
        };
        
        int[][] N = {
        {10, 20, 30},
        {40, 50, 60},
        {70, 80, 90}
        };
        
        int[] V = {1, 1, 1, 1, 1};                
    }
}