// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.Scanner;
import java.util.Arrays;

public class EX4 {
    public static void main(String[] args) {
        
        int[] T1 = {1, 2, 3, 4, 6, 7, 8, 9};
        int[] T2 = {1, 2, 3, 4, 6, 7, 8, 9};
        int id = 0;
        
        if(T1.length == T2.length) {
            for (int i = 0; i < T1.length; i++) {
                if ( T1[i] == T2[i] ){
                    id++;
                }
            }
            if (id == T1.length){
                System.out.println("Tableaux Identiques !");
            }
        } else {
            System.out.println("Tableaux Non Identiques !");
        }
    }
}