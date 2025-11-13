// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        
        System.out.print("Donner les valeurs de A, B et C : ");
        double A = lire.nextDouble();
        double B = lire.nextDouble();
        double C = lire.nextDouble();
        
        lire.close();
        
        double X1, X2;
        double D;
        
       if (A == 0) {
            if (B == 0) {
                if (C == 0) {
                    System.out.println("R est solution");
                } else {
                    System.out.println("pas de solution");
                }
            } else {
                X1 = -C / B;
                System.out.println(X1);
            }
        } else {
            D = (B*B) - (4*A*C);
            if (D < 0) {
                System.out.println("pas de solution");
            } else {
                if (D == 0){
                    X1 = -B / (2*A);
                    System.out.println(X1);
                } else {
                    X1 = (-B + Math.sqrt(B)) / (2*A);
                    X2 = (-B - Math.sqrt(B)) / (2*A);
                    System.out.println(X1 + "," + X2);
                }
            }
        }
    }
}