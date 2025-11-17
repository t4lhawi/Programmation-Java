// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;
import java.util.Arrays;

public class EX2 {
    public static void main(String[] args) {
    // 1
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez la taille du tableau : ");
        int taille = sc.nextInt();
        int T[] = new int[taille];
        int P = 0;
        int N = 0;
        
        System.out.println("Entrez les elements du tableau (Numbers) : ");
        for(int i=0; i < taille; i++) {
            T[i] = sc.nextInt();
            if (T[i] %2 == 0){
                P++;
            } else {
                N++;
            }
        }
        
        sc.close();
        
        int T1[] = new int[P];
        int T2[] = new int[N];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while ( (i < P || j < N) && k < taille) {
            if (T[k] % 2 == 0){
                T1[i] = T[k];
                i++;
            } else {
                T2[j] = T[k];
                j++;
            }
            k++;
        }
        
        System.out.println("les nombres pairs dans T " + Arrays.toString(T1));
        System.out.println("les nombres impairs dans T " + Arrays.toString(T2));
    }
}