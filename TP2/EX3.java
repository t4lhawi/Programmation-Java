// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;
import java.util.Arrays;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] T = {1, 2, 3, 4, 6, 7, 8, 9};
        int x;
        
        System.out.print("Entre Un Nombre : ");
        x = sc.nextInt();
        sc.close();

        int p=0;
        int tmp[] = new int[T.length + 1];
        for (int i = 0; i < T.length; i++) {
            if( T[i] <= x && T[i + 1] >= x ){
                p = i + 1;
            }
        }
        
        for (int i = 0; i < p; i++) {
            tmp[i] = T[i];
        }
        tmp[p] = x;
        for (int i = p + 1; i < tmp.length; i++) {
            tmp[i] = T[i - 1];
        }
        
        T = tmp;
       
        System.out.println("Tableau apres insertion : " + Arrays.toString(T));
    }
}