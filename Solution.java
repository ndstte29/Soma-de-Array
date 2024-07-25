import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, soma = 0;
        a = sc.nextInt();
        int[] ar = new int[a];
        
        for(int b = 0; b < ar.length; b ++){
            ar[b] = sc.nextInt();
        }
        for(int b = 0; b < ar.length; b ++){
            soma += ar[b];
        }
        System.out.println(soma);
    }
}
