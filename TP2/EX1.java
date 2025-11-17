// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;
import java.util.Arrays;

public class EX1 {
    public static void main(String[] args) {
    // 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int size = sc.nextInt();
        String tab[] = new String[size];

        System.out.println("Entrez les éléments du tableau (Strings) : ");
        for(int i=0; i < size; i++) {
            tab[i] = sc.next();
        }
        System.out.println("Les éléments du tableau " + Arrays.toString(tab));
        
    // 2
        System.out.println("Entrez la taille du tableau : ");
        int taille = sc.nextInt();
        int T[] = new int[taille];
        int P = 0;
        int N = 0;
        
        System.out.println("Entrez les elements du tableau (Numbers) : ");
        for(int i=0; i < taille; i++) {
            T[i] = sc.nextInt();
            if (T[i] >= 0){
                P++;
            } else {
                N++;
            }
        }
        
        sc.close();
        
        System.out.println("Le nombre des nombres positifs : " + P);
        System.out.println("Le nombre des nombres négatifs : " + N);
    }
}