// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;

public class EX6 {
    // Fonction qui calcule la somme des diviseurs propres d'un nombre
    public static int sommeDiviseursPropres(int x) {
        int somme = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                somme += i;
            }
        }
        return somme;
    }
    
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        
        System.out.print("Donner les valeurs de A, B et C : ");
        int A = lire.nextInt();
        int B = lire.nextInt();
        int C = lire.nextInt();
        
        lire.close();
        
        int n = A + B;
        int m = B + C;
        
        // Calcul des sommes des diviseurs propres
        int sommeN = sommeDiviseursPropres(n);
        int sommeM = sommeDiviseursPropres(m);
        
        // Vérification
        if (sommeN == m && sommeM == n) {
            System.out.println("=> " + n + " et " + m + " sont des nombres amis !");
        } else {
            System.out.println("=> " + n + " et " + m + " ne sont pas des nombres amis.");
        }
    }
}