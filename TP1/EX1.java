// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        
        System.out.print("Entrer Un Nombre : ");
        int x = lire.nextInt();
        
        lire.close();
        
        if (x >= 0) {
            System.out.println("|x| = " + x);
        } else {
            System.out.println("|x| = " + -x);
        }
    } 
}
