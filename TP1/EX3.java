// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        
        System.out.print("Entrer Un Nombre : ");
        int n = lire.nextInt();
        
        lire.close();
        int S = 0;
        for (int i = 0; i <= n; i++){
            S += (i*i);
        }
        
        System.out.println("Somme est : " + S );
    }
}