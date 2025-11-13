// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        
        System.out.print("Donner les valeurs de a et b : ");
        int a = lire.nextInt();
        int b = lire.nextInt();
        
        lire.close();
        int r;
        
        while(b > 0){
            r = a % b;
            a = b;
            b = r;
        }
        
        System.out.println("PGCD est : " + a);
    }
}