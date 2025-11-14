// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;

public class EX7 {
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
        
        System.out.print("Donner la Valeur de p : ");
        int p = lire.nextInt();
        
        lire.close();
        
        // Calcul la somme des diviseurs propres
        int sommeP = sommeDiviseursPropres(p);
        
        // Vérification
        if (sommeP == 1) {
            System.out.println("=> " + p + " est un nombre premier !");
        } else {
            System.out.println("=> " + p + " n'est pas un nombre premier.");
        }
    }
}