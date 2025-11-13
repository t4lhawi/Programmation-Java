// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        
        System.out.print("Entrer Un Nombre : ");
        int n = lire.nextInt();
        
        lire.close();
        int sommePositifs = 0;
        int sommePositifsPaires = 0;
        for (int i = 0; i <= n; i++){
            sommePositifs += i;
            if (i % 2 == 0){
                sommePositifsPaires += i;
            }
        }
        
        System.out.println("Somme des " + n + " Premeiers Nombres Positifs est : " + sommePositifs );
        System.out.println("Somme des " + n + " Premeiers Nombres Positifs Paires est : " + sommePositifsPaires );
    }
}
