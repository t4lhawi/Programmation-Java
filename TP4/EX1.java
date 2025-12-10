// Nom : Mohamed Talhaoui
// Filière : GSEIR3 (S1) | 2025/2026
import java.util.*;

public class EX1 {

    static void elementPetitGrand(int[] T){
        int N = T.length;
        for(int i=0; i<N; i++){
            int minIdx = i;
            for(int j=i + 1; j <N; j++){
                if(T[j] > T[minIdx]){ // pour decroisante on utilise <
                    minIdx = j;
                }
                int tmp = T[minIdx];
                T[minIdx] = T[i];
                T[i] = tmp;
            }
        }
        System.out.println("Plus Grand est : " + T[N-1]);
        System.out.println("Plus Petit est : " + T[0]);
    }
    
    static int[] inserer(int[] T, int x){
        int N = T.length + 1;
        T = new int[N];
        T[N-1] = x;
        for(int i=0; i<N; i++){
            int minIdx = i;
            for(int j=i + 1; j <N; j++){
                if(T[j] > T[minIdx]){ // pour decroisante on utilise <
                    minIdx = j;
                }
                int tmp = T[minIdx];
                T[minIdx] = T[i];
                T[i] = tmp;
            }
        }
        return T;
    }
    
    
    static void apparition(int[] T, int x){
        int a = 0;
        for(int i=0; i<T.length; i++){
            if(T[i] == x){
                a++;
            }
        }
        System.out.println(x + " apparaît " + a + "fois");
    }
    
    static void afficher(int[] T){
        System.out.print("[");
        for(int i=0; i<T.length; i++){
            System.out.print(T[i] + ", ");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        int[] T = {4, 8, 9, 7, 6};
        
        for(int i=0; i<5; i++){
            int minIdx = i;
            for(int j=i + 1; j <5; j++){
                if(T[j] < T[minIdx]){ // pour decroisante on utilise >
                    minIdx = j;
                }
                int tmp = T[minIdx];
                T[minIdx] = T[j];
                T[j] = tmp;
            }
        }
        
        afficher(T);
        elementPetitGrand(T);
       
        
        T = inserer(T, 5);
        afficher(T);
    }
}